package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades
y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos
enteros y 2 decimales, el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.
 */

fun precioUnidad() {
    println("¿Me dices el nombre del producto?:")
    println("\n")
    var producto = readln().toString()

    println("¿Me dices su precio unitario?: ")
    println("\n")
    var precio = readln().toFloat()

    println("¿Cuantas unidades quiere?: ")
    println("\n")
    var unidades = readln().toInt()

    var total = precio * unidades

    println("$producto cuesta ${"%.2f".format(precio)}€, por unidad que son $unidades serian unos ${"%.2f".format(total)} ")

}