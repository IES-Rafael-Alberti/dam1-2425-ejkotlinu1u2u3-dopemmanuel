package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin
/**Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año.
Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.*/

fun fechaNacimiento(){

    var active = true
    while (active) {
        try {
            println("Ingrese la fecha de nacimiento: ")
            var fecha = readln().toString().split("/")

            if (fecha.size != 3) {
                println("Error: La fecha no es correcta")
                return fechaNacimiento()}

            var dia = fecha[0]
            var mes = fecha[1]
            var anio = fecha[2]

            var diaInt = dia.toInt()
            var mesInt = mes.toInt()
            var anioInt = anio.toInt()


            if (diaInt in 1..31 && mesInt in 1..12) {
                println("Fecha de nacimiento correcta!!")
                println("\n")
                println("La fecha de nacimiento es: $diaInt/$mesInt/$anioInt")
                active = false
            }
            else {
                println("Dia o mes incorrecto o fuera de rango")
                println("\n")
                println("Queres volver a ingresar la fecha de nacimiento?")
                val opcion = readln().trim()
                if (opcion == "si" || opcion == "sí" || opcion == "yes" || opcion == "y" || opcion == "s") {
                    fechaNacimiento()
                }else {
                    active = false
                }
            }
        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
    }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un número válido que no sea de tipo string.")
        }
    }
}