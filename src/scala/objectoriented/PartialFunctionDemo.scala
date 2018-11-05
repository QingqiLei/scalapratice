package scala.objectoriented

object PartialFunctionDemo {


  def main(args: Array[String]): Unit = {
    println(m1("one"))
    println(m2("two"))
  }



  def m1: PartialFunction[String, Int] = {
    case "one" => {

      println("case 1")  // output
      1                  // output
    }

    case "two" => {

      println("case 2")
      2
    }
  }

  def m2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2         //output
    case _ => 0
  }

}
