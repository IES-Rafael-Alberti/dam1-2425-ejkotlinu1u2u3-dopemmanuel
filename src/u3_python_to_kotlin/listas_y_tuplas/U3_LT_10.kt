@file:Suppress("UNCHECKED_CAST")

package com.dam1.kotlinbasico.u3_python_to_kotlin.listas_y_tuplas

/**Escribir un programa que permita gestionar la base de datos de clientes de una
empresa. Los clientes se guardarán en un diccionario en el que la clave de cada
cliente será su NIF, y el valor será otro diccionario con los datos del cliente
(nombre, dirección, teléfono, correo, preferente), donde preferente tendrá el valor
True si se trata de un cliente preferente. El programa debe preguntar al usuario
por una opción del siguiente menú: (1) Añadir cliente, (2) Eliminar cliente, (3)
Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes,
(6) Terminar. En función de la opción elegida el programa tendrá que hacer lo
siguiente:

Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
Preguntar por el NIF del cliente y mostrar sus datos.
Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
Terminar el programa.*/

fun agregarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("Ingrese el NIF del cliente: ")
    val nif = readLine()?.trim()
    if (nif == null || nif.length != 9) {
        throw IllegalArgumentException("El NIF debe tener 9 dígitos.")
    }
    if (nif in clientes) {
        throw IllegalArgumentException("El NIF ya existe.")
    }
    println("Ingrese su nombre: ")
    val nombre = readLine()?.trim()
    println("Ingrese su dirección: ")
    val direccion = readLine()?.trim()
    println("Ingrese su teléfono: ")
    val telefono = readLine()?.trim()
    if (telefono == null || telefono.length != 10) {
        throw IllegalArgumentException("El teléfono debe tener 10 dígitos.")
    }
    println("Ingrese su correo: ")
    val correo = readLine()?.trim()
    println("¿Es preferente el cliente? (si/no)")
    val preferente = readLine()?.trim()?.lowercase()
    if (preferente !in listOf("si", "sí", "yes", "no")) {
        throw IllegalArgumentException("Debe responder si o no.")
    }
    clientes[nif] = mutableMapOf(
        "nombre" to nombre.orEmpty(),
        "direccion" to direccion.orEmpty(),
        "telefono" to telefono,
        "correo" to correo.orEmpty(),
        "preferente" to (preferente == "si" || preferente == "sí" || preferente == "yes")
    )
    println("El cliente $nif se ha añadido con éxito!")
}
fun eliminarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("Ingrese el NIF del cliente que desea eliminar: ")
    val nif = readLine()?.trim()
    if (nif == null || nif.length != 9) {
        throw IllegalArgumentException("El NIF debe tener 9 dígitos.")
    }
    if (nif !in clientes) {
        throw IllegalArgumentException("El NIF no existe.")
    }
    clientes.remove(nif)
    println("El cliente $nif se ha eliminado con éxito!")
}
fun mostrarCliente(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("Ingrese el NIF del cliente que desea mostrar: ")
    val nif = readLine()?.trim()
    if (nif == null || nif.length != 9) {
        throw IllegalArgumentException("El NIF debe tener 9 dígitos.")
    }
    if (nif !in clientes) {
        throw IllegalArgumentException("El NIF no existe.")
    }
    val datosCliente = clientes[nif]!!
    println("NIF: $nif")
    println("Nombre: ${datosCliente["nombre"]}")
    println("Dirección: ${datosCliente["direccion"]}")
    println("Teléfono: ${datosCliente["telefono"]}")
    println("Correo: ${datosCliente["correo"]}")
    println("Preferente: ${if (datosCliente["preferente"] as Boolean) "Sí" else "No"}")
}
fun listarClientes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("Lista de clientes:")
    for ((nif, datosCliente) in clientes) {
        println("NIF: $nif")
        println("Nombre: ${datosCliente["nombre"]}")
        println("Dirección: ${datosCliente["direccion"]}")
        println("Teléfono: ${datosCliente["telefono"]}")
        println("Correo: ${datosCliente["correo"]}")
        println("Preferente: ${if (datosCliente["preferente"] as Boolean) "Sí" else "No"}")
        println()
    }
}
fun listarClientesPreferentes(clientes: MutableMap<String, MutableMap<String, Any>>) {
    println("Lista de clientes preferentes:")
    for ((nif, datosCliente) in clientes) {
        if (datosCliente["preferente"] as Boolean) {
            println("NIF: $nif")
            println("Nombre: ${datosCliente["nombre"]}")
        }
    }
}
fun menuBaseDatos() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()
    while (true) {
        try {
            println("Seleccione una opción:")
            println("1. Añadir cliente")
            println("2. Eliminar cliente")
            println("3. Mostrar cliente")
            println("4. Listar todos los clientes")
            println("5. Listar clientes preferentes")
            println("6. Salir")
            print("Elige una opción: ")
            val opcion = readLine()?.toInt()

            when (opcion) {
                1 -> agregarCliente(clientes)
                2 -> eliminarCliente(clientes)
                3 -> mostrarCliente(clientes)
                4 -> listarClientes(clientes)
                5 -> listarClientesPreferentes(clientes)
                6 -> return
                else -> println("Opción no válida, intenta nuevamente.")
            }
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        } catch (e: Exception) {
            println("ERROR inesperado: ${e.message}")
        }
    }
}

fun listas5() {
    var active = true
    while (active) {
        try {
            menuBaseDatos()
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}