package com.eh.scala.higher_order_method.map
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaMap {
  val myMap1: Map[Int, String] = Map(801 -> "Emran", 802 -> "Hossain", 803 -> "Emon");
  val myMap2: Map[Int, String] = Map(804 -> "Khan");

  def main(args: Array[String]) {

    println(myMap1)
    println(myMap1(801))
    println(myMap1.keys)
    println(myMap1.values)
    println(myMap1.isEmpty)

    //iteration
    myMap1.keys.foreach { key =>
      println("Key : " + key +", value : " + myMap1(key))
    }
    
    println(myMap1.contains(801))
    println(myMap1 ++ myMap2)
  }
}