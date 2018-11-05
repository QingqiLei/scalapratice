

import scala.util.Random

object MatchType{
  def main(args: Array[String]): Unit = {
    val arr = Array("abcx",100,3.24,true,MatchType)
    val element = arr(Random.nextInt(arr.length))
    println(element)

    element match{
      case str:String =>println(s"match String: $str")
      case int:Int => println(s"match int: $int")
      case bool: Boolean=>println(s"match Boolean: $bool")
      case matchTest: MatchTest=> println(s"match MatchTest: $matchTest")
      case _:Any=>println("not matched")
    }
  }
}

class MatchTest{

}
