package scala.variable

object MapTupleArray {
  def main(args: Array[String]): Unit = {

    // map
    val map1 = Map("scala" ->1, "java"->2, "python"->3)
    val map2 = Map(("scala",1),("java",2),("python",3))  // same
//    map1("scala") = 2 // Exception, cause this map is immutable
    println(map1("scala"))

    import scala.collection.mutable.Map // make the map
    val map3 = Map("scala" ->1, "java"->2, "python"->3)
//    map2("scala") = 2 // Exception, map2 is still immutable
    map3("scala") = 6
    println("map3: "+map3)
    println(map3.getOrElse("C",-1))

    // tuple
    val t = ("java",1,1L,3.14,(1,"45")) // tuple, indexing from 1
    println(t._1) // the first element
    println(t._5)
    println(t._5._2)

    //tuple
    val tt,(a,b,c,d) = ("scala","100",1,("spark",1))
    println(a)
    println(c)
    val arr = Array(("tingting",24),("ningning",25),("xiaoxiao",36)) //

    //  Array(tuple) to map
    println(arr.toMap)

    // Arrays to map
    val arr1 = Array("tingting","ningning","xingxing")
    val arr2 = Array(23,24,25,26,27,28)
    val res = arr1 zip arr2
    println(res.toBuffer)

  }
}
