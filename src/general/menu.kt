package com.dam1.kotlinbasico.general

import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
import com.dam1.kotlinbasico.general.utilidades_kts.pause

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
                println("Entrando a los ejercicios de la Unidad 1...")
                Thread.sleep(3000)
                limpiarConsola()
                ejerciciosU1()
            }
            2 -> {
                println("Entrando a los ejercicios de la Unidad 2...")
                Thread.sleep(4000)
                limpiarConsola()
                ejerciciosU2()
            }
            3 -> {
                println("Entrando a los ejercicios de la Unidad 3...")
                Thread.sleep(5000)
                limpiarConsola()
                ejerciciosU3()
            }
            4 -> {
                println("\n")
                println("Re-creado por: Emmanuel")
                println("Fecha de creación: 2024-12-16\nFecha de finalizacion: 2024-12-24")
                pause("continuar")
                println("\n")
                limpiarConsola()
            }
            5 -> {
                println("Saliendo del programa...")
                active = false
            }
            else -> {
                println("\n")
                println("Opción no válida, intenta nuevamente.")
                Thread.sleep(2000)
                println("\n")
                limpiarConsola()

            }
        }
    }
}