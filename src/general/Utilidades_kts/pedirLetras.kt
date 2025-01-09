package com.dam1.kotlinbasico.general.utilidades_kts

fun pedirLetraSting(msj: String): String {
    var letra: String? = null
    do {
        println(msj)
        try {
            letra = readln().toString()
        } catch (_: NumberFormatException) {
            println("Lo introducido no es una cadena de letras.")
        }
    } while (letra == null)

    return letra
}