package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y
muestre por pantalla cada uno de los productos en una línea distinta.*/

fun productoCesta() {
    println("Ingrese los productos de su cesta de compras: ")
    var prodCesta = readln().toString()

    println("\n")
    println("Productos en la cesta de la compra: ")

    for (productos in prodCesta){
        println("- $productos")
    }

}