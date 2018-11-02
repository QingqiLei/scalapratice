package scala.objectoriented

import scala.collection.mutable.ArrayBuffer

object SingletonDemo {
  def main(args: Array[String]): Unit = {
    val factory =  SessionFactory
    println(factory.getSession)
    println(factory.getSession.size)
    println(factory.getSession(0))
    println(factory.removeSession)
  }

}

object SessionFactory{ // 单例对象，也叫静态类, 伴生对象一定是单例对象，单例对象不一定是伴生对象
  println("SessionFactory run")
  var i = 5
  private val session = new ArrayBuffer[Session]()

  while(i >0){
    session += new Session
    i -=1
  }

  def getSession = session
  def removeSession:Unit = {
    val s = session(0)
    session.remove(0)
    println("移除了"+s)

  }
}

class Session{}