package com.dam1.kotlinbasico.general

import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter1
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter2
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter3
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter4
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter5
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.conjuntos.starter6
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted1
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted2
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted3
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted4
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted5
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted6
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios.dicted7
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas1
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas2
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas3
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas4
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas5
import com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas.listas6


fun ejerciciosU3() {
    println("\nSelecciona el ejercicio: ")
    println("\n")
    println("1. Conjuntos")
    println("2. Diccionarios")
    println("3. Listas y tuplas")
    println("0. Regresar al menú principal")
    println("\n")
    print("Elige una opción: ")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> conjuntos()
        2 -> diccionarios()
        3 -> listasYtuplas()
        0 -> return
        else ->{
        println("Opción no válida, intenta nuevamente.")
        limpiarConsola()
        return ejerciciosU3()
        }
    }
}

fun conjuntos() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U3_C_01")
    println("2. U3_C_02")
    println("3. U3_C_03")
    println("4. U3_C_04")
    println("5. U3_C_05")
    println("6. U3_C_06")
    println("0. Para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> starter1()
        2 -> starter2()
        3 -> starter3()
        4 -> starter4()
        5 -> starter5()
        6 -> starter6()
        0 -> return
        else -> {
            println("Opción no válida, intenta nuevamente.")
            limpiarConsola()
            return conjuntos()
        }
    }
}
fun diccionarios() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U3_DC_01")
    println("2. U3_DC_02")
    println("3. U3_DC_03")
    println("4. U3_DC_04")
    println("5. U3_DC_05")
    println("6. U3_DC_06")
    println("7. U3_DC_07")
    println("0. Para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> dicted1()
        2 -> dicted2()
        3 -> dicted3()
        4 -> dicted4()
        5 -> dicted5()
        6 -> dicted6()
        7 -> dicted7()
        0 -> return
        else -> {
            println("Opción no válida, intenta nuevamente.")
            limpiarConsola()
            return diccionarios()
        }
    }
}
fun listasYtuplas() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U3_LT_01")
    println("2. U3_LT_02")
    println("3. U3_LT_03")
    println("4. U3_LT_04")
    println("5. U3_LT_05")
    println("6. U3_LT_06")
    println("0. Selecione cero para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> listas1()
        2 -> listas2()
        3 -> listas3()
        4 -> listas4()
        5 -> listas5()
        6 -> listas6()
        0 -> return
        else -> {
            println("Opción no válida, intenta nuevamente.")
            limpiarConsola()
            return listasYtuplas()
        }
    }
}
