package com.eh.scala.oop
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object ScalaClasses {
  //          Getter?    Setter?
  //------    -------    -------
  // var        yes        yes
  // val        yes        no
  // default    no         no

  // while define var
  // for this class getter and setter is available
  class User(var name: String, var age: Int);

  // while define val
  // for this class getter is available but setter is not available
  class Employee(val name: String, val age: Int);

  // while define private val
  // variable can't accessible outside the class
  class Employee2(private var name: String, private var age: Int) {

    def printValue {
      println("Name from class by method: " + name)
      println("Age from class by method: " + age)
    }
  };

}