package com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos

/**El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.

Por ejemplo, el conjunto potencia de {1,2,3} es:

{∅, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}}
Escriba la función conjunto_potencia(s) que reciba como parámetro un conjunto cualquiera s y retorne su «lista potencia» (la lista de todos sus subconjuntos):

>>> conjunto_potencia({6, 1, 4})
[set(), set([6]), set([1]), set([4]), set([6, 1]), set([6, 4]), set([1, 4]), set([6, 1, 4])]*/

fun conjuntoPotencia(s: Set<Int>): List<Set<Int>> {
    val potencia = mutableListOf<Set<Int>>()
    val elementos = s.toList()
    val n = elementos.size
    val totalSubconjuntos = (1 shl n) // 2^n

    for (mask in 0 until totalSubconjuntos) {
        val subconjunto = mutableSetOf<Int>()
        for (bit in 0 until n) {
            if (mask and (1 shl bit) != 0) {
                subconjunto.add(elementos[bit])
            }
        }
        potencia.add(subconjunto)
    }

    return potencia
}

fun starter3() {
    val conjunto = setOf(6, 1, 4)
    val potencia = conjuntoPotencia(conjunto)
    println(potencia)
}
