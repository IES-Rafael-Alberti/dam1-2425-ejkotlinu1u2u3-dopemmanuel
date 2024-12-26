package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin
/**Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y
muestre por pantalla cada uno de los productos en una línea distinta.*/

fun productoCesta() {

    var active = true
    while (active) {
        try {
            println("Ingrese los productos de su cesta de compras: ")
            var prodCesta = readln().toString()
            if (prodCesta.isEmpty() || prodCesta.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un producto obligatoriamente.")
            }
            println("\n")
            println("Productos en la cesta de la compra: \n")
            for (productos in prodCesta){
                println("- $productos")
            }
        }catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un producto válido que no sea de tipo string.")
        }
    }

}