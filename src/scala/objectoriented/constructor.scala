package scala.objectoriented

class constructor(val name: String, var age: Int, faceValue:Int) {
var gender:String = _
  def getFaceValue():Int = {
    faceValue
  }

  def this(name:String, age: Int, faceValue: Int, gender:String){
    this(name,age,faceValue)
    this.gender = gender
  }
}

object constructor{
  def main(args: Array[String]): Unit = {
    val ss = new constructor("name",4,5,"nan")

    val s = new constructor("ningning",1,3);
    println(s.name)
    println(s.age)
//    println(s.faceValue)
println(s.getFaceValue())
    println(ss.gender)
  }
}
