package com.eh.scala.do_while
/**
 * @author    Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since      1.0.00 EH
 */
object DoWhile {
  def main(args: Array[String]) {

    var x = 0

    while (x < 10) {
      println("x = " + x) // always check condition before print
      x += 1
    }

    var y = 0
    do {
      println("y = " + y) // always print one and then check condition
      y += 1
    } while (y < 10)
  }
}