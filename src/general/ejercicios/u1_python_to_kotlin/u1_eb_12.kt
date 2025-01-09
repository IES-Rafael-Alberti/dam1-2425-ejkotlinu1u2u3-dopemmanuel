package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

import kotlin.math.round

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.ejerciciosU1
/**Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal
y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa
corporal calculado redondeado con dos decimales.*/

fun pedirPesoyEstatura() {
    var active = true
    while (active) {
        try {
            println("Ingrese su peso (en kg): ")
            var peso = readln().trim()
            if (peso.isEmpty() || peso.isBlank()) {
                throw IllegalArgumentException("El peso no debe estar vacio, intenta nuevamente.")
            }
            val pesoFloat = peso.toFloatOrNull()
            if (pesoFloat == null) {
                throw NumberFormatException("Debe ingresar un número válido que no sea un nulo.")
            }
            println("Ingrese su estatura (en metros): ")
            var estatura = readln().trim()
            if (estatura.isEmpty() || estatura.isBlank()) {
                throw IllegalArgumentException("La estatura no debe estar vacio, intenta nuevamente.")
            }
            val estaturaFloat = estatura.toFloatOrNull()
            if (estaturaFloat == null) {
                throw NumberFormatException("Debe ingresar un número válido que no sea un nulo.")
            }
            if (pesoFloat < 0) {
                println("El valor de peso debe ser mayor o igual a 0")
            }
            else if (estaturaFloat <= 0) {
                println("El valor de estatura debe ser mayor o igual a 0")
            }
            else {
                val imc = pesoFloat / (estaturaFloat * 2)
                println("Tu índice de masa corporal es: ${round(imc)}.")
                active = false
            }
            pause("continuar")
            println("\n")
            ejerciciosU1()
        }catch (e: NumberFormatException) {
            println("ERR0R: ${e.message}")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}