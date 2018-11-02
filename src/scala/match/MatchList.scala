package scala.`match`



object MatchList {
  def main(args: Array[String]): Unit = {
    val arr = Array(3,4,5,6)

    arr match{
      case Array(4, a, b, c) =>println(s"case:$a,$b,$c")
      case Array(_,x,y,z) =>println(s"case:$x,$y,$z")
      case _=>println("not matched")




        }

    val tup = (2,3,4)

    tup match{
      case (3,a,b) =>println(s"case:$a,$b")
      case (_,a,b) =>println(s"case:$a,$b")
      case _ =>println("not matched")
    }

    val list1 = List(0,1,2,3)
    list1 match{
      case 0:: Nil =>println("case1: 0")
      case a::b::c::d::Nil =>println(s"case2: $a,$b,$c,$d") //去掉Nil， d就成了list
      case 0::a =>println(s"case3: $a")
      case _=>println("not matched")
    }


  }

}
