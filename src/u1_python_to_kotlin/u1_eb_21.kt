
package com.dam1.kotlinbasico.u1_python_to_kotlin
/** Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.*/

fun fraseInvertida() {
    println("Ingrese una frase: ")
    var frase = readln().toString()
    println("\n")

    var fraseInvertida = frase.reversed()
    println("La frase invertida es: $fraseInvertida")
}
