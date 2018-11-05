package scala.objectoriented
// 与类名相同，被object修饰，
/**
  * 可以相互访问私有方法和属性
  *
  *
  */
class Dog {

private var name = "erha"

  def printName():Unit ={
    println(Dog.CONTANT + name)
  }
}

object Dog{

private val CONTANT="WANGWANG"

  def main(args: Array[String]): Unit = {

    val p = new Dog; // an object
    p.printName()           // output
    println(p.name)         // output
    p.name = "dahuang"
    p.printName()           // output
  }
}
