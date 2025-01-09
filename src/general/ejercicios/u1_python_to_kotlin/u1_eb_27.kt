package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
/**Escribir un programa que pregunte el nombre de un producto, su precio y un número de unidades
y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos
enteros y 2 decimales, el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
 */

fun precioUnidad() {
    var active = true
    while (active) {
        try {
            println("¿Me dices el nombre del producto?:")
            println("\n")
            var producto = readln().toString()
            if (producto.isEmpty() || producto.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un producto obligatoriamente.")
            }

            println("¿Me dices su precio unitario?: ")
            println("\n")
            var precio = readln().trim()
            if (precio.isEmpty() || precio.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un precio obligatoriamente.")
            }

            var price = precio.toDouble()
            if (price <= 0) {
                throw IllegalArgumentException("El precio debe ser mayor a cero.")
            }

            println("¿Cuantas unidades quiere?: ")
            println("\n")
            var unidades = readln().trim()
            if (unidades.isEmpty() || unidades.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una unidad obligatoriamente.")
            }
            var num = unidades.toInt()
            if (num <= 0) {
                throw IllegalArgumentException("Debe ingresar una unidad positiva.")
            }

            var total = price * num

            println("$producto cuesta ${"%.2f".format(price)}€, por unidad que son $num serian unos ${"%.2f".format(total)} ")
            pause("continuar")
            println("\n")
            return ejerciciosU1()

        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un precio válido que no sea de tipo string.")
        }
    }

}