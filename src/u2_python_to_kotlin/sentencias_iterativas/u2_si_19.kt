package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_iterativas
/**Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado,
3-finalizar programa. A continuación, el usuario debe poder seleccionar
una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error.
El menú se debe volver a mostrar luego de ejecutada cada opción,
permitiendo volver a elegir. Si elige las opciones 1 ó 2 se
imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión
del menú y el programa finalizará.*/

fun menuwithOption() {
    var active = true
    while (active) {
        println("\nMenu")
        println("1 - ⟪ Comenzar programa ⟫")
        println("2 - ⟪ Imprimir listado ⟫")
        println("3 - ⟪ Finalizar programa ⟫")
        println("4. Acerca de")
        print("Elige una opción: ")
        val option = readln().toIntOrNull()

        when (option) {
            1 -> {
                println("Programa iniciado... ")
                readln()
                println("Hola usuario!! el programa te da la Bienvenida (☆▽☆")
                println("\n")
                println("Presione cualquier tecla para continuar...")
            }
            2 -> {
                var lista = "- Red Dead Redemtion 1 and 2 \n- Minecraft Dungeons \n- GoW and ragnarok"
                println("Lista de apps: ")
                println("\n")
                println(lista)
                println("\n")
                println("Presione cualquier tecla para continuar...")
            }
            3 -> {
                println("Saliendo del programa...")
                active = false
            }
            4 -> {
                println("Re-creado por: Emmanuel")
                println("Fecha de creación: 2024-12-16")
            }
            else -> {
                println("Opción no válida, intenta nuevamente.")
            }
        }
    }
}
fun indiciado19() {
    menuwithOption()
}