package com.eh.scala.functions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ClosureFunction {
  /* A Closure is a function which user one or more variables
  declared outside this function */
  
  //if num is val then this closure is pure closure
  var num = 20
  var add = (x: Int) => x + num
  
  def main(args: Array[String]) {
    // if num change its value result will change
    num = 100
    
    println(add(20))
  }
}