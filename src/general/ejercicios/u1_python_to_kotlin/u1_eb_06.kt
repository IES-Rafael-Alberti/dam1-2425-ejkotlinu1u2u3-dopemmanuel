package com.dam1.kotlinbasico.general.ejercicios.u1_python_to_kotlin

/**Escribe un programa que pida el importe final de un artículo y calcule e
 * imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).*/

fun pagarImporte() {
    val porciento = 10
    var active = true
    while (active) {
        try {
            println("Ingrese el importe final: ")
            println("\n")
            var importefinal = readln().trim()
            if (importefinal.isEmpty() || importefinal.isBlank()) {
                throw IllegalArgumentException("Debe ingresar un importe obligatoriamente.")
            }
            val importefinal2 = importefinal.toDouble()
            if (importefinal2 <= 0) {
                throw IllegalArgumentException("El importe debe ser mayor a cero.")
            }
            val iva = importefinal2 * porciento / 100

            val ivaPagado = importefinal2 - iva

            println("El importe sin IVA es: $importefinal")
            println("El IVA pagado es: $iva")
            println("El importe final con IVA es: $ivaPagado")
            active = false
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar un importe válido que no sea de tipo string.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}

