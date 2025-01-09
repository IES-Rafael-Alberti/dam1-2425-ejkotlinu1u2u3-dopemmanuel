package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Solicitar al usuario que ingrese números enteros positivos y, por cada uno,
imprimir la suma de los dígitos que lo componen. La condición de corte es
que se ingrese el número -1. Al finalizar, mostrar cuántos de
los números ingresados por el usuario fueron números pares.*/

fun numerosPares() {
    var active = true
    var numeroPares = 0
    while (active) {
        try {
            println("Ingrese un número entero positivo: ")
            val numero = readln().trim()

            if (numero.contains('.')) {
                throw NumberFormatException("Debe ingresar un número entero positivo.")
            }
            val num = numero.toIntOrNull()

            if (num == null) {
                throw IllegalArgumentException("Debe ingresar un numero, no dejarlo en blanco.")
            }
            if (num == -1) {
                active = false
                println("El número de números pares es: $numeroPares")
            } else {
                val suma = numero.toCharArray().sumOf { it.digitToInt() }
                if (suma % 2 == 0) {
                    numeroPares++
                }
            }
        } catch (e: NumberFormatException) {
            println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}
fun indiciado18() {
    numerosPares()
}