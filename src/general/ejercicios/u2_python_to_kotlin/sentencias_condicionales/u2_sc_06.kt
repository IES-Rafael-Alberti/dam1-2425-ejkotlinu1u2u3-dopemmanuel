package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales
/**Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre.
El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre
posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario
su nombre y sexo, y muestre por pantalla el grupo que le corresponde. */

fun principal3() {
    var active = true
    while (active) {
        try {
            println("Ingrese su nombre: ")
            var nombre = readln().toString().lowercase()
            if (nombre.isEmpty() || nombre.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un nombre.")
            }

            println("Ingrese su sexo: ")
            var sexo = readln().toString().lowercase()
            if (sexo.isEmpty() || sexo.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un sexo.")
            }

            if (sexo == "m" && nombre.contains("a")) {
                println("El grupo A")
                active = false
            } else if (sexo == "m" && nombre.contains("n")) {
                println("El grupo B")
                active = false
            } else if (sexo == "f" && nombre.contains("a")) {
                println("El grupo B")
                active = false
            } else if (sexo == "f" && nombre.contains("n")) {
                println("El grupo A")
                active = false
            } else {
                println("El grupo no existe")
            }
        }catch (e: IllegalArgumentException) {
            println("ERR0R: ${e.message}")
        }
    }
}