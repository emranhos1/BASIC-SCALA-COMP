package com.eh.scala.inheritance
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
class Rectangle(var width: Double,var height: Double) extends Polygon {
  
  override def area: Double = width * height;
}