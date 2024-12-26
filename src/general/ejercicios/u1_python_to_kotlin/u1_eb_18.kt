package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

/**Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre
por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas,
otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula.
El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.*/

fun repetirNombre() {
    var active = true
    while (active) {
        try {
            println("Ingrese su nombre completo: ")
            var nombre = readln().toString()
            if (nombre.isEmpty() || nombre.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un nombre no lo puedes dejar en blanco.")
            }
            println("\n")
            println("Cuantas veces quiere que se repita el nombre?")
            var repetir = readln().trim()
            if (repetir.isEmpty() || repetir.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un número.")
            }
            val repeat = repetir.toInt()
            if (repeat < 0) {
                throw IllegalArgumentException("Debe ingresar un número positivo.")
            }
            println("\n")
            for ( i in 1..repeat) {
                println("${nombre.uppercase()} \n${nombre.lowercase()}")
                active = false
            }
        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un número válido que no sea de tipo string.")
        }
    }
}