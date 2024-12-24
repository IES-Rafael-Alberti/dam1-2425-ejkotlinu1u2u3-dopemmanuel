package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales
/**Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre.
El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre
posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario
su nombre y sexo, y muestre por pantalla el grupo que le corresponde. */

fun principal3() {
    println("Ingrese su nombre: ")
    var nombre = readln().toString().lowercase()

    println("Ingrese su sexo: ")
    var sexo = readln().toString().lowercase()

    if (sexo == "m" && nombre.contains("a")) {
        println("El grupo A")
    } else if (sexo == "m" && nombre.contains("n")) {
        println("El grupo B")
    } else if (sexo == "f" && nombre.contains("a")) {
        println("El grupo B")
    } else if (sexo == "f" && nombre.contains("n")) {
        println("El grupo A")
    } else {
        println("El grupo no existe")
    }
}