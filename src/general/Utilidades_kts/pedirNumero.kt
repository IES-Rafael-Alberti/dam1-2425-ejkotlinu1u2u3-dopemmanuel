package com.dam1.kotlinbasico.general.Utilidades_kts

fun pedirNumero(msj: String): Int {
    var numero: Int? = null
    do {
        println(msj)
        try {
            numero = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Lo introducido no es un número")
        }
    } while (numero == null)

    return numero
}