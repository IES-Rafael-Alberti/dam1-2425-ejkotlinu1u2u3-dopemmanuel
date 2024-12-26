package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que muestre el eco de lo que el usuario
introduzca hasta que el usuario escriba “salir” que terminará.*/

fun pedirEco(): String {
    var active = true
    while (active) {
        try {
            println("Ingrese una palabra para hacer eco: ")
            val word = readln().trim()

            if (word.isEmpty()) {
                throw IllegalArgumentException("Debe ingresar una palabra.")
            }

            if (word == "salir") {
                active = false
                return word
            }

            // Validar el eco
            if (word.toDoubleOrNull() == null) {
                throw IllegalArgumentException("Debe ingresar un eco válido.")
            }

            return word
        } catch (_: NumberFormatException) {
            println("ERROR: Debe ingresar un eco válido.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
    return ""
}

fun indiciado13() {
    val eco = pedirEco()
    println("El eco es: $eco")
}