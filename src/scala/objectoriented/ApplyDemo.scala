package scala.objectoriented

private [objectoriented] class ApplyDemo(val name: String, var age: Int, var faceValue:Int) {
}

/**
  * apply method, also called injection method, we use it to initialization operation
  *
  * apply method 参数列表不需要和构造器一致
  *
  * unapply returns a Option, a Some object inside the Option.
  *
  * apply and unapply would be called implicitly
  */
object ApplyDemo{

  def apply(name:String, age:Int, gender:Int,faceValue:Int):ApplyDemo=new ApplyDemo(name,age,faceValue) // initialize, there is a method called apply, also called injection

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
    val applyDemo = ApplyDemo("jingjing",3,0,34)
    applyDemo match {
        // match, like the switch case in Java,
      case ApplyDemo("jingjing",age, faceValue)=>println(s"age:$age")// S $ is the grammar, using the unapply method
      case _=> println("no match matching")
    }
  }
}
