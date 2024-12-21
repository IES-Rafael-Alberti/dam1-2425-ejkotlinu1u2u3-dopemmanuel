package com.dam1.kotlinbasico.u3_python_to_kotlin.conjuntos

/**Suponer una lista con datos de las compras hechas por clientes de una empresa a lo largo de un mes, la cual contiene tuplas con información de cada venta: (cliente, día del mes, monto, domicilio del cliente). Ejemplo:

[("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), ("Jorge Russo", 7, 699, "Mirasol 218"), ("Nuria Costa", 7, 532.90, "Calle Las Flores 355"), ("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), ("Jorge Russo", 15, 958, "Mirasol 218")]
Escribir una función que reciba como parámetro una lista con el formato mencionado anteriormente y retorne los domicilios de cada cliente al cual se le debe enviar una factura de compra. Notar que cada cliente puede haber hecho más de una compra en el mes, por lo que la función debe retornar una estructura que contenga cada domicilio una sola vez.*/

fun clientesDomicilios(ventas: List<Triple<String, Int, Double>>): Map<String, List<String>> {
    val clientesDomicilios = mutableMapOf<String, MutableList<String>>()
    for (venta in ventas) {
        val cliente = venta.first
        val domicilio = venta.third
        if (clientesDomicilios[cliente] == null) {
            clientesDomicilios[cliente] = mutableListOf(domicilio.toString())
        } else {
            clientesDomicilios[cliente]?.add(domicilio.toString())
        }
    }
    return clientesDomicilios
}

fun starter1() {
    val ventas = listOf(
        Triple("Nuria Costa", 5, 12780.78,),
        Triple("Jorge Russo", 7, 699.0),
        Triple("Nuria Costa", 7, 532.90),
        Triple("Julián Rodriguez", 12, 5715.99),
        Triple("Jorge Russo", 15, 958.0)
    )
    val clientesDomicilios = clientesDomicilios(ventas)
    println(clientesDomicilios)
}