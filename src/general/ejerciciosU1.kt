package com.dam1.kotlinbasico.general

import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.grados
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.pagarImporte
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.pedirPesoyEstatura
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.depositoAhorros
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.repetirNombre
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.numeroTelefono
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.fraseInvertida
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.vocalEnMayusculas
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.precioEuros
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.fechaNacimiento
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.productoCesta
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.precioUnidad


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
        0 -> return menu()
        else -> println("Opción no válida, intenta nuevamente.")
    }
}
