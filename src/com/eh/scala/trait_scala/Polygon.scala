package com.eh.scala.trait_scala
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */

// Multiple inheritance in Scala 
// is not Possible Without Trait
trait Shape {
  def color: String;
}

abstract class Polygon {
  // abstract method ensure that subclass must override it
  def area: Double;
}

object Polygon {

  def main(args: Array[String]) {
    var rect = new Rectangle(40.0, 30.0);
    var tria = new Triangle(40.0, 30.0);
    printArea(rect);
    printColor(rect);
    printArea(tria);
    printColor(tria);
  }

  def printArea(p: Polygon) {
    println(p.area);
  }

  def printColor(s: Shape) {
    println(s.color);
  }
}