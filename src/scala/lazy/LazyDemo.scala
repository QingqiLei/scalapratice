package scala.method

object LazyDemo {
  def main(args: Array[String]): Unit = {
    val property = init()      //  not lazy
    println("after init()")
    println(property)
println("+++++++++++++++++")
    lazy val property1 = init() //  lazy,只能是不可变变量(val or immutable)，
    println("after init()")
    println(property1)
  }


  def init(): Unit = {
    println("run init() ")
  }
}
