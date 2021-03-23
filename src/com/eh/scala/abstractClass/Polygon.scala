package com.eh.scala.abstractClass
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
abstract class Polygon {
  // abstract method ensure that subclass must override it
  def area: Double;
}

object Polygon {

  def main(args: Array[String]) {
    var rect = new Rectangle(40.0, 30.0);
    var tria = new Triangle(40.0, 30.0);
    printArea(rect);
    printArea(tria);
  }
  
  def printArea(p: Polygon){
    println(p.area);
  }
}