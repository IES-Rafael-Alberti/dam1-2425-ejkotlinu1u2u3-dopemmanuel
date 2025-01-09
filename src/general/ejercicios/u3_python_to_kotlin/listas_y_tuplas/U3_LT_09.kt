package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.listas_y_tuplas

/**Escribir un programa que gestione las facturas pendientes de cobro de una empresa.
Las facturas se almacenarán en un diccionario donde la clave de cada factura será el
número de factura y el valor el coste de la factura. El programa debe preguntar al
usuario si quiere añadir una nueva factura, pagar una existente o terminar.
Si desea añadir una nueva factura se preguntará por el número de factura y su coste
y se añadirá al diccionario. Si se desea pagar una factura se preguntará por el
número de factura y se eliminará del diccionario. Después de cada operación el
programa debe mostrar por pantalla la cantidad cobrada hasta el momento y la
cantidad pendiente de cobro.*/
fun mostrarEstado(cobrada: Double, pendiente: Double) {
    println("\nEstado financiero:")
    println("Cantidad cobrada hasta el momento: $cobrada€")
    println("Cantidad pendiente de cobro: $pendiente€\n")
}
fun pagarFactura(facturas: MutableMap<Int, Double>, cobrada: Double): Double {

    println("Ingrese el número de factura: ")
    val numeroFactura = readln().toIntOrNull() ?: throw IllegalArgumentException("Debe ingresar un número válido.")
    if (numeroFactura !in facturas.keys) {
        throw IllegalArgumentException("La factura no existe.")
    }
    val costeFactura = facturas[numeroFactura] ?: throw IllegalArgumentException("La factura no existe.")
    if (facturas[numeroFactura]!! <= 0) {
        throw IllegalArgumentException("La factura ya fue pagada.")
    }
    println("La factura $numeroFactura se ha pagado con un coste de $costeFactura€ con exito!!")
    facturas.remove(numeroFactura)
    return cobrada + costeFactura
}
fun agregarFactura(facturas: MutableMap<Int, Double>) {
    println("Ingrese el número de factura: ")
    val numeroFactura = readln().toIntOrNull() ?: throw IllegalArgumentException("Debe ingresar un número válido.")

    if (numeroFactura in facturas.keys) {
        throw IllegalArgumentException("La factura ya existe.")
    }
    println("Ingrese el coste de la factura: ")
    val costeFactura = readln().toDoubleOrNull() ?: throw IllegalArgumentException("Debe ingresar un coste válido.")

    if (costeFactura <= 0) {
        throw IllegalArgumentException("El coste debe ser mayor a cero.")
    }

    if (costeFactura in facturas.values) {
        throw IllegalArgumentException("El coste ya existe.")
    }
    facturas[numeroFactura] = costeFactura
    println("La factura $numeroFactura se ha añadido con un coste de $costeFactura€ con exito!!")
}
fun miniMenu() {
    var facturas = mutableMapOf<Int, Double>()
    var cobrada = 0.0
    var pendiente = 0.0
    println("Seleccione una opción: ")
    println("\n")
    println("1. Añadir una nueva factura")
    println("2. Pagar una factura")
    println("3. mostrar cobrada y pendiente")
    println("4. Salir")
    println("↓".repeat(10))
    val opcion = readln().toIntOrNull()

    when (opcion) {
        1 -> agregarFactura(facturas)
        2 -> pagarFactura(facturas,cobrada)
        3 -> mostrarEstado(cobrada, pendiente)
        4 -> return
        else -> println("Opción no válida, intenta nuevamente.")
    }
}

fun listas4() {
    var active = true
    while (active) {
        try {
            miniMenu()
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}