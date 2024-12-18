package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34,
y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con
este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.*/

fun numeroTelefono() {
    println("Ingrese el número de teléfono: ")
    var numero = readln().toString()

    val prefijo = numero.substring(0, 3)
    val numeroSinPrefijo = numero.substring(3, numero.length)

    println("El prefijo del número de teléfono es: $prefijo")
    println("El número de teléfono sin prefijo es: $numeroSinPrefijo")

}
