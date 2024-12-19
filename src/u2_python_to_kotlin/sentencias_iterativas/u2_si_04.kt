package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que pida al usuario un número entero positivo y
muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.*/

fun pedirnumeroEntero(): Int? {
    var active = true
    var numero: Int? = 0
    while (active) {
        println("Ingrese un número entero positivo: ")
        numero = readln().toIntOrNull()
        if (numero != null && numero > 0) {
            active = false
        } else {
            println("El número debe ser positivo")
        }
    }
    return numero
}

fun indiciado4() {
    val numero = pedirnumeroEntero()
    var contador = numero
    numero?.let {
        for (i in it downTo 1) {
            println("$i,")
            contador = contador!! - 1
        }
    }
}