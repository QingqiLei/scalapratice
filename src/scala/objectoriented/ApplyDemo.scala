package scala.objectoriented

private [objectoriented] class ApplyDemo(val name: String, var age: Int, var faceValue:Int) {

}

object ApplyDemo{
  def apply(name:String, age:Int, faceValue:Int):ApplyDemo=new ApplyDemo(name,age,faceValue)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
    if(applyDemo == null){
      None
    }else{
      Some(applyDemo.name, applyDemo.age,applyDemo.faceValue)
    }
  }
}


object Test{
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo("jingjing",3,34)
    applyDemo match {
      case ApplyDemo("jingjing",age, faceValue)=>println(s"age:$age")
      case _=> println("no match matching")
    }
  }
}
