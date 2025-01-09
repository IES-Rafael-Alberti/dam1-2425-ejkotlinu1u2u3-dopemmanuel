package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
/**Escribir un programa que pida al usuario un número entero positivo
y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
Deberá solicitar el número hasta introducir uno correcto.*/

fun numeroEntero(numEn: Int): String {
    var numeros = ""
    for (i in numEn downTo 0) {
        numeros += "$i,"
    }

    return numeros

}

fun inicial2() {

    var active = true
    while (active) {
        try {
            println("Escriba un número entero positivo: ")
            var numeroEntero = readln().toString().trim()

            if (numeroEntero.isEmpty()) {
                throw IllegalArgumentException("El campo no debe estar vacío.")
            }
            if (numeroEntero.contains(".")) {
                throw NumberFormatException("El numero introducido no debe ser decimal")
            }
            val numEn = numeroEntero.toIntOrNull() ?: throw NumberFormatException("El numero introducido no es un número entero")

            if (numEn < 0) {
                throw IllegalArgumentException("El numero introducido debe ser positivo")
            }
            println("El numero introducido es: ${numeroEntero(numEn)}")
            pause("continuar")
            println("\n")
            limpiarConsola()

        }catch (e: NumberFormatException) {
        println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
        println("ERR0R: ${e.message}") }
    }
}