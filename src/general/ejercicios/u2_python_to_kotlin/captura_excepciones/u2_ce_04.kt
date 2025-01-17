package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
/**Escribir un programa que pida al usuario un número entero, si la entrada no es correcta,
mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada.*/

fun capturarExceptiones(): Int {
    var active = true
    var numbEn = 0
    while (active) {
        try {
            println("Escriba un número abajo: ")
            var number = readln().toString().trim()

            if (number.isEmpty()) {
                throw IllegalArgumentException("El campo no debe estar vacío.")
            }
            if (number.contains(".")) {
                throw NumberFormatException("El numero introducido no debe ser decimal.")
            }
            val numbEn = number.toIntOrNull() ?: throw NumberFormatException("El numero introducido no es un número entero.")

            if (numbEn < 0) {
                throw IllegalArgumentException("El numero introducido debe ser positivo.")
            }

        } catch (e: NumberFormatException) {
            println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("ERR0R: ${e.message}")
        }
    }
    return numbEn
}
fun inicial3() {

    println("El numero introducido es: ${capturarExceptiones()}")
    pause("continuar")
    println("\n")
    limpiarConsola()

}