package scala.variable

import scala.collection.mutable.HashMap

object threecontainers {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = 0 :: list1
    println(list2)
    println(list2.::(5))

    println(0 +: list2)

    println(list1 :+ 4)
    println(list1 ++ list2)

    import scala.collection.mutable.ListBuffer
    val listBuffer1 = ListBuffer(1, 2, 3)
    listBuffer1 += 4
    println(listBuffer1)
    listBuffer1.append(1)
    val listBuffer2 = ListBuffer(1, 2, 3, 4)

    println(listBuffer1)
    listBuffer1 ++= listBuffer2
    println(listBuffer1)
    println(listBuffer2)


    println(listBuffer1 ++ listBuffer2) // 合并生成新的list

    listBuffer1 :+ 100 // yield a new list

    println("+++++++++++++++++")
    import scala.collection.immutable.HashSet

    val set1 = new HashSet[Int]()
    val set2 = set1 + 1
    println(set1)
    println(set2)
    val set3 = set2 ++ Set(2, 3, 4, 5)
    println(set3)


    val set11 = new scala.collection.mutable.HashSet[Int]()
    set11 += 1
    println(set11.add(4))
    println(set11 ++= Set(34, 23, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5))

    println(set11 -= 1)
    println(set11.remove(5))
    println("+++++++++++++")

    val map1 = new HashMap[String, Int]()
    map1.put("first",1)
    println(map1)
    map1("second") = 2
println()
    println( map1 +=(("third",3),("fourth",4)))
    println(map1 -= "first")
    println(map1.remove("second"))
    println(map1)


  }

}
