package com.eh.scala.lazy_evaluation
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */

class strict {
  val e = {
    println("strict")
    9
  }
}

class lazyEval {
  lazy val l = {
    println("lazy")
    9
  }
}

object LazyEval1 {
  def main(args: Array[String]) {
    var x = new strict;
    var y = new lazyEval;
    
    // run with those two print after first run
    //println(x.e);
    //println(y.l);
  }
}