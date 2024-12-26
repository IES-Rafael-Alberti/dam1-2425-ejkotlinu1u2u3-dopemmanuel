package com.dam1.kotlinbasico.introducional_kts

fun pause(msj: String) {
    // println("Pausando...") permite una pausa en la consola
    print("Presione ENTER [ ↩] para ${msj}...")
    readln().toString()
}