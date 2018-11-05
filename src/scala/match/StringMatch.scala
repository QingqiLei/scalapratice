

import scala.util.{Random}

object StringMatch{
  def main(args: Array[String]): Unit = {
    val arr = Array("s","f","a","v")
    val name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
      case "s" =>println("s")
      case "f" =>println("f")
      case "a" =>println("a")
      case "v" =>println("v")
      case _ => println("nothing")

    }
  }
}
