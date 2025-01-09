package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
/**Escribir un programa que pregunte por consola el precio de un producto en euros con dos
decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.*/

fun precioEuros() {
    var active = true
    while (active) {
        try {
            println("Ingrese el precio del producto en euros: ")
            var precio = readln().trim()
            if (precio.isEmpty() || precio.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un precio obligatoriamente.")
            }
            var price = precio.toDouble()
            if (price <= 0) {
                throw IllegalArgumentException("El precio debe ser mayor a cero.")
            }
            val euros = precio.toInt()
            val centimos = (price - euros) * 100
            println("El precio en euros es: $euros")
            println("El precio en céntimos es: $centimos")
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