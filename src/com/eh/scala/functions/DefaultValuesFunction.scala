package com.eh.scala.functions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object DefaultValuesFunction {

  def main(args: Array[String]) {
    println("Default values : " + Math.add()) // default values will be added
    println("First Default replaced : " + Math.add(35)) // first values will replace and add with second default value
    println("Both Default replaced : " + Math.add(35, 25)) // both default values will be replaced
    println(square(3))

    print(100, 50)

    println(Math.+(35, 25)) //this is not operator overloading
    println(Math * 3)
  }

  //in object function with default value
  object Math {
    def add(x: Int = 20, y: Int = 15): Int = {
      return x + y
    }

    // we can also use operator name as function name
    //this is not operator overloading
    def +(x: Int, y: Int): Int = {
      return x + y
    }

    //this is not operator overloading
    def *(x: Int) = x * x
  }

  def square(x: Int) = x * x

  // if method not return anythings use Unit
  def print(x: Int, y: Int): Unit = {
    println(x + y)
  }
}