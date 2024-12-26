package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Escribir un programa que pida al usuario un número entero
y muestre por pantalla un triángulo rectángulo como el de más abajo.

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
 */


fun pedirNum(): Int {
    var numero: Int? = null
    while (numero == null) {
        try {
            println("Ingrese un número entero positivo: ")
            val input = readLine()?.trim()

            if (input.isNullOrEmpty()) {
                throw IllegalArgumentException("Debe ingresar un número.")
            }

            // Convertir a Int y validar
            numero = input.toInt()

            if (numero <= 0) {
                throw IllegalArgumentException("El número debe ser positivo.")
            }
        } catch (_: NumberFormatException) {
            println("ERROR: Debe ingresar un número válido.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
    return numero
}

fun indiciado8() {
    val num = pedirNum()

    for (i in 1..num) {
        var linea = ""
        var valor = 2 * i - 1
        while (valor >= 1) {
            linea += "$valor "
            valor -= 2
        }
        println(linea.trim())
    }
}