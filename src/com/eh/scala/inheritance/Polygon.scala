package com.eh.scala.inheritance
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
class Polygon {
  def area: Double = 0.0;
}

object Polygon {

  def main(args: Array[String]) {
    var poly = new Polygon;
    var rect = new Rectangle(40.0, 30.0);
    var tria = new Triangle(40.0, 30.0);
    printArea(poly);
    printArea(rect);
    printArea(tria);
  }
  
  def printArea(p: Polygon){
    println(p.area);
  }
}