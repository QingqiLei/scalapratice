package scala.method

class LazyDemo {

}

object LazyDemo {
  def main(args: Array[String]): Unit = {
    val property = init() // 没有用lazy 修饰
    println("after init()")
    println(property)
println("+++++++++++++++++")
    lazy val property1 = init() // 用lazy 修饰,惰性变量，只能是不可变变量，
    println("after init()")
    println(property1)
  }


  def init(): Unit = {
    println("run init() ")
  }
}
