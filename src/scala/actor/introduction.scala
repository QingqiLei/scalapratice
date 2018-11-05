package actor

/**
  * 装饰模式 指的是在不必改变原类文件和使用继承的情况下, 动态地扩展一个对象的功能，
  * 创建一个包装对象,
  */
class introduction {
}

object introduction {
  def main(args: Array[String]): Unit = {
    println(func(4))
    val arr = Array(1, 2, 3, 4, 5)
    arr.map(x => func(x)).foreach(x => print(x + " "))

    println("\n"+carrying(4)(5)) // 4 * 5
    println(carry(5)) // 3 * 5

    println(m2(4))    //  20
    println(m2(4)(2)) // 8
    println(m2(4))    // 400

    val arr1 = Array(("scala",1),("scala",2),("scala",3))
    println(arr1.foldLeft(0)(_+_._2))
    println(m3(6)(5))
  }


  val func: Int => Int = x => x * x //function

  def m1(x:Int):Int  = x* x  //method

  def carrying(x:Int)(y:Int):Int= x*y  //

  def m3(x:Int) = (y:Int)=>x*y  // same with the above one

  def m2(x:Int)(implicit y:Int = 5):Int = x*y // give a implicit

  val carry = carrying(3)_ // a method calls a function
  implicit val abc = 100
//  implicit  val abcd = 1000  // Exception, ambiguous implicit values


}
