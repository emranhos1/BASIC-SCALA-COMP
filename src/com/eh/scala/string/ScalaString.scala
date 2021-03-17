package com.eh.scala.string
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaString {

  val str1: String = "Hello World";
  val str2: String = " Emran";
  val num1 = 75;
  val num2 = 85.20;

  def main(args: Array[String]) {
    // Find String length
    println("Length is : " + str1.length());

    // Concatenates
    println(str1.concat(str2));
    println(str1 + str2);
    
    //Formatting
    println("(%d -- %f -- %s)".format(num1, num2, str1));
    printf("(%d -- %f -- %s)", num1, num2, str1);
  }
}