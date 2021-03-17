package com.eh.scala.match_expressions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object MatchExpressions {
  def main(args: Array[String]) {

    val age = 23
    //statement
    age match {
      case 20 => println("case 20 match")
      case 25 => println("case 25 match")
      case 30 => println("case 30 match")
      case _ => println("case default match")
    }

    //expression
    val result = age match {
      case 20 => age
      case 23 => age
      case 25 => age
      case _ => "default"
    }
    println("result = " + result)

    val i = 8
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("Odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }
}