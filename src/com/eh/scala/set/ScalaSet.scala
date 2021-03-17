package com.eh.scala.set
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaSet {

  val mySet: Set[Int] = Set(1, 2, 3, 4, 5, 6, 4, 4)
  val names: Set[String] = Set("Emran", "Hossain", "Emon")

  def main(args: Array[String]) {
    //print without duplicate value
    println(mySet)

    println(mySet + 10)
    println(mySet)

    //it not position it returns boolean value
    println(mySet(8))
    println(names("Emran"))

    //find first value of Set
    println(names.head)
    //all the remaining without first one is tail
    println(names.tail)
    //can check Set is empty or not
    println(names.isEmpty)

    //concatenation
    val mySet1: Set[Int] = Set(1, 2, 3, 4, 5, 6)
    val mySet2: Set[Int] = Set(7, 8, 9, 0, 1, 2)

    // also remove duplicate values
    println(mySet1 ++ mySet2)
    println(mySet1.++(mySet2))
    //intersection
    println(mySet1.&(mySet2))
    println(mySet1.intersect(mySet2))

    println(mySet.max)
    println(mySet.min)

    //iteration
    names.foreach(println)
    var sum = 0;
    mySet.foreach(sum += _)
    println(sum)

    //another iteration
    for (name <- names) {
      println(name)
    }

  }
}