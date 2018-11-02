package scala.objectoriented

// 默认public
class Person {
  // 属性， 不可变性，相当于只有get方法，var 有get 和set
val id :String = "100"

  var name: String =_

  private var age:Int = _
  private[this] val gender = "男"  // 只有本类可以访问

}

object Person{ // 伴生对象
  def main(args: Array[String]): Unit = {
    val p = new Person()

    println(p.id )
    p.age = 19
    println(p.age )
  }
}

object Test1{

}
