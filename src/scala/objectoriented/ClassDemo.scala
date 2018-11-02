package scala.objectoriented

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val human = new Human
    println(human.name)
    println(human.climb)
    println(human.fight)
    println(human.distance)

  }

}


trait Flyable{
  val distance:Int = 1000

  def fight:String

  def fly:Unit = {
    println("I can fly")
  }
}

abstract class Animal{
  val name :String
  def run():String

  def climb:String ={
    "i cam climb"
  }
}

class Human extends Animal with Flyable{
  override val name: String = "张三"

  override def run(): String = "i can run"

  override def climb: String = "override climb"

  override def fight: String = "with gun"


  override def fly: Unit =println( " override fly")
}