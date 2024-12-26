package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

/**Escribe un programa que le pida al usuario una temperatura en grados Celsius,
la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.*/

fun grados() {
    var active = true
    while (active) {
        try {
            println("Ingrese la temperatura en grados Celsius: ")
            val celsius = readln().trim()

            if (celsius.isEmpty() || celsius.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una temperatura obligatoriamente.")
            }
            val celsius2 = celsius.toDouble()

            val fahrenheit = (celsius2 * 9/5) + 32
            println("La temperatura en grados Fahrenheit es: $fahrenheit")
            active = false
        } catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una temperatura válida que no sea de tipo string.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }

}