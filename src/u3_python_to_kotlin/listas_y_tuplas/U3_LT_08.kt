package com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas

/**Escribir un programa que pida al usuario una palabra y muestre por
 * pantalla si es un palíndromo.*/
fun palidroma() {
    var active = true
    while (active) {
        try {
            println("Ingrese una palabra para hacer eco: ")
            val word = readln().trim().lowercase()

            if (word.isEmpty()) {
                throw IllegalArgumentException("Debe ingresar una palabra.")
            }
            if (word.toCharArray().sorted().joinToString("") == word) {
                println("La palabra es un palíndromo.")
                active = false
            } else {
                println("La palabra no es un palíndromo.")
            }
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}


fun listas3() {
    palidroma()
}