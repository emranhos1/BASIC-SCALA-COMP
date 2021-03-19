package com.eh.scala.tuples
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaTuples {
  val myTuple1 = (1, 2, "Hello", true);
  val myTuple2 = new Tuple3(1, 2, "Hello");
  val myTuple3 = new Tuple4(1, 2, "Hello", (1, 3));
  def main(args: Array[String]) {

    println(myTuple1)
    println(myTuple2._1)
    println(myTuple2._2)
    println(myTuple2._3)
    println(myTuple2._3)
    println(myTuple3._4._2)

    myTuple1.productIterator.foreach {
      i => println(i)
    }

    // -> this sign join two element in a tuple
    println(1 -> "Emran" -> true)

  }
}