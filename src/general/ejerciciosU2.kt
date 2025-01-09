package com.dam1.kotlinbasico.general

import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
// CAPTURA DE EXCEPCIONES
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial2
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial3
// SENTENCIAS CONDICIONALES
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal1
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal2
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal3
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal4
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal5
// SENTENCIAS ITERATIVAS
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado2
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado4
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado6
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado7
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado8
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado10
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado13
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado15
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado18
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado19
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas.indiciado25


fun ejerciciosU2() {
    println("\nSelecciona el tema: ")
    println("\n")
    println("1. Captura de Exceptiones")
    println("2. Sentencias Condicionales")
    println("3. Sentencias iterativas")
    println("0. Regresar al menú principal")
    println("\n")
    print("Elige una opción: ")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> {
            limpiarConsola()
            capturaExceptiones()
        }
        2 -> {
            limpiarConsola()
            sentenciasCondicionales()
        }
        3 -> {
            limpiarConsola()
            sentenciasIterativas()
        }
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }

}

fun capturaExceptiones() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U2_CE_02")
    println("2. U2_CE_03")
    println("3. U2_CE_04")
    println("0. Para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> {
            limpiarConsola()
            inicial()
        }
        2 -> {
            limpiarConsola()
            inicial2()
        }
        3 -> {
            limpiarConsola()
            inicial3()
        }
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }
}
fun sentenciasCondicionales() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U2_SC_02")
    println("2. U2_SC_03")
    println("3. U2_SC_06")
    println("4. U2_SC_08")
    println("5. U2_SC_10")
    println("0. Para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> {
            limpiarConsola()
            principal1()
        }
        2 -> {
            limpiarConsola()
            principal2()
        }
        3 -> {
            limpiarConsola()
            principal3()
        }
        4 -> {
            limpiarConsola()
            principal4()
        }
        5 -> {
            limpiarConsola()
            principal5()
        }
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")

    }

}
fun sentenciasIterativas() {
    println("selecciona el ejercicio: ")
    println("\n")
    println("1. U2_SI_02")
    println("2. U2_SI_04")
    println("3. U2_SI_06")
    println("4. U2_SI_07")
    println("5. U2_SI_08")
    println("6. U2_SI_10")
    println("7. U2_SI_13")
    println("8. U2_SI_15")
    println("9. U2_SI_18")
    println("10. U2_SI_19")
    println("11. U2_SI_25")
    println("0. Para volver al menú de opciones")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> {
            limpiarConsola()
            indiciado2()
        }
        2 -> {
            limpiarConsola()
            indiciado4()
        }
        3 -> {
            limpiarConsola()
            indiciado6()
        }
        4 -> {
            limpiarConsola()
            indiciado7()
        }
        5 -> {
            limpiarConsola()
            indiciado8()
        }
        6 -> {
            limpiarConsola()
            indiciado10()
        }
        7 -> {
            limpiarConsola()
            indiciado13()
        }
        8 -> {
            limpiarConsola()
            indiciado15()
        }
        9 -> {
            limpiarConsola()
            indiciado18()
        }
        10 -> {
            limpiarConsola()
            indiciado19()
        }
        11 -> {
            limpiarConsola()
            indiciado25()
        }
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }
}
