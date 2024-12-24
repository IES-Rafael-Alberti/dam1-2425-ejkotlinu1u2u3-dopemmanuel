package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribe un programa que pida el importe final de un artículo y calcule e
 * imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).*/

fun pagarImporte() {
    val porciento = 10

    println("Ingrese el importe final: ")
    println("\n")
    var importefinal = readln().toDouble()

    var iva = importefinal * porciento / 100

    var ivaPagado = importefinal - iva

    println("El importe sin IVA es: $importefinal")
    println("El IVA pagado es: $iva")
    println("El importe final con IVA es: $ivaPagado")
}