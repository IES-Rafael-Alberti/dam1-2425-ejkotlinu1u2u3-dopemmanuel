package com.dam1.kotlinbasico.general

import com.dam1.kotlinbasico.introducional_kts.limpiarConsola

fun menu() {
    var active = true

    while (active) {
        println("\nMenu")
        println("1. Ejercicios de la Unidad 1")
        println("2. Ejercicios de la Unidad 2")
        println("3. Ejercicios de la Unidad 3")
        println("4. Acerca de")
        println("5. Salir")
        print("Elige una opción: ")
        val option = readln().toIntOrNull()

        when (option) {
            1 -> {
                ejerciciosU1()
                limpiarConsola()
            }
            2 -> {
                ejerciciosU2()
                limpiarConsola()
            }
            3 -> {
                ejerciciosU3()
                limpiarConsola()
            }
            4 -> {
                println("Re-creado por: Emmanuel")
                println("Fecha de creación: 2024-12-16\nFecha de finalizacion: 2024-12-24")
            }
            5 -> {
                println("Saliendo del programa...")
                active = false
            }
            else -> {
                println("Opción no válida, intenta nuevamente.")
            }
        }
    }
}