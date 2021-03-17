package com.eh.scala.string_interpolation
/**
 * @author    Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since      1.0.00 EH
 */
object StringInterpolation {
  def main(args: Array[String]) {

    val name  = "Md. Emran Hossain"
    val age     = 30
    val cash = 10.5
    println(name + " is " + age + " years olds")
    println(s"$name is $age years olds")             //s string interpolation
    println(f"$name%s is $age%d years olds")    //f string interpolation
    println(f"$name%s is $cash%f cash in hand")    //f string interpolation
    
    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")

  }
}