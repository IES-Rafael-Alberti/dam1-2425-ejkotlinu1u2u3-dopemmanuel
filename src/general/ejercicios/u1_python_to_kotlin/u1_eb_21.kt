package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

/** Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.*/

fun fraseInvertida() {

    var active = true
    while (active) {
        try {
            println("Ingrese una frase: ")
            var frase = readln().toString()
            if (frase.isEmpty() || frase.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una frase no lo puedes dejar en blanco.")
            }

            println("\n")

            var fraseInvertida = frase.reversed()
            println("La frase invertida es: $fraseInvertida")
            active = false
        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un número válido que no sea de tipo string.")
        }
    }
}
