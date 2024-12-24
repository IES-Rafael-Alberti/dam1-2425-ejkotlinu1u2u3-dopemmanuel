package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año.
Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.*/

fun fechaNacimiento(){
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
    }
    else {
        println("Dia o mes incorrecto o fuera de rango")
        }

}