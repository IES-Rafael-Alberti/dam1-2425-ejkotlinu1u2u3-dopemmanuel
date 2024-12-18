package com.dam1.kotlinbasico.u1_python_to_kotlin

import kotlin.math.round
//import kotlin.math.pow

/**Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal
y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa
corporal calculado redondeado con dos decimales.*/

fun pedirPesoyEstatura() {
    println("Ingrese su peso (en kg): ")
    var peso = readln().toFloat()
    println("Ingrese su estatura (en metros): ")
    var estatura = readln().toFloat()

    if (peso < 0) {
        println("El valor de peso debe ser mayor o igual a 0")
    }

    else if (estatura <= 0) {
        println("El valor de estatura debe ser mayor o igual a 0")
    }
    else {
        val imc = peso / (estatura * 2)
        println("Tu índice de masa corporal es: ${round(imc)}.")

    }
}