package com.dam1.kotlinbasico.u2_python_to_kotlin.captura_excepciones


/**Escribir un programa que pida al usuario un número entero positivo y muestre por
 * pantalla todos los números impares desde 1 hasta ese número separados por comas.*/

fun comprobarNum(): Int {

    var active = false
    var numIn = 0
    while (!active) {
        try {
            var numero = readln().toString()?.trim()

            if ( numero == null || numero.isEmpty()) {
                throw IllegalArgumentException("El numero introducido no es correcto")
            }
            if (numero.contains(".")) {
                throw NumberFormatException("El numero introducido no debe ser decimal")
            }
            numIn = numero.toIntOrNull() ?: throw NumberFormatException("El numero introducido no es un número entero")

            if (numIn < 0) {
                throw IllegalArgumentException("El numero introducido debe ser positivo")
            }
            active = true
        } catch (e: NumberFormatException) {
            println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("ERR0R: ${e.message}")
        }
    }
    return numIn
}

fun numerosImpares(numIn: Int):  String {
    var numeros = ""
    for (i in 1..numIn) {
        if (i % 2 == 0) {
            numeros += "$i,"
        }
    }

    return numeros
}

fun inicial() {
    println("Escriba un número positivo: ")
    val numIn = comprobarNum()
    println("Los números impares son: ${numerosImpares(numIn)}")
}