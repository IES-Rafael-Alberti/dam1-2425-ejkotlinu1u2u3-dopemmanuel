package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas

/**Escribir un programa que pregunte al usuario los números",
"ganadores de la lotería primitiva, los almacene en una lista y los muestre",
"por pantalla Ordenados de menor a mayor.*/

fun listas1() {
    var active = true
    while (active) {
        try {
            println("Ingrese los números de la lotería: ")
            val numeros = readln().trim().split(" ").map { it.toInt() }

            if (numeros.isEmpty()) {
                throw IllegalArgumentException("Debe ingresar al menos un número.")
            }

            println("Los números ingresados son: $numeros")
            val ganadores = numeros.sortedDescending()
            println("Los ganadores de la lotería son: $ganadores")
            active = false

        } catch (_: NumberFormatException) {
            println("Debe ingresar un número válido.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}