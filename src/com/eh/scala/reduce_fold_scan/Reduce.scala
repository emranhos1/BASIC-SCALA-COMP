package com.eh.scala.reduce_fold_scan
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object Reduce {
  val myList1 = List(1, 2, 3);
  val myList2 = List("A", "B", "C");

  def main(args: Array[String]) {
    println("From left to right : " + myList1.reduceLeft(_ + _))
    println("From left to right : " + myList1.reduceLeft(_ - _))
    println("From right to left : " + myList1.reduceRight(_ + _))
    println("From right to left : " + myList1.reduceRight(_ - _))

    println(myList2.reduceLeft(_ + _))
  }
}