package com.eh.scala.higher_order_method.map_filter_flatten_flatmap
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object MapFilterFlattenFlatMap {
  val myList = List(1, 2, 3)
  val myMap = Map(801 -> "Emran", 802 -> "Hossain", 803 -> "Emon");

  def main(args: Array[String]) {
    println(myList.map(_ * 2));
    println(myList.map(x => x * 2));
    println(myList.map(x => "Hi " + x));
    println(myList.map(x => "Hi " * x));

    println(myMap.map(x => "Hi " + x));
    println(myMap.mapValues(x => "Hi " + x));
    // we can use map with string
    println("hello".map(_.toUpper));

    //flatten
    println(List(List(1, 2, 3), List(3, 4, 5)));
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten);

    println(myList.flatMap(x => List(x, x + 1)));
    println(myList.filter(x => x % 2 != 0));
  }

}