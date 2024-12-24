package com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos

/**Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela, finalizando cuando se introduzca “x”. A continuación, solicitar que introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.

Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
Mostrar qué nombres de primaria no se repiten en los de nivel Secundaria.
Mostrar si todos los nombres de primaria están incluidos en secundaria.*/


fun starter2() {
    println("Ingrese los nombres de los alumnos de primaria: ")
    val primaria = readln().split("x")
    println("Ingrese los nombres de los alumnos de secundaria: ")
    val secundaria = readln().split("x")

    val primariaNoRepetidas = primaria.distinct()
    val secundariaNoRepetidas = secundaria.distinct()

    println("Nombres de primaria: ")
    primaria.forEach { println(it) }
    println("Nombres de secundaria: ")
    secundaria.forEach { println(it) }

    println("Nombres repetidos entre primaria y secundaria: ")
    primaria.intersect(secundaria).forEach { println(it) }

    println("Nombres de primaria no repetidos en secundaria: ")
    primariaNoRepetidas.subtract(secundariaNoRepetidas).forEach { println(it) }

    println("Nombres de primaria incluidos en secundaria: ")
    primariaNoRepetidas.intersect(secundariaNoRepetidas).forEach { println(it) }
}