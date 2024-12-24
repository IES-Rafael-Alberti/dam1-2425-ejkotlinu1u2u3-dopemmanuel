package com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos

/**Dado el conjunto de letras:

Vocales = {'a', 'e', 'i', 'o', 'u'}
Crea un conjunto Consonantes que contenga las letras del alfabeto que no son vocales.
Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto Vocales como en el conjunto Consonantes.
Estos ejercicios te ayudarán a practicar y comprender mejor cómo trabajar con conjuntos en Python. ¡Espero que te sean útiles!
Si tienes alguna pregunta o necesitas más ejercicios, no dudes en decírmelo.*/

fun starter6() {
    // Conjunto de vocales
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    // Conjunto de todas las letras del alfabeto
    val alfabeto = ('a'..'z').toSet()

    // Conjunto de consonantes
    val consonantes = alfabeto.subtract(vocales)

    // Letras comunes entre vocales y consonantes
    val letrasComunes = vocales.intersect(consonantes)

    // Imprimir resultados
    println("Consonantes: $consonantes")
    println("Letras comunes entre vocales y consonantes: $letrasComunes")
}