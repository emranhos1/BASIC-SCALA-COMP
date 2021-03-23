package com.eh.scala.lazy_evaluation
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object LazyEval2 {
  def method1(n: Int) {
    println("Method 1")
    println(n)
  }

  def method2(n: => Int) {
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]) {
    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }

    method1(add(5, 6));
    method2(add(6, 7));
  }
}