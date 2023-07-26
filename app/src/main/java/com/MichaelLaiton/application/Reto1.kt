package com.MichaelLaiton.application

class Reto1 {
}
fun main(){
    println("los dados se lanzaron")
    var random: Int=(1..6).random()
    var random1: Int=(1..6).random()
    println("El resultado del primer dado es: ${random} y el otro dado fue: ${random1}")
    if(random==1 && random1==1){
        println("Usted ha ganado, ya que obtuvo dos o sea, sacó un par de unos")
    }else if(random==1 && random1==2 || random==2 && random1==1){
        println("Usted ha ganado, ya que la suma de sus dados es igual a tres")
    }else if(random==5 && random1==6 || random==6 && random1==5){
        println("Usted ha ganado, ya que la suma de sus dados es igual a once")
    }else if(random==6 && random1==6){
        println("Usted ha ganado, ya que sacó par de seis")
    }else if(random==1 && random1==6 || random==6 && random1==1 || random==3 && random1==4 || random==4 && random1==3
        || random==5 && random1==2 || random==2 && random1==5){
        println("Usted ha ganado, ya que sacó un total de siete")
    }else{
        println("Usted ha perdido")
    }
}