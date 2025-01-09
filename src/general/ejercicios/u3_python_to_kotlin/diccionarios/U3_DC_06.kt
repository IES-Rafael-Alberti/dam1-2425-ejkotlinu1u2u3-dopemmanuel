package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios

/**Escribir un programa que cree un diccionario vacío y lo vaya llenado con información",
"sobre una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.)",
"que se le pida al usuario.\n Cada vez que se añada un nuevo dato debe imprimirse",
"el contenido del diccionario*/

fun dicted3() {
    val info = mutableMapOf<String, String>()
    var active = true
    while (active) {
        try {
            println("¿Cuál es el nombre de la persona? ")
            val nombre = readln().trim()

            if (nombre.isEmpty() || nombre.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un nombre.")
            }

            println("¿Cuál es su edad? ")
            var edad = readln().trim().toInt()

            if (edad < 0) {
                throw IllegalArgumentException("Debe ingresar una edad positiva.")
            }

            println("¿Cuál es su sexo? ")
            val sexo = readln().trim()

            if (sexo.isEmpty() || sexo.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un sexo.")
            }

            println("¿Cuál es su teléfono? ")
            val telefono = readln().trim()

            if (telefono.isEmpty() || telefono.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un teléfono.")
            }

            println("¿Cuál es su correo electrónico? ")
            val correo = readln().trim()

            if (correo.isEmpty() || correo.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un correo electrónico.")
            }

            info[nombre] = "$nombre es $edad años $sexo, su teléfono es $telefono y su correo electrónico es $correo"
            active = false
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una edad válida.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}