package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Leer números enteros de teclado, hasta que el
usuario ingrese el 0. Finalmente, mostrar la
sumatoria de todos los números positivos ingresados.*/

fun sumaTorianumeros() {
    var active = true
    var suma = 0
    while (active) {
        try {
            println("Ingrese un número entero positivo: ")
            val numero = readln().trim()

            if (numero.contains('.')) {
                throw NumberFormatException("Debe ingresar un número entero positivo.")
            }
            val numeera = numero.toIntOrNull()

            if (numeera == null) {
                throw IllegalArgumentException("Debe ingresar un numero, no dejarlo en blanco.")
            }
            if (numeera == 0) {
                active = false
                println("La suma es: $suma")
            } else {
                suma += numeera
            }
        } catch (_: NumberFormatException) {
            println("ERROR: Debe ingresar un número entero positivo.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}


fun indiciado15() {
    sumaTorianumeros()
}