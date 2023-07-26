package com.MichaelLaiton.application

class Reto2 {
}
fun main(){
    var con: String
    var tot: Float
    var pro: Float
    var cant: Float
    var res: Float=0F
    do {
        println("Ingrese el valor del producto")
        pro= readLine()!!.toFloat()
        println("Cantidad del producto")
        cant= readLine()!!.toFloat()
        println("Desea digitar otro valor?")
        con = readLine()!!.toString()
        tot=pro*cant
        res= res+tot
    } while (con == "Si" || con == "SI" || con == "sI" || con == "si")

    var bola: Int= (1..4).random()
    if (res>50000 && bola==1) {
        println("Su valor a pagar es ${res} \n Sacaste la bola roja obtienes 10% de descuento en el valor de tu compra \n  Tu valor a pagar es ${res-(res*0.10)}")

    }else if(res>50000 && bola==2){
        println("Su valor a pagar es ${res} \n Sacaste la bola azul obtienes 30% de descuento en el valor de tu compra \n Tu valor a pagar es  ${res-(res*0.30)}")
    }
    else if(res>50000 && bola==3){
        println("Su valor a pagar es ${res} \n Sacaste la bola amarilla obtienes 50% de descuento en el valor de tu compra \n Tu valor a pagar es  ${res-(res*0.50)}")
    }
    else if(res>50000 && bola==4){
        println("Su valor a pagar es ${res} \n Sacaste la bola blanca \n ¡FELICITACIONES, TE LLEVAS TU COMPRA TOTALMENTE GRATIS!!!")
    }else
        println("Tu compra no ha sido beneficiada \n Su valor a pagar es ${res}")
}
