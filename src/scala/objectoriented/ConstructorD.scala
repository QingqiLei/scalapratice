package scala.objectoriented
                                                 // immutable defaultly
class ConstructorD(val name: String, var age: Int,  faceValue: Int) {

  var gender: String = _

  def getFaceValue(): Int = { // this is a method, 方法, return Int
    faceValue   // the last line is returned automatically
  }
  // auxiliary constructor, 相当于java中多个构造函数
  def this(name: String, age: Int, faceValue: Int, gender: String) {
    this(name, age, faceValue) // constructor
    this.gender = gender
  }
}

object ConstructorD {
  def main(args: Array[String]): Unit = {

    val ss = new ConstructorD("name", 4, 5, "nan")

    val s = new ConstructorD("ningning", 1, 3);

    println(s.name)
    println(s.age)
    // can not get it directly
//        println(s.faceValue)  // this is cause we didn't use val or var,
    println(s.getFaceValue())
    println(ss.gender)
  }
}

/**
  * summary
  * 1. auxiliary constructor
  * 2. class ConstructorD(val name: String, var age: Int,  faceValue: Int)
  *
  * faceValue is immutable, but can not reached directly
  *
  * 3. return the last line in a method
  */
