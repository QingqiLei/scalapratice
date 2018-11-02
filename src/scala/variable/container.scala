package scala.variable

object container {
  def main(args: Array[String]): Unit = {
    val map1 = Map("scala" ->1, "java"->2, "python"->3)
    val map2 = Map(("scala",1),("java",2),("python",3))  // same
    println(map1("scala"))

    import scala.collection.mutable.Map
    val map3 = Map("scala" ->1, "java"->2, "python"->3)
    map3("scala") = 6
    println(map3)
    println(map3.getOrElse("C",-1))

    val t = ("java",1,1L,3.14,(1,"45")) // tuple, indexing from 1
    println(t._1)
    println(t._5._2)
    val tt,(a,b,c,d) = ("scala","100",1,("spark",1))
    println(a)
    val arr = Array(("tingting",24),("ningning",25),("xiaoxiao",36)) // list(tuple) to map
    println(arr.toMap)

    val arr1 = Array("tingting","ningning","xingxing")
    val arr2 = Array(23,24,25,26)
    val res = arr1 zip arr2
    println(res.toBuffer)





  }
}
