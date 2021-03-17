package com.eh.scala.functions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object SFunction {
  def main(args: Array[String]) {
    println(add(20, 15))
    println(subtract(20, 15))

    //  calling from object
    println(Math.multiply(20, 15))
    println(Math.divide(20, 15))

    //  we can also call like this
    println(Math square 3 )
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  //can avoid return keyword
  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  object Math {

    // can avoid {} for single line
    def multiply(x: Int, y: Int): Int = x * y

    // can avoid declare return type
    def divide(x: Int, y: Int) = x / y
    
    def square (x: Int) = x*x
  }
}