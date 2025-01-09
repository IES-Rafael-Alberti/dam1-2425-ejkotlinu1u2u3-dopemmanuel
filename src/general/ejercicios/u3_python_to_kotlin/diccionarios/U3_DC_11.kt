package com.dam1.kotlinbasico.general.ejercicios.u3_python_to_kotlin.diccionarios

/**Escribir un programa que permita gestionar la base de datos de clientes de una empresa.
 * Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su
 * NIF, y el valor será otro diccionario con los datos del cliente (nombre, dirección,
 * teléfono, correo, preferente), donde preferente tendrá el valor True si se trata de un
 * cliente preferente. El programa debe preguntar al usuario por una opción del siguiente menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el programa tendrá que hacer lo siguiente:

Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
Preguntar por el NIF del cliente y mostrar sus datos.
Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
Terminar el programa.*/

fun dicted7() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()
    var active = true
    while (active) {
        try {
            println("¿Qué deseas hacer? ")
            val opcion = readln().trim()

            if (opcion.isEmpty() || opcion.isBlank()) {
                throw IllegalArgumentException("Debe ingresar una opción.")
            }

            if (opcion == "añadir") {
                println("¿Cuál es el NIF del cliente? ")
                val nif = readln().trim()

                if (nif.isEmpty() || nif.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un NIF.")
                }
                println("¿Cuál es el nombre del cliente? ")
                val nombre = readln().trim()

                if (nombre.isEmpty() || nombre.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un nombre.")
                }
                println("¿Cuál es la dirección del cliente? ")
                val direccion = readln().trim()

                if (direccion.isEmpty() || direccion.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar una dirección.")
                }
                println("¿Cuál es el teléfono del cliente? ")
                val telefono = readln().trim()

                if (telefono.isEmpty() || telefono.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un teléfono.")
                }
                println("¿Cuál es el correo electrónico del cliente? ")
                val correo = readln().trim()

                if (correo.isEmpty() || correo.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un correo electrónico.")
                }
                val preferente = mutableMapOf<String, Any>()
                preferente["preferente"] = true
                clientes[nif] = preferente
                clientes[nif]!!["nombre"] = nombre
                clientes[nif]!!["direccion"] = direccion
                clientes[nif]!!["telefono"] = telefono
                clientes[nif]!!["correo"] = correo
                active = false
            }
            else if (opcion == "eliminar") {
                println("¿Cuál es el NIF del cliente? ")
                val nif = readln().trim()

                if (nif.isEmpty() || nif.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un NIF.")
                }
                clientes.remove(nif)
                active = false
            }
            else if (opcion == "mostrar") {
                println("¿Cuál es el NIF del cliente? ")
                val nif = readln().trim()

                if (nif.isEmpty() || nif.isBlank()) {
                    throw IllegalArgumentException("Debe ingresar un NIF.")
                }
                if (clientes.containsKey(nif)) {
                    println("NIF: $nif")
                    println("Nombre: ${clientes[nif]!!["nombre"]}")
                    println("Dirección: ${clientes[nif]!!["direccion"]}")
                    println("Teléfono: ${clientes[nif]!!["telefono"]}")
                    println("Correo: ${clientes[nif]!!["correo"]}")
                } else {
                    println("El cliente no está en la base de datos.")
                }
                active = false
            }
            else if (opcion == "listar") {
                println("Lista de clientes: ")
                for (cliente in clientes) {
                    println("NIF: ${cliente.key}")
                    println("Nombre: ${clientes[cliente.key]!!["nombre"]}")
                    println("Dirección: ${clientes[cliente.key]!!["direccion"]}")
                    println("Teléfono: ${clientes[cliente.key]!!["telefono"]}")
                    println("Correo: ${clientes[cliente.key]!!["correo"]}")
                }
                active = false
            }
            else if (opcion == "preferentes") {
                println("Lista de clientes preferentes: ")
                for (cliente in clientes) {
                    if (clientes[cliente.key]!!["preferente"] == true) {
                        println("NIF: ${cliente.key}")
                        println("Nombre: ${clientes[cliente.key]!!["nombre"]}")
                        println("Dirección: ${clientes[cliente.key]!!["direccion"]}")
                        println("Teléfono: ${clientes[cliente.key]!!["telefono"]}")
                        println("Correo: ${clientes[cliente.key]!!["correo"]}")
                    }
                }
                active = false
            }
            else if (opcion == "salir") {
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