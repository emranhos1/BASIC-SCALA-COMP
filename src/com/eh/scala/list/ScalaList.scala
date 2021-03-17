package com.eh.scala.list
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaList {

  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
  val names: List[String] = List("Emran", "Hossain", "Emon")

  def main(args: Array[String]) {
    println(myList)
    println(names)

    //List are immutable
    //myList(0) = 2;

    //prepend list
    println(0 :: myList)
    //if print list again it print previous list
    println(myList)

    //Nil is also type of list
    println(Nil)
    println(4 :: 5 :: 6 :: 7 :: Nil)

    //find first value of list
    println(names.head)
    //all the remaining without first one is tail
    println(names.tail)
    //can check list is empty or not
    println(names.isEmpty)
    //List will reverse
    println(myList.reverse)
    println(myList.max)

    println(List.fill(5, 3)(2))

    //iteration
    names.foreach( println )
    var sum = 0;
    myList.foreach(sum +=_)
    println(sum)
    
    //another iteration
    for(name <- names) {
      println(name)
    }
  }
}