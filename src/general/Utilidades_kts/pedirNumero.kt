package com.dam1.kotlinbasico.general.utilidades_kts

fun pedirNumeroInt(msj: String): Int {
    var numero: Int? = null
    do {
        println(msj)
        try {
            numero = readln().toInt()
        } catch (_: NumberFormatException) {
            println("Lo introducido no es un número.")
        }
    } while (numero == null)

    return numero
}