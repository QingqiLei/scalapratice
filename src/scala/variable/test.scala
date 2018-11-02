package scala.variable

object test {
  def main(args: Array[String]): Unit = {

    val list0 = List(8,81,2,3,4,5,6,7) // 返回一个新的list，表示使用不可变类型

    val list2: List[Int] = list0.map(_ * 2)   // 下划线表示每一个元素

    println(list0.map(_ * 2))


    println( list0.filter(_%2 == 0))


    println(list0.sorted)

    println(list0.reverse)

    println(list0.grouped(4).toBuffer)

    println(list0.grouped(4).toBuffer.toList)

    println(list0.grouped(4).toBuffer.toList.flatten)

    val lines = List("hello java jello sca","fs adf e f ")
    println( lines.map(_.split(" ")).flatten)

    println(lines.flatMap(_.split(" ")))

    val arr = Array(1,2,3,4,5,6,7,8,9,10)
    println(arr.par.sum) //parallel, using multi processor

    println(arr.reduce(_+_))  // first element and second element 55
    println(arr.reduceLeft(_+_))
    println(arr.par.reduce(_+_))
    println(arr.par.reduce(_-_)) // the result is not stable, prove that it's parallel

    println(arr.fold(20)(_+_))
    println(arr.fold(10000)(_+_))
    println(arr.par.fold(1000)(_+_)) // multi threads, the result is not stable

    println(arr.foldLeft(1000)(_+_))
    println(arr.foldRight(1000)(_+_))
    println(arr.foldRight(1000)(_-_))
    println(arr.foldLeft(1000)(_-_))
    println(arr.par.foldLeft(1000)(_-_)) // stable


    val list1 = List(List(1,2,3), List(4,5), List(6,7))
    println(list1.flatten.reduce(_+_))
    println(list1.aggregate(10)(_+_.sum,_+_)) // 局部聚合，全局聚合

    val l1 = List(1,2,3)
    val l2 = List(2,3,4)
    println(l1 union l2)

    println(l1 intersect l2)

    println( l1 diff l2)

  }

}
