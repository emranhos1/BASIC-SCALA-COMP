package com.eh.scala.if_else
/**
 * @author    Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since      1.0.00 EH
 */
object IfElse {
  def main(args: Array[String]) {
    val x = 30
    var response = ""

    if (x == 20) {
      response = "x == 20"
    } else {
      response = "x != 20"
    }

    println(response)

    val response2 = if (x >= 20) "x  >=  20" else "x < 20"

    println(response2)
  }
}