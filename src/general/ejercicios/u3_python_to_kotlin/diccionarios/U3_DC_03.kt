package com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios



/**Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla,
 * pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de
 * ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.

Fruta	Precio
Plátano	1.35
Manzana	0.80
Pera	0.85
Naranja	0.70
 */

fun dicted1() {
    val frutas = mapOf(
        "plátano" to 1.35,
        "manzana" to 0.80,
        "pera" to 0.85,
        "naranja" to 0.70
    )
    var active = true
    while (active) {
        try {
            println("¿Que fruta deseas llevar? ")
            val chosenFruit = readln().trim()

            if (chosenFruit.isEmpty() || chosenFruit.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una fruta.")
            }

            if (frutas.containsKey(chosenFruit)) {
                println("¿Cuántos kilos quieres llevar? ")
                var kilos = readln().trim().toDouble()

                if (kilos < 0) {
                    throw IllegalArgumentException("Debe ingresar un número positivo.")
                }
                val precio = kilos * frutas[chosenFruit]!!
                println("El precio de $kilos kilos de $chosenFruit es: $precio")
                active = false
            } else {
                println("La fruta no está en el diccionario.")
            }

        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una fruta válida.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}