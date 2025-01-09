package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales

import com.dam1.kotlinbasico.general.utilidades_kts.pause
import com.dam1.kotlinbasico.general.utilidades_kts.limpiarConsola
/**Escribir un programa que almacene la cadena de caracteres
contraseña en una variable, pregunte al usuario por la contraseña
e imprima por pantalla si la contraseña introducida por el
usuario coincide con la guardada en la variable sin tener en
cuenta mayúsculas y minúsculas*/

fun contrasena(usuario: String, contrasena: String, password: ArrayList<String>): Boolean {
    if (contrasena !in password) {
        return false

    } else {
        println("Contraseña correcta!! Bienvenido $usuario")
        pause("continuar")
        println("\n")
        limpiarConsola()
        return true
    }
}
fun confirmarPssword(correcto: Boolean): Boolean {
    return correcto == true
}

fun principal1() {

    val password = arrayListOf<String>("contraseña")

    println("Ingrese el nnombre de usuario: ")
    var usuario = readln().toString().lowercase()

    println("Ingrese la contraseña: ")
    var contrasena = readln().toString().lowercase()

    val correcto = contrasena(usuario, contrasena, password)

    while (confirmarPssword(correcto) == contrasena(usuario, contrasena, password)) {
        println("Contraseña incorrecta, intente nuevamente")
        println("Ingrese la contraseña: ")
        contrasena = readln().toString().lowercase()
    }
}