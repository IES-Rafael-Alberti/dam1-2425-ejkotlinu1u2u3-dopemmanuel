package com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios

/**Escribir un programa que cree un diccionario de traducción español-inglés.
 * El usuario introducirá las palabras en español e inglés separadas por dos puntos,
 * y cada par <palabra>:<traducción> separados por comas. El programa debe crear
 * un diccionario con las palabras y sus traducciones. Después pedirá una frase en español
 * y utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está
 * en el diccionario debe dejarla sin traducir.*/

fun dicted5() {
    val diccionario = mutableMapOf<String, String>()
    var active = true
    while (active) {
        try {
            println("¿Cuál es la palabra en español? ")
            val palabra = readln().trim()

            if (palabra.isEmpty() || palabra.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una palabra.")
            }
            println("¿Cuál es la traducción en inglés? ")
            val traduccion = readln().trim()

            if (traduccion.isEmpty() || traduccion.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una traducción.")
            }
            println("¿Quieres añadir más palabras? ")
            val opcion = readln().trim()

            if (opcion.isEmpty() || opcion.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una opción.")
            }
            if (opcion == "no") {
                active = false
                continue
            }

            diccionario[palabra] = traduccion
            active = false

        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una palabra válida.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}