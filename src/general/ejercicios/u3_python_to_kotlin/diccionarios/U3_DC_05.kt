package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios

/**Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5}
 * y después muestre por pantalla los créditos de cada asignatura en el formato <asignatura> tiene <créditos> créditos, donde <asignatura> es
 * cada una de las asignaturas del curso, y <créditos> son sus créditos. Al final debe mostrar también el número total de créditos del curso.*/

fun dicted2() {
    val creditos = mapOf(
        "Matemáticas" to 6,
        "Física" to 4,
        "Química" to 5
    )
    var active = true
    while (active) {
        try {
            println("¿Qué asignatura deseas ver los créditos? ")
            val chosenSubject = readln().trim()

            if (chosenSubject.isEmpty() || chosenSubject.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una asignatura.")
            }

            if (creditos.containsKey(chosenSubject)) {
                println("$chosenSubject tiene ${creditos[chosenSubject]} créditos.")
                active = false
            } else {
                println("La asignatura no está en el diccionario.")
            }
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una asignatura válida.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}