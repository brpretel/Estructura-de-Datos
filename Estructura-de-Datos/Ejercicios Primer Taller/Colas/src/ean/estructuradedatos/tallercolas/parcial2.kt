package ean.estructuradedatos.tallercolas

class Poligono {
    private var n_lados: Int = 3
    private var tam_lados: Double = 0.0
    private var x: Double = 0.0
    private var y: Double = 0.0

    constructor()
    constructor(n_lados: Int, tam_lados: Double) {
        this.n_lados = n_lados
        this.tam_lados = tam_lados
    }

    constructor(n_lados: Int, tam_lados: Double,x:Double,y:Double) {
        this.n_lados = n_lados
        this.tam_lados = tam_lados
        this.x = x
        this.y = y
    }

    fun getnlados()=this.n_lados
    fun gettlados()=this.tam_lados
    fun getx()= this.x
    fun gety() = this.y

    fun nombre_poligono(n_lados: Int): String{
        var nombre = ""
        if (n_lados == 3){
            nombre = "triángulo"
        }else if (n_lados == 4){
            nombre = "cuadrado"
        }else if (n_lados == 5){
            nombre = "pentágono"
        }else if (n_lados == 6){
            nombre = "hexágono"
        }else if (n_lados == 7){
            nombre = "heptágono"
        }else if (n_lados == 8){
            nombre = "octágono"
        }else if (n_lados ==9 || n_lados>9){
            nombre = "otro"
        }
        return nombre
    }

    fun getPerímetro(n_lados: Int, tam_lados: Double):Int{
        var perimetro = 0
        var i = 1
        while(i<n_lados){
            perimetro+=tam_lados.toInt()
            i+=1
        }
        return perimetro
    }

    fun getÁrea(perimetro: Int = getPerímetro(n_lados,this.tam_lados)):Double{
        var area = (this.n_lados * Math.pow(perimetro.toDouble(),2.0))/4*Math.tan(Math.PI/this.n_lados)
        return area
    }

}

fun main(){
    var poli_1 = Poligono()
    var poli_2 = Poligono(8,6.0)
    var poli_3 = Poligono(10,8.0,1.6,-2.5)

    println(poli_1.nombre_poligono(poli_1.getnlados()))
    println(poli_2.nombre_poligono(poli_2.getnlados()))
    println(poli_3.nombre_poligono(poli_3.getnlados()))

    println(poli_1.getPerímetro(poli_1.getnlados(),poli_1.gettlados()))
    println(poli_2.getPerímetro(poli_2.getnlados(),poli_2.gettlados()))
    println(poli_3.getPerímetro(poli_3.getnlados(),poli_3.gettlados()))

    val perim1 = poli_1.getÁrea(poli_1.getPerímetro(poli_1.getnlados(),poli_1.gettlados()))
    val perim2 = poli_2.getÁrea(poli_2.getPerímetro(poli_2.getnlados(),poli_2.gettlados()))
    val perim3 = poli_3.getÁrea(poli_3.getPerímetro(poli_3.getnlados(),poli_3.gettlados()))

    println(perim1)
    println(perim2)
    println(perim3)

    var perims: MutableList<Double> = mutableListOf()
    perims.add(perim1)
    perims.add(perim2)
    perims.add(perim3)

    print(perims.max())

}
