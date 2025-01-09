package com.dam1.kotlinbasico.general.utilidades_kts

fun pedirNumeroFloat(msj: String): Float {
    var flotante: Float? = null
    do {
        println(msj)
        try {
            flotante = readln().toFloat()
        } catch (_: NumberFormatException) {
            println("Lo introducido no es un decimal.")
        }
    } while (flotante == null)

    return flotante
}