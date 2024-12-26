package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que pregunte al usuario su edad y muestre
por pantalla todos los años que ha cumplido (desde 1 hasta su edad).*/



fun indiciado2() {
    var edad = 0
    println("Ingrese su edad: ")
    edad = readln().toInt()
    for (i in 1..edad) {
        println("Año $i")
    }

}