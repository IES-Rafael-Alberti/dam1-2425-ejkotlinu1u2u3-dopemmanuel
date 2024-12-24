package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que pida al usuario un número entero y muestre por pantalla
un triángulo rectángulo como el de más abajo, de altura el número introducido.

 *
 **
 ***
 ****
 *****

Modo simple:

{
print("*\n"),
print("* *\n"),
print("* * *\n"),
print("* * * *\n"),
print("* * * * *\n"),
}
 */

fun pedirNumero(): Int? {
    var active = true
    while (active) {
        try {
            println("Ingrese un número entero positivo: ")
            val input = readln().trim()

            if (input.isEmpty()) {
                return null
                active = false
            }
            val numero = input.toInt()

            if (numero < 0) {
                throw NumberFormatException("El número debe ser positivo")
            }
            active = false
            return numero

        } catch (_: NumberFormatException) {
            println("ERROR: Lo ingresado no es un número válido.")
        }
    }
    return null
}
fun trazarTriangulo(numero: Int) {
    for (i in 1..numero) {
        print("*".repeat(i))
    }
    println()
}
fun indiciado6() {
    val numero = pedirNumero()
    numero?.let {
        trazarTriangulo(numero)
    }
}