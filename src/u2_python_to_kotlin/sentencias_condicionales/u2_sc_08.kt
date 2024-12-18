package com.dam1.kotlinbasico.u2_python_to_kotlin.sentencias_condicionales
/**En una determinada empresa, sus empleados son evaluados al final de cada año.
Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios.
Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas.
A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.

Nivel	Puntuación
Inaceptable	0.0
Aceptable	0.4
Meritorio	0.6 o más
Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la cantidad de dinero que recibirá el usuario.*/

fun principal4() {
    println("Ingrese la puntuación del empleado: ")
    var puntuacion = readln().toDouble()

    if (puntuacion >= 0.0 && puntuacion <= 0.4) {
        println("Nivel Inaceptable")
        println("Se obtiene un total de 2.400€ por cada puntuación")
    } else if (puntuacion >= 0.4 && puntuacion <= 0.6) {
        println("Nivel Aceptable")
        println("Se obtiene un total de 4.800€ por cada puntuación")
    } else if (puntuacion >= 0.6) {
        println("Nivel Meritorio")
        println("Se obtiene un total de 7.200€ por cada puntuación")
    }
}