package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pida al usuario que introduzca una frase en la consola y una
 * vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.*/

fun vocalEnMayusculas() {
    println("Ingrese una frase: ")
    var frase = readln().toString()
    println("\n")

    println("Ingrese la vocal: ")
    var vocal = readln().toString().lowercase()
    println("\n")

    if (vocal in "aeiou") {
        var fraseA = frase.replace(vocal, vocal.uppercase())
        println("La frase con la vocal en mayúsculas es: $fraseA")
    }
    else {
        println("Error: La frase no tiene vocales")
        return vocalEnMayusculas()
    }
}