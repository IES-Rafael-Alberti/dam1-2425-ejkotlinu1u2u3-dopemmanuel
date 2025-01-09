package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas


/**Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas,
 * Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha
 * sacado en cada asignatura y elimine de la lista las asignaturas aprobadas.
 * Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que
 * repetir.*/

fun asignaturas(): List<String> {
    val asignaturas = mutableListOf<String>()
    println("Ingrese las asignaturas del curso: ")
    println("\n")
    println("1. Matemáticas")
    println("2. Física")
    println("3. Química")
    println("4. Historia")
    println("5. Lengua")
    print("Elige una opción: ")
    val opcion = readln().toIntOrNull()

    when (opcion) {
        1 -> asignaturas.add("Matemáticas")
        2 -> asignaturas.add("Física")
        3 -> asignaturas.add("Química")
        4 -> asignaturas.add("Historia")
        5 -> asignaturas.add("Lengua")
        else -> throw IllegalArgumentException("Opción no válida, intenta nuevamente.")

    }
    return asignaturas
}

fun notas(): Map<String, Double> {
    val notas = mutableMapOf<String, Double>()
    println("Ingrese las notas del curso: ")
    println("\n")
    println("1. Matemáticas")
    println("2. Física")
    println("3. Química")
    println("4. Historia")
    println("5. Lengua")
    print("Elige una opción: ")
    val opcion = readln().toIntOrNull()

    when (opcion) {
        1 -> notas["Matemáticas"] = 3.0
        2 -> notas["Física"] = 3.0
        3 -> notas["Química"] = 3.0
        4 -> notas["Historia"] = 3.0
        5 -> notas["Lengua"] = 3.0
        else -> throw IllegalArgumentException("Opción no válida, intenta nuevamente.")
    }
    return notas
}

fun repetirAsignaturas(asignaturas: List<String>, notas: Map<String, Double>): List<String> {
    val repetidas = mutableListOf<String>()
    for (asignatura in asignaturas) {
        if (notas[asignatura] != null) {
            repetidas.add(asignatura)
        } else {
            throw IllegalArgumentException("Asignatura no válida, intenta nuevamente.")
        }
    }
    return repetidas
}

fun listas2() {
    var active = true
    while (active) {
        try {
            val asignaturas = asignaturas()
            val notas = notas()
            val repetidas = repetirAsignaturas(asignaturas, notas)
            println("Asignaturas aprobadas: ")
            println("\n")
            for (asignatura in repetidas) {
                println(asignatura)
            }
            println("\n")
            println("Asignaturas que tiene que repetir: ")
            println("\n")
            for (asignatura in asignaturas) {
                if (!repetidas.contains(asignatura)) {
                    println(asignatura)
                }
            }
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }

}