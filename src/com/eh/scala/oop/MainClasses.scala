package com.eh.scala.oop

import com.eh.scala.oop.ScalaClasses.User
import com.eh.scala.oop.ScalaClasses.Employee
import com.eh.scala.oop.ScalaClasses.Employee2
import com.eh.scala.oop.AuxiliaryConstructors.Empl

/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
object MainClasses {

  def main(args: Array[String]) {

    /*==== Scala Classes Example ====*/
    // set values in user
    var user = new User("Emran", 30);
    // get values and print from user
    println("User Name : " + user.name);
    println("User age : " + user.age);
    // set values again in user
    user.name = "Emon";
    user.age = 29;
    // get values and print from user
    println("New User Name : " + user.name);
    println("New User age : " + user.age);
    println("=========================");

    // set values in employee
    var emp = new Employee("Emran", 30);
    // get values and print from employee
    println("Employee Name : " + emp.name);
    println("Employee age : " + emp.age);
    // set values again in employee is not possible because of immutable variable "val"
    println("=========================");

    // set values in employee2
    var emp2 = new Employee2("Emran Hossain", 28);
    // get values and print from employee by method
    // variables are private
    emp2.printValue;
    /*==== Scala Classes Example ====*/

    println("=========================");
    println("=========================");

    /*==== Auxiliary Constructors ====*/
    var auxEmp = new Empl();
    println("Empl Name : " + auxEmp.name + " Empl age : " + auxEmp.age);

    var auxEmp1 = new Empl("Emran");
    println("Empl Name : " + auxEmp1.name + " Empl age : " + auxEmp1.age);
    /*==== Auxiliary Constructors ====*/
  }
}