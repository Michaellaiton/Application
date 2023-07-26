package com.MichaelLaiton.application

class Reto3 {
}
fun main(){
    println("Bienvenidos a automoviles Jeff")
    var i: String="si"
    var lista = mutableListOf("Mustang GT","Supra","Rayo McQueen")
    do {
        println("Que deseas hacer el dia de hoy?")
        println("\nIngrese el numero de la opcion que desea\n1.Ingresar nuevos autos || 2.Mostrar los autos de la lista || 3.Buscar un carro en particular \n 4.Modificar un vehiculo existtente || 5.Eliminar un vehiculo existente")
        var opt: Int= readLine()!!.toInt()

        if (opt==1){
            println("Ingresa el nombre del auto que deseas agregar")
            var add: String= readLine()!!.toString()
            lista.add(add)
            println(lista)

        }else if (opt==2){
            println("Esta es la lista actual de los autos: \n${lista}")

        }else if (opt==3){
            println("Ingrese el nombre del carro que desea consultar")
            var buscar:String= readLine()!!.toString()
            val buscare = lista.any {carro -> carro.equals(buscar, ignoreCase = true)}
            if (buscare==true) {
                println("El carro que usted buscó fue: ${buscar} ")
                //println(lista.find { it == buscar })
            }else{
                println("El carro ingresado no existe, MMG")
            }
        //Pendiente

        }else if (opt==4){
            println("Ingrese el carro que desea modificar: ")
            var carro:String= readLine()!!.toString()

            println("Ingrese el cambio que desea realizar: ")
            var modifi:String= readLine()!!.toString()

            var cambio=lista.indexOf(carro)
            lista[cambio]=modifi
            println("La lista modificada quedó asi: \n${lista}")

        }else if (opt==5){
            println("Ingrese el nombre del carro que desea eliminar")
            var delete: String= readLine()!!.toString()
            lista.remove(delete)
            println("El carro que usted eliminó fue: ${delete} y la lista quedó asi: \n${lista}")

        }else{
            println("Tu desición no está dentro de las posibilidades. Cacorro!")
        }

        println("Desea realizar otra operacion?")
        i= readLine()!!.toString()

    }while (i == "Si" || i == "SI" || i == "sI" || i == "si")
    println("Gracias.. Pico y Chao")
}