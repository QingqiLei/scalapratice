package scala.variable

object Basics {
  def main(args: Array[String]): Unit = {

    val x = 3
    val y = if (x > 1) 1 else -1 // if statement

    val z = if (x > 1) 1 else if (x < 1) -1 else 0 // if if statement
    1 to 10
    1.to(10) // to is a method
    println(1 to 6)
    println(1 until 6) // without 6
    for (i <- 1 to 5) { // more compact than java
      print(i)
    }
    println()
    val arr = Array("java ", "scala ", "C#\n") // array
    for (i <- arr) print(i)
    // two variables in for loop
    for (i <- 1 to 3; j <- 1 to 3) if (i != j) print(i * 10 + j + " ")
    println()

    println(for (i <- 1 until 10) yield i) // store variable in a vector
    println(1 + 2)
    println(1.+(2)) // + is a method
    println(plus(3, 4)) // plus is a method defined below
    println(f1(2, 3)) // f1 is a function
    println(m2(f1)) // input function as a parameter into a method
    val f2 = m2 _ // convert method to function
    println(f2(f1))   // ......
    val arr1 = new Array[Int](8) // 8 is the length of the array
    val arr2 = new Array[String](8)
    println("Array[String](8).length: "+ arr2.length)
    val arr3 = Array("h", "df", "e") // static class, don't need to use new

    println(arr2.toBuffer) // convert array to ArrayBuffer
    println(arr3(2)) // e, the third one
    import scala.collection.mutable.ArrayBuffer
    val arr4 = ArrayBuffer[Int]() // ArrayBuffer is mutable, Array is immutable
    arr4 += 1
    arr4 += (434)
    arr4 ++= Array(5, 6)
    arr4 ++= ArrayBuffer(6, 3, 2)
    println("arr4: "+ arr4)
    arr4.insert(0, -1, -2) // 在第0个元素加入后面的元素
    println("arr4: "+arr4)

    arr4.remove(0, 2) // delete 2 elements from 0 index
    println("arr4: "+arr4)
    val arr5 = Array(1, 2, 3, 4, 5, 6)
    for (i <- arr5) print(i + " ")
    println() // 1 2 3 4 5 6
    for (i <- 0 until arr5.length) print(i + " ")
    println() // 0 1 2 3 4 5
    for (i <- (0 until arr5.length).reverse) print(arr5(i) + " ")
    println() // 6 5 4 3 2 1
    val arr6 = for (i <- arr5) yield i + 10
    println(arr6.toBuffer)
    println(arr6.min)
    println(arr6.max)
    println(arr6.sorted.toBuffer) //


  }

  def plus(x: Int, y: Int): Int = x + y // this is a method, require two Int parameters, returns a Int(x + y)
  def m2(f: (Int, Int) => Int) = f(2, 3) //方法
  val f1 = (x: Int, y: Int) => x - y // function 函数
}
