package com.eh.scala.functions

import java.util.Date
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object PartiallyAppliedFunction {

  def main(args: Array[String]) {

    val sum = (x: Int, y: Int, z: Int) => x + y + z // Anonymous function
    println("From Anonymous Function : " + sum(30, 20, 10))

    // Partially Applied
    // we can use _ as wild card, that mean we can pass anything here.
    val add = sum(30, 20, _: Int) // here we fixed 1st two argument
    println("From Partially Applied : " + add(10)) // pass 3rd argument because we already fixed 1st two argument

    val newLog = log(new Date, _: String)

    newLog("First Execption")
    newLog("Second Execption")
  }

  def log(date: Date, message: String) = {
    println(date + "  " + message)
  }
}