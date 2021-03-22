package com.eh.scala.options
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaOptions {
  val myList = List(1, 2, 3)
  val myMap = Map(801 -> "Emran", 802 -> "Hossain", 803 -> "Emon");
  val opt1 : Option[Int] = Some(10);
  val opt2 : Option[Int] = None;
  
  // Scala - options give two kind of results (Some or None)
  def main(args: Array[String]) {
    println(myList.find(_ > 6))
    println(myList.find(_ > 2))
    // if there is no value while use .get then it throw exception
    println(myList.find(_ > 2).get)
    println(myMap.get(801))
    println(myMap.get(801).get)
    // better way to use getOrElse instense of get
    // for prevent exception
    println(myMap.get(83).getOrElse("No Name Found"))
    println(opt1.isEmpty)
    println(opt2.isEmpty)
    println(opt1.get)
    
  }
}