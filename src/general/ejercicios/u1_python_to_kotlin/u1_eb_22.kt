package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
/**Escribir un programa que pida al usuario que introduzca una frase en la consola y una
 * vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.*/

fun vocalEnMayusculas() {

    var active = true
    while (active) {
        try {
            println("Ingrese una frase: ")
            var frase = readln().toString()
            if (frase.isEmpty() || frase.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una frase no lo puedes dejar en blanco.")
            }
            println("\n")

            println("Ingrese la vocal que desea encontrar en la frase: ")
            var vocal = readln().toString().lowercase()
            if (vocal.isEmpty() || vocal.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una vocal no lo puedes dejar en blanco.")
            }
            println("\n")

            if (vocal in "aeiou") {
                val fraseA = frase.replace(vocal, vocal.uppercase())
                println("La frase $frase con la vocal en mayúsculas es: $fraseA")
                active = false
            } else {
                println("La frase no tiene vocales")
                active = false
            }
            pause("continuar")
            println("\n")
            return ejerciciosU1()
        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}