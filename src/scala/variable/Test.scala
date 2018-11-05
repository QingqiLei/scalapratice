package scala.variable

object Test {
  def main(args: Array[String]): Unit = {
    // list
    val list0 = List(8,81,2,3,4,5,6,7) // 返回一个新的list，表示使用不可变类型
    //
    val list2: List[Int] = list0.map(_ * 2)   // 下划线表示每一个元素

    println(list0)
    println("1: "+list0.map(_ * 2)) // multiply 2， return a new list


    println( "2: "+list0.filter(_%2 == 0)) //  multiples of 2


    println("3: "+list0.sorted)

    println("4: "+list0.reverse)

    println("5: "+list0.grouped(4).toBuffer) // divide element to two groups

    println("6: "+list0.grouped(4).toBuffer.toList)

    println("7: "+list0.grouped(4).toBuffer.toList.flatten) //make the list flat

    val lines = List("hello java jello sca","fs adf e f ") //two Strings
    println("8: "+ lines.map(_.split(" ")).flatten)

    println("9: "+lines.flatMap(_.split(" ")))  // same

    val arr = Array(1,2,3,4,5,6,7,8,9,10)
    println("10: "+arr.par.sum) //parallel, using multi processor

    println("11: "+arr.reduce(_+_))  // first element and second element 55
    println("12: "+arr.reduceLeft(_+_))
    println("13: "+arr.par.reduce(_+_))
    println("14: "+arr.par.reduce(_-_)) // the result is not stable, prove that it's parallel

    println("15: "+arr.fold(20)(_+_)) // + 20 to the result
    println("16: "+arr.fold(10000)(_+_))
    println("17: "+arr.par.fold(1000)(_+_)) // multi threads, the result is not stable

    println("18: "+arr.foldLeft(1000)(_+_))
    println("19: "+arr.foldRight(1000)(_+_))
    println("20: "+arr.foldRight(1000)(_-_))
    println("21: "+arr.foldLeft(1000)(_-_))
    println("22: "+arr.par.foldLeft(1000)(_-_)) // stable


    val list1 = List(List(1,2,3), List(4,5), List(6,7))
    println("23: "+list1.flatten.reduce(_+_))
    println("24: "+list1.aggregate(10)(_+_.sum,_+_)) // 局部聚合，全局聚合

    val l1 = List(1,2,3)
    val l2 = List(2,3,4)
    println("25: "+l1 union l2)

    println("26: "+l1 intersect l2)

    println("27: "+ l1 diff l2)

  }

}
