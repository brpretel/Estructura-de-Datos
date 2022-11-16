package Taller_4

fun main(){
    println("Cuantos personas va a encuestar?")
    val reps = readLine()!!.toInt()
    var i = 0

    var consm_lic:String
    var personas_consumen_lic= 0
    var muj_menores=0
    var hom_no_agua_may = 0
    var tot_whisky = 0
    var edades_cerveza =0
    var licor=0
    var edad:Int
    var sexo: Int
    var porcentaje: Int
    var promedio:Int


    while (i != reps){
        println("Persona # ${i+1}, Consume licor (Si o No)?")
        consm_lic = readLine()!!.toString()
        if (consm_lic.equals("Si")|| consm_lic.equals("si")){
            personas_consumen_lic+=1
            println("Persona # ${i+1}, Licor prefereido (1- Aguardiante, 2-Ron, 3-Cerveza, 4-Tequila,5-Whisky, 6-Otro) ")
            licor = readLine()!!.toInt()
        }

        if (licor == 5){
            tot_whisky+=1
        }
        println("Persona # ${i+1}, Edad?")
        edad = readLine()!!.toInt()
        println("Persona # ${i+1}, Sexo(1-Masculino, 2-Femenino)?")
        sexo = readLine()!!.toInt()
        if(edad<18 && sexo==2){
            muj_menores+=1
        }
        if(licor!=1 && (edad>=20 && edad<=25)){
            hom_no_agua_may +=1
        }

        if (licor ==3){
            edades_cerveza+=edad
        }

        i++
    }

    porcentaje = (tot_whisky*100)/reps
    promedio = edades_cerveza/reps

    println("Total de personas encuestadas que consumen licor= ${personas_consumen_lic}")
    println("Total de mujeres menores de edad= ${muj_menores}")
    println("Total de hombres que no consumen aguardiente y que tienen entre 20 y 25 años de edad= ${hom_no_agua_may}")
    println("Promedio de edad de las personas que consumen cerveza= ${promedio} ")
    println("Porcentaje de personas que consumen whisky en relación con el total encuestado= ${porcentaje} ")
}