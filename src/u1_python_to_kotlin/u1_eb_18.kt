package com.dam1.kotlinbasico.u1_python_to_kotlin
/**Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre
por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas,
otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula.
El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.*/

fun repetirNombre() {
    println("Ingrese su nombre completo: ")
    var nombre = readln().toString()
    println("\n")
    println("Cuantas veces quiere que se repita el nombre?")
    val repetir = readln().toInt()
    println("\n")

    for (i in 1..repetir) {
        println("${nombre.uppercase()} \n${nombre.lowercase()}")
    }

}
