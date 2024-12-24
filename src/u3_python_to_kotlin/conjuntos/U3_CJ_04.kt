package com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos

/**Dadas las siguientes listas:

frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]
Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.
Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto llamado frutas_comunes.
Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un conjunto llamado frutas_solo_en_frutas1.
Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un conjunto llamado frutas_solo_en_frutas2.*/

fun starter4() {
    // Listas de frutas
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")

    // Conjuntos de frutas
    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()

    // Frutas comunes en ambos conjuntos
    val frutasComunes = setFrutas1.intersect(setFrutas2)

    // Frutas solo en frutas1
    val frutasSoloEnFrutas1 = setFrutas1.subtract(setFrutas2)

    // Frutas solo en frutas2
    val frutasSoloEnFrutas2 = setFrutas2.subtract(setFrutas1)

    // Imprimir resultados
    println("Frutas comunes: $frutasComunes")
    println("Frutas solo en frutas1: $frutasSoloEnFrutas1")
    println("Frutas solo en frutas2: $frutasSoloEnFrutas2")
}