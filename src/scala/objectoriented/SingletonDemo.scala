package scala.objectoriented

import scala.collection.mutable.ArrayBuffer

/**
  * SingletonDemo and SessionFactory are singleton objects
  * also called static class,
  */
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    val factory =  SessionFactory
    println(factory.getSession) // get a list
    println(factory.getSession.size)
    println(factory.getSession(0)) // 0 means the first element in the list
    println(factory.removeSession) //
  }
}

object SessionFactory{ // 单例对象，也叫静态类, 伴生对象一定是单例对象，单例对象不一定是伴生对象
  println("SessionFactory run")
  var i = 5
  private val session = new ArrayBuffer[Session]()

  while(i >0){
    session += new Session // add Session to the list
    i -=1
  }

  def getSession = session

  def removeSession:Unit = {
    val s = session(0)
    session.remove(0)
    println("remove "+s)

  }
}

class Session{}