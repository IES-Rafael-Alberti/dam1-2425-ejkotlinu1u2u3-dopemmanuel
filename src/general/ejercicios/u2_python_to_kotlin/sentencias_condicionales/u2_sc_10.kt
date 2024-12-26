package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_condicionales
/**La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes.
Los ingredientes para cada tipo de pizza aparecen a continuación.

Ingredientes vegetarianos: Pimiento y tofu.
Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.

Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no,
y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija.
Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están
en todas la pizzas. Al final se debe mostrar por pantalla si la pizza
elegida es vegetariana o no y todos los ingredientes que lleva.*/

fun principal5() {
    println("¿Quieres una pizza vegetariana ¿si o no?")
    var opcion = readln().toString().lowercase()

    if (opcion == "si"|| opcion == "s"|| opcion == "y"|| opcion == "yes") {
        println("Ingredientes para la pizza vegetariana:")
        println("Pimiento")
        println("Tofu")
        println("Mozzarella")
        println("Tomate")
        println("Salmón")
    } else {
        println("Ingredientes para la pizza no vegetariana:")
        println("Peperoni")
        println("Jamón")
        println("Mozzarella")
        println("Tomate")
        println("Salmón")
    }
}