package com.eh.scala.oop

object AuxiliaryConstructors {

  class Empl(var name: String, var age: Int) {

    def this(){
      this("=====", 0);
    }
    
    def this(name: String){
      this(name, 0);
    }
  };
}