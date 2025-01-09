package com.dam1.kotlinbasico.general.utilidades_kts

fun pause(msj: String) {
    println("\n")
    // println("Pausando...") permite una pausa en la consola
    print("Presione ENTER [ ↩ ] para ${msj}...")
    readln().toString()
    Thread.sleep(3000)
}