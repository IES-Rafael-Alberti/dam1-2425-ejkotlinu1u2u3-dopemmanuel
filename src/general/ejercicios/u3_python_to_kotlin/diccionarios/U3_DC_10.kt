package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios

/**Escribir un programa que gestione las facturas pendientes de cobro de una empresa.
 * Las facturas se almacenarán en un diccionario donde la clave de cada factura será el
 * número de factura y el valor el coste de la factura. El programa debe preguntar al
 * usuario si quiere añadir una nueva factura, pagar una existente o terminar.
 * Si desea añadir una nueva factura se preguntará por el número de factura y su coste
 * y se añadirá al diccionario. Si se desea pagar una factura se preguntará por el
 * número de factura y se eliminará del diccionario. Después de cada operación el programa
 * debe mostrar por pantalla la cantidad cobrada hasta el momento y la cantidad pendiente
 * de cobro.*/

fun dicted6() {
    val facturas = mutableMapOf<Int, Double>()
    var active = true
    while (active) {
        try {
            println("¿Qué deseas hacer? ")
            val opcion = readln().trim()

            if (opcion.isEmpty() || opcion.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una opción.")
            }

            if (opcion == "añadir") {
                println("¿Cuál es el número de la factura? ")
                val numero = readln().trim().toInt()

                if (numero < 0) {
                    throw IllegalArgumentException("Debe ingresar un número positivo.")
                }
                println("¿Cuál es el coste de la factura? ")
                var coste = readln().trim().toDouble()

                if (coste < 0) {
                    throw IllegalArgumentException("Debe ingresar un coste positivo.")
                }
                facturas[numero] = coste
                active = false
            } else if (opcion == "pagar") {
                println("¿Cuál es el número de la factura? ")
                val numero = readln().trim().toInt()

                if (numero < 0) {
                    throw IllegalArgumentException("Debe ingresar un número positivo.")
                }
                if (facturas.containsKey(numero)) {
                    val cobrado = facturas[numero]!!
                    facturas.remove(numero)
                    println("Se ha pagado $cobrado")
                } else {
                    println("La factura no está en el diccionario.")
                }
                active = false
            } else if (opcion == "salir") {
                active = false
            } else {
                println("Opción no válida, intenta nuevamente.")
            }
        }catch (_: NumberFormatException) {
            println("ERR0R: Debe ingresar una opción válida.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }

}