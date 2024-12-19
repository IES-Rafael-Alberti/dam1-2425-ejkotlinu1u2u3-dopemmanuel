package com.dam1.kotlinbasico.u1_python_to_kotlin
// import kotlin.math.round
/**magina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses,
que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que
comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa
debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.*/

fun depositoAhorros() {
    val cuenta = 0.04

    println("Ingrese la cantidad de dinero depositado: ")
    var dinero = readln().toDouble()

    for (anios in 1..3) {
        dinero *= 1 + cuenta
        println("El ahorro tras $anios años es: ${"%.2f".format(dinero)}")
    }
}