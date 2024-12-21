package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que pida al usuario un número entero
y muestre por pantalla si es un número primo o no.

Primo: El número es divisible entre todos los números de 1 a el mismo número menos uno.

No es primo: El número no es divisible entre ningún número entre 1 y el mismo número menos uno.
 */

fun pedirNumeroPrimo(): Int? {
    var active = true
    while (active) {
        try {
            println("Ingrese un número entero positivo: ")
            val input = readln().trim()

            if (input.isEmpty()) {
                return null
                active = false
            }
            val numero = input.toInt()

            active = false
            return numero

        } catch (_: NumberFormatException) {
            println("ERROR: Lo ingresado no es un número válido.")
        }
    }
    return null
}

fun trazarPrimo(numero: Int) {
    for (i in 2..numero) {
        if (numero % i == 0) {
            print("$numero NO ES PRIMO")
            return
        }
    }
    println("$numero ES PRIMO")
}

fun indiciado10() {
    val numero = pedirNumeroPrimo()
    numero?.let {
        trazarPrimo(numero)
    }
}

