package com.eh.scala.reduce_fold_scan
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object Scan {
  val myList1 = List(1, 2, 3);
  val myList2 = List("A", "B", "C");

  def main(args: Array[String]) {
    println("From left to right : " + myList1.scanLeft(10)(_ + _))
    println("From right to left : " + myList1.scanRight(10)(_ + _))

    println(myList2.scanLeft("Z")(_ + _))
  }
}