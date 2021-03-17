package com.eh.scala.array
/**
 * @author    Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since      1.0.00 EH
 */
object ScalaArray {

  //declaration of array
  //Array are mutable
  val myArray1: Array[Int] = new Array[Int](4);
  val myArray2 = new Array[Int](5);
  val myArray3 = Array(5, 4, 5, 6, 7, 8, 9, 0);

  def main(args: Array[String]) {

    //assign array
    myArray1(0) = 10;
    myArray1(1) = 20;
    myArray1(2) = 30;
    myArray1(3) = 40;

    //print myArray1
    for (x <- myArray1) {
      println("From myArray1 : " + x)
    }

    println("From myArray1 : " + myArray1)

    for (i <- 0 to (myArray1.length - 1)) {
      println("From myArray1 : " + myArray1(i))
    }

    //while myArray2 is not assigned
    //print myArray2
    //it print default value of data type
    println("From myArray2 : " + myArray2)
    for (x <- myArray2) {
      println("From myArray2 : " + x)
    }
  }
}