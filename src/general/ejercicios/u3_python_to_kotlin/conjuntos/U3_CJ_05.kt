package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos

/**Dado el conjunto de números enteros:

Numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Crea un conjunto pares que contenga los números pares del conjunto numeros.
Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres.*/

fun starter5() {
    // Conjunto inicial de números
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Conjunto de pares
    val pares = numeros.filter { it % 2 == 0 }.toSet()

    // Conjunto de múltiplos de tres
    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()

    // Intersección de pares y múltiplos de tres
    val paresYMultiplosDeTres = pares.intersect(multiplosDeTres)

    // Imprimir resultados
    println("Pares: $pares")
    println("Múltiplos de tres: $multiplosDeTres")
    println("Pares y múltiplos de tres: $paresYMultiplosDeTres")
}