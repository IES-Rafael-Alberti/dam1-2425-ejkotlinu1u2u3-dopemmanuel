package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/** Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10. */

fun pedirNumeroMultiplicar(): Double {
    while (true) {
        try {
            print("Ingrese un número positivo: → ")
            val input = readln().trim()

            // Convertir a Double o Int según el caso
            val numero = if (input.contains(".")) input.toDouble() else input.toInt().toDouble()

            if (numero < 0) {
                throw IllegalArgumentException("ERROR: El número debe ser positivo.")
            }

            return numero
        } catch (_: NumberFormatException) {
            println("ERROR: Lo ingresado no es un número válido.")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

fun calcularTablaMultiplicar(num: Double) {
    // Mostrar la tabla de multiplicar del 1 al 10
    for (i in 1..10) {
        val resultado = num * i
        println("${"%.2f".format(num)} x $i = ${"%.2f".format(resultado)}")
    }
}

fun indiciado7() {
    val numero = pedirNumeroMultiplicar()
    calcularTablaMultiplicar(numero)
}
