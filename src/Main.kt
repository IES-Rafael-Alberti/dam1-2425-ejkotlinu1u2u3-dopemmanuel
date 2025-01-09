package com.dam1.kotlinbasico

// introducional_kts
import com.dam1.kotlinbasico.general.menu

import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
import com.dam1.kotlinbasico.general.utilidades_kts.intro
import com.dam1.kotlinbasico.general.utilidades_kts.pause



/** general.ejercicios.u1_python_to_kotlin
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
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.precioUnidad
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.productoCesta
// general.ejercicios.u2_python_to_kotlin
// Captura de excepciones
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial2
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.captura_excepciones.inicial3
// Sentencias condicionales
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal1
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal2
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal3
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal4
import com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales.principal5
// Sentencias iterativas
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
// general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin
// Conjuntos
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter1
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter2
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter3
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter4
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter5
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.conjuntos.starter6
// Diccionarios
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted1
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted2
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted3
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted4
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted5
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted6
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.diccionarios.dicted7
// Listas y Tuplas
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas1
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas2
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas3
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas4
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas5
import com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin.u3_python_to_kotlin.listas_y_tuplas.listas6
*/

fun main() {
    intro()
    pause("continuar")
    limpiarConsola()
    menu()
}