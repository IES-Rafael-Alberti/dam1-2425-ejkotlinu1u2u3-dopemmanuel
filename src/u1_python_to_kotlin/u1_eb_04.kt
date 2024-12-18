package com.dam1.kotlinbasico.u1_python_to_kotlin

/**Escribe un programa que le pida al usuario una temperatura en grados Celsius,
la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.*/

fun grados() {
    println("Ingrese la temperatura en grados Celsius: ")
    val celsius = readln().toDouble()
    val fahrenheit = (celsius * 9/5) + 32
    println("La temperatura en grados Fahrenheit es: $fahrenheit")
}