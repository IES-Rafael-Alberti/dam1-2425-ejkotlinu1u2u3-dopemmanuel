package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
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
            val fraseInvertida = frase.reversed()
            println("La frase invertida es: $fraseInvertida")
            active = false
            pause("continuar")
            println("\n")
            return ejerciciosU1()

        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}
