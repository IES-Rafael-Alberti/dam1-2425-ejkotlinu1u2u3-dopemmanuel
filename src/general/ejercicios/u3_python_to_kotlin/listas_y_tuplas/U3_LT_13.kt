package com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas

import kotlin.math.pow
import kotlin.math.sqrt

/**Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en una lista y
 * muestre por pantalla su media y desviación típica.*/

fun muestra(): List<Double> {
    val muestra = mutableListOf<Double>()
    println("Ingrese la muestra de números: ")
    println("\n")
    print("Elige una opción: ")
    val opcion = readln().toIntOrNull()
    when (opcion) {
        1 -> muestra.add(1.0)
        2 -> muestra.add(2.0)
        3 -> muestra.add(3.0)
        4 -> muestra.add(4.0)
        5 -> muestra.add(5.0)
        6 -> muestra.add(6.0)
        else -> throw IllegalArgumentException("Opción no válida, intenta nuevamente.")
    }
    return muestra
}
fun calcularMedia(muestra: List<Double>): Double {
    var media = 0.0
    for (numero in muestra) {
        media += numero
    }
    return media / muestra.size
}
fun calcularDesviacion(muestra: List<Double>): Double {
    var desviacion = 0.0
    val media = calcularMedia(muestra)
    for (numero in muestra) {
        desviacion += (numero - media).pow(2.0)
    }
    return sqrt(desviacion / muestra.size)
}

fun listas6() {
    var active = true
    while (active) {
        try {
            val muestra = muestra()
            val media = calcularMedia(muestra)
            val desviacion = calcularDesviacion(muestra)
            println("La media es: $media")
            println("La desviación típica es: $desviacion")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}