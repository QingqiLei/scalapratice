package scala.variable

import scala.collection.mutable
import scala.collection.mutable.HashMap

object ThreeContainers {
  def main(args: Array[String]): Unit = {
    // List
    val list1 = List(1, 2, 3)
    val arr = Array("java ", "scala ", "C#\n") // Array
    val t = ("java",1,1L,3.14,(1,"45")) // tuple
    val list2 = 0 :: list1      // return a new list, list1 isn't changed
    println("0 list1: "+ list1) //
    println("1 list2: "+list2)
    println("2 list2: "+list2.::(5)) // add 5
    println("3 list2: "+ (0+: list2))  // add 0, (::)(.::)(+:) they are the same, add element to the end(leftest)

    println(list1 :+ 4) // add to tail, return a new list
    println(list1 ++ list2)

    import scala.collection.mutable.ListBuffer
    val listBuffer1 = ListBuffer(1, 2, 3)  // mutable,
    listBuffer1 += 4
    println("1 listbuffer1: "+listBuffer1)
    listBuffer1.append(1)
    val listBuffer2 = ListBuffer(1, 2, 3, 4)

    println("2 listbuffer1: "+listBuffer1)
    listBuffer1 ++= listBuffer2
    println("3 listbuffer1: "+listBuffer1)
    println("4 listbuffer2: "+listBuffer2)


    println(listBuffer1 ++ listBuffer2) // 合并生成新的list


println(listBuffer1 :+ 100) // return a new list
    println("+++++++++++++++++")
    import scala.collection.immutable.HashSet

    val set1 = new HashSet[Int]()
    val set2 = set1 + 1
    println(set1)
    println(set2)
    val set3 = set2 ++ Set(2, 3, 4, 5)
    println("3 set3: "+set3)  // don't keep the order


    val set11 = new scala.collection.mutable.HashSet[Int]()
    set11 += 1
    println(set11.add(4))
    println(set11 ++= Set(34, 23, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5)) // the element can only appear once

    println(set11 -= 1) // remove 1
    println(set11.remove(5)) // remove 5
    println("+++++++++++++")


    val map1 = new HashMap[String, Int]()
    map1.put("first",1)
    println(map1)
    map1("second") = 2
    println( map1 +=(("third",3),("fourth",4)))
    println(map1 -= "first")
    println(map1.remove("second"))
    println(map1)

    import scala.collection.immutable.HashMap
    val map2 = new HashMap[String, Int]{} //immutable
//    map2.put("first",1) // Exception

  }

}
