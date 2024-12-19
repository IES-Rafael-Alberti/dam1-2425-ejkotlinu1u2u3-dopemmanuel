package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pregunte por consola el precio de un producto en euros con dos
decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.*/

fun precioEuros() {
    println("Ingrese el precio del producto en euros: ")
    var precio = readln().toDouble()

    val euros = precio.toInt()
    val centimos = (precio - euros) * 100

    println("El precio en euros es: $euros")
    println("El precio en céntimos es: $centimos")

}