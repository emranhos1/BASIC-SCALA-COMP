package com.eh.scala.functions
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object CurryingFunction {

  def add(x: Int, y: Int) = x + y

  //Currying function
  def add2(x: Int) = (y: Int) => x + y;
  def add3(x: Int)(y: Int) = x + y;

  def main(args: Array[String]) {
    println("Normal Function : "+add(20, 10));

    //Currying function called
    println("Curring Function add2 : "+add2(20)(10));
    println("Curring Function add3  : "+add3(20)(10));
  }
}