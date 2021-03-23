package com.eh.scala.trait_scala
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
class Triangle(var width: Double, var height: Double) extends Polygon with Shape {

  override def area: Double = width * height / 2;
  override def color: String = "Triangle Color Green";
}