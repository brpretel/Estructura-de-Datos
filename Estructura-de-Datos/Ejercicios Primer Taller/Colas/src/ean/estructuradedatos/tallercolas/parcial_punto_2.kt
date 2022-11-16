package ean.estructuradedatos.tallercolas


class Clientes {/*Clase del usuario*/
    private var sexo: String = ""
    private var edad: Int = 0
    private var embarazo: String = ""
    private var tipoTransaccion: String = ""

    constructor()
    constructor(sexo: String, edad: Int, embarazo: String, tipoTransaccion: String) {
        this.sexo = sexo
        this.edad = edad
        this.embarazo = embarazo
        this.tipoTransaccion = tipoTransaccion
    }

    fun getsexo() = this.sexo
    fun getedad() = this.edad
    fun getembarazo() = this.embarazo
    fun gettipoTransaccion() = this.tipoTransaccion

    fun setsexo(nuevo_sexo: String) {
        if (nuevo_sexo != "") {
            this.sexo = nuevo_sexo
        }
    }

    fun setedad(nuevo_edad: Int) {
        if (nuevo_edad != 0) {
            this.edad = nuevo_edad
        }
    }

    fun setembarazo(nuevo_embarazo: String) {
        if (nuevo_embarazo != "") {
            this.embarazo = nuevo_embarazo
        }
    }

    fun settipoTransaccion(nuevo_tipoTransaccion: String) {
        if (nuevo_tipoTransaccion != "") {
            this.tipoTransaccion = nuevo_tipoTransaccion
        }
    }

    fun getTiempoTransaccion(): Int {
        var tiempo = 0
        if (tipoTransaccion == "RETIRO" &&edad>80) {
            tiempo = 3
        }
        if (tipoTransaccion == "CONSIGNACION" || tipoTransaccion == "PAGO" &&edad>80) {
            tiempo = 4
        }
        if (edad >65 && edad <=80){
            tiempo = tiempo +3
            for (i in 65 .. edad){
                tiempo ++
            }
        }
        if (edad >80){
            if (tipoTransaccion == "CONSIGNACION") {
                tiempo = 8
            }
            if (tipoTransaccion == "PAGO") {
                tiempo = 6
            }
        }
        return tiempo
    }
}

class cajero { /*Clase cajero*/
    private var numero =0
    private var tiempoGastado: Int = 0
    private var clientes: Int = 0

    constructor()
    constructor(numero : Int, tiempoGastado :Int, clientes: Int){
        this.numero = numero
        this.tiempoGastado = tiempoGastado
        this.clientes = clientes
    }
    fun getnumero () =this.numero
    fun gettiempoGastado () = this.tiempoGastado
    fun getclientes () = this.clientes

    fun setnumero(nuevo_numero: Int) {
        if (nuevo_numero != 0) {
            this.numero = nuevo_numero
        }
    }
    fun settiempoGastado(nuevo_tiempoGastado: Int) {
        if (nuevo_tiempoGastado != 0) {
            this.tiempoGastado = nuevo_tiempoGastado
        }
    }
    fun setclientes(nuevo_clientes: Int) {
        if (nuevo_clientes != 0) {
            this.clientes = nuevo_clientes
        }
    }

    fun atenderCliente () {
        var c = Clientes()
        clientes ++
        tiempoGastado = tiempoGastado + c.getTiempoTransaccion()
    }
}