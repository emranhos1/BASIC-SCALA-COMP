package com.eh.scala.for_loop
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ForLoop {
  def main(args: Array[String]) {

    for (i <- 1 to 5) {
      println("i using to " + i)
    }
    println("----------------")

    for (i <- 1 until 5) {
      println("i using until " + i)
    }
    println("==========")

    // or we can use this
    for (i <- 1.to(5)) {
      println("i using to " + i)
    }
    println("----------------")

    for (i <- 1.until(5)) {
      println("i using until " + i)
    }
    println("==========")

    // nested loop
    for (i <- 1.until(5); j <- 1.to(2)) {
      println("i using multipale range for until i =" + i + " & for to j =" + j)
    }
    println("==========")

    // list in loop
    var lst = List(1, 2, 3, 4, 54, 34, 23, 4, 3, 2)
    for (i <- lst) {
      println("i using list " + i)
    }

    // loop for filter list
    for (i <- lst; if (i <23)) {
      println("i using list whit filter " + i)
    }
    
    // loop as expression
    val result = for {i <- lst} yield {
      i*i
    }
    println("result " + result)
  }
}