package com.dam1.kotlinbasico.general.ejercicios.u2_python_to_kotlin.sentencias_iterativas
/**Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga
(en caso de haber más de una, mostrar la primera) y cuántas palabras había. Precondición:
se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.*/

fun largaPalabra() {
    var active = true
    while (active) {
        try {
            println("Ingrese una frase: ")
            val frase = readln().trim()

            if (frase.isEmpty()) {
                throw IllegalArgumentException("Debe ingresar una frase .")
            }

            val palabras = frase.split(" ")

            if (palabras.isEmpty()) {
                throw IllegalArgumentException("Debe ingresar una palabra.")
            }

            var mayor = palabras[0]
            var mayorLongitud = palabras[0].length
            for (palabra in palabras) {
                if (palabra.length > mayorLongitud) {
                    mayor = palabra
}
                mayorLongitud = palabra.length
            }
            println("La palabra más larga es: $mayor")
            println("La palabra más larga tiene $mayorLongitud letras.")
        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")
        }
    }
}
fun indiciado25() {
    largaPalabra()
}