package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin


// import kotlin.math.round
/**Magina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses,
que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que
comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa
debe calcular y mostrar por pantalla la cantidad de ahorros tras el primero, segundo y ercer año. Redondear cada cantidad a dos decimales.*/

fun depositoAhorros() {

    var active = true
    val cuenta = 0.04f
    while (active) {
        try {
            println("Ingrese la cantidad de dinero depositado: ")
            val dinero = readln().trim()
            if (dinero.isEmpty() || dinero.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una cantidad de dinero.")
            }
            var dineroFloat = dinero.toFloatOrNull()
            if (dineroFloat == null) {
                throw NumberFormatException("Debe ingresar un número válido que no sea un nulo.")
            }
            if (dineroFloat < 0) {
                throw IllegalArgumentException("El valor de dinero debe ser mayor o igual a 0")
            }

            for (anios in 1..3) {
                dineroFloat *= 1 + cuenta
                println("El ahorro tras $anios años es: ${"%.2f".format(dinero)}")
            }
        }catch (e: NumberFormatException) {
            println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}