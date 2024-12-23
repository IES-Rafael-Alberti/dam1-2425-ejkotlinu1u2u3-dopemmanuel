package com.dam1.kotlinbasico

// introducional_kts
import com.dam1.kotlinbasico.introducional_kts.limpiarConsola
import com.dam1.kotlinbasico.introducional_kts.intro
import com.dam1.kotlinbasico.introducional_kts.pause

// u1_python_to_kotlin
import com.dam1.kotlinbasico.u1_python_to_kotlin.grados
import com.dam1.kotlinbasico.u1_python_to_kotlin.pagarImporte
import com.dam1.kotlinbasico.u1_python_to_kotlin.pedirPesoyEstatura
import com.dam1.kotlinbasico.u1_python_to_kotlin.depositoAhorros
import com.dam1.kotlinbasico.u1_python_to_kotlin.repetirNombre
import com.dam1.kotlinbasico.u1_python_to_kotlin.numeroTelefono
import com.dam1.kotlinbasico.u1_python_to_kotlin.fraseInvertida
import com.dam1.kotlinbasico.u1_python_to_kotlin.vocalEnMayusculas
import com.dam1.kotlinbasico.u1_python_to_kotlin.precioEuros
import com.dam1.kotlinbasico.u1_python_to_kotlin.fechaNacimiento
import com.dam1.kotlinbasico.u1_python_to_kotlin.precioUnidad
import com.dam1.kotlinbasico.u1_python_to_kotlin.productoCesta
// u2_python_to_kotlin
// Captura de excepciones
import com.dam1.kotlinbasico.u2_python_to_kotlin.captura_excepciones.inicial
import com.dam1.kotlinbasico.u2_python_to_kotlin.captura_excepciones.inicial2
import com.dam1.kotlinbasico.u2_python_to_kotlin.captura_excepciones.inicial3
// Sentencias condicionales
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales.principal1
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales.principal2
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales.principal3
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales.principal4
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales.principal5
// Sentencias iterativas
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado2
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado4
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado6
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado7
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado8
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado10
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado13
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado15
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado18
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado19
import com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas.indiciado25
// u3_python_to_kotlin
// Conjuntos
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter1
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter2
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter3
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter4
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter5
import com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos.starter6
// Diccionarios
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted1
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted2
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted3
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted4
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted5
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted6
import com.dam1.kotlinbasico.u3_python_to_kotlin.diccionarios.dicted7
// Listas y Tuplas
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas1
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas2
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas3
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas4
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas5
import com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas.listas6



fun menu() {
    var active = true

    while (active) {
        println("\nMenu")
        println("1. Ejercicios de la Unidad 1")
        println("2. Ejercicios de la Unidad 2")
        println("3. Ejercicios de la Unidad 3")
        println("4. Acerca de")
        println("5. Salir")
        print("Elige una opción: ")
        val option = readln().toIntOrNull()

        when (option) {
            1 -> {
                ejerciciosU1()
                limpiarConsola()
            }
            2 -> {
                ejerciciosU2()
                limpiarConsola()
            }
            3 -> {
                ejerciciosU3()
            }
            4 -> {
                println("Re-creado por: Emmanuel")
                println("Fecha de creación: 2024-12-16")
            }
            5 -> {
                println("Saliendo del programa...")
                active = false
            }
            else -> {
                println("Opción no válida, intenta nuevamente.")
            }
        }
    }
}

fun ejerciciosU1() {
    println("\nSelecciona el ejercicio: ")
    println("\n")
    println("1. U1_EB_04")
    println("2. U1_EB_06")
    println("3. U1_EB_12")
    println("4. U1_EB_15")
    println("5. U1_EB_18")
    println("6. U1_EB_20")
    println("7. U1_EB_21")
    println("8. U1_EB_22")
    println("9. U1_EB_24")
    println("10. U1_EB_25")
    println("11. U1_EB_26")
    println("12. U1_EB_27")
    println("0. Regresar al menú principal")
    println("\n")
    print("Elige una opción: ")
    val option = readln().toIntOrNull()

    when (option) {
        1 -> grados()
        2 -> pagarImporte()
        3 -> pedirPesoyEstatura()
        4 -> depositoAhorros()
        5 -> repetirNombre()
        6 -> numeroTelefono()
        7 -> fraseInvertida()
        8 -> vocalEnMayusculas()
        9 -> precioEuros()
        10 -> fechaNacimiento()
        11 -> productoCesta()
        12 -> precioUnidad()
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }
}

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
        1 -> capturaExceptiones()
        2 -> sentenciasCondicionales()
        3 -> sentenciasIterativas()
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
        1 -> inicial()
        2 -> inicial2()
        3 -> inicial3()
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
        1 -> principal1()
        2 -> principal2()
        3 -> principal3()
        4 -> principal4()
        5 -> principal5()
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
        1 -> indiciado2()
        2 -> indiciado4()
        3 -> indiciado6()
        4 -> indiciado7()
        5 -> indiciado8()
        6 -> indiciado10()
        7 -> indiciado13()
        8 -> indiciado15()
        9 -> indiciado18()
        10 -> indiciado19()
        11 -> indiciado25()
        0 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }

}

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
        else -> println("Opción no válida, intenta nuevamente.")
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
        else -> println("Opción no válida, intenta nuevamente.")
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
        else -> println("Opción no válida, intenta nuevamente.")
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
        else -> println("Opción no válida, intenta nuevamente.")
    }
}



fun main() {
    intro()
    pause("continuar")
    limpiarConsola()
    menu()
}