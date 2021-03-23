package com.eh.scala.trait_scala
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */

// extends Polygon with Shape
// here Shape is trait
class Rectangle(var width: Double, var height: Double) extends Polygon with Shape {

  override def area: Double = width * height;
  override def color: String = "Rectangle Color Red";
}