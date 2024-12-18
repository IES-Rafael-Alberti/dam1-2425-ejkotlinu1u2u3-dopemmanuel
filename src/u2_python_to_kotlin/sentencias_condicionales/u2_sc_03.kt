package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales
/**Escribir un programa que pida al usuario dos números y
muestre por pantalla su división. Si el divisor es cero
el programa debe mostrar un error.*/


fun pedirNumero(msj: String): Int {
    var numero: Int? = null
    do {
        println(msj)
        try {
            numero = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Lo introducido no es un número")
        }
    } while (numero == null)

    return numero
}

fun principal2() {
    println("Ingrese dos numeros: ")
    var active = false

    while (!active) {
    val numero1 = pedirNumero("Ingrese el primer numero: ")
    val numero2 = pedirNumero("Ingrese el segundo numero: ")

    if (numero2 == 0) {
        println("El numero 2 debe ser distinto de cero")
        return principal2()
        println("\n")
        }
        val resultado = numero1.toDouble() / numero2.toDouble()
        println("El resultado es: ${"%.2f".format(resultado)}")
        active = true

    }

}