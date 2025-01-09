package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
/**Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34,
y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con
este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.*/

fun numeroTelefono() {

    var active = true
    while (active) {
        try {
            println("Ingrese el número de teléfono: ")
            var numero = readln().toString()
            if (numero.isEmpty() || numero.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un número no lo puedes dejar en blanco.")
            }
            val prefijo = numero.substring(0, 3)
            val numeroSinPrefijo = numero.substring(3, numero.length)

            println("El prefijo del número de teléfono es: $prefijo")
            println("El número de teléfono sin prefijo es: $numeroSinPrefijo")
            active = false
            pause("continuar")
            println("\n")
            return ejerciciosU1()

        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un número válido que no sea de tipo string.")
        }
    }
}