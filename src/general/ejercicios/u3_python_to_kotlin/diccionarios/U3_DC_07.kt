package com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios

/**Escribir un programa que cree un diccionario simulando una cesta de la compra.
 * El programa debe preguntar el artículo y su precio y añadir el par al diccionario,
 * hasta que el usuario decida terminar. Después se debe mostrar por pantalla la lista de
 * la compra y el coste total, con el siguiente formato

Lista de la compra
Artículo 1	Precio
Artículo 2	Precio
Artículo 3	Precio
…	…
Total	Coste
 */

fun dicted4() {
    val cesta = mutableMapOf<String, Double>()
    var active = true
    while (active) {
        try {
            println("¿Cuál es el artículo? ")
            val art = readln().trim()

            if (art.isEmpty() || art.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un artículo.")
            }

            println("¿Cuál es el precio? ")
            var precio = readln().trim().toDouble()

            if (precio < 0) {
                throw IllegalArgumentException("Debe ingresar un precio positivo.")
            }
            println("¿Quieres añadir más artículos? ")
            val opcion = readln().trim()

            if (opcion.isEmpty() || opcion.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una opción.")
            }

            if (opcion == "no") {
                active = false
                continue
            }
            cesta[art] = precio
            active = false
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un precio válido.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}