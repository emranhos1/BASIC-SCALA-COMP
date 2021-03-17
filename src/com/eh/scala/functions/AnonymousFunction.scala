package com.eh.scala.functions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object AnonymousFunction {
  def main(args: Array[String]) {

    // it does not have function name
    // this is a anonymous function.
    // it add two Int and returns result
    // and assign the result to var add
    var add = (x: Int, y: Int) => x + y

    println(add(300, 200))
  }
}