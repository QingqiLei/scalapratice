

import scala.util.Random

object CaseClass {
  def main(args: Array[String]): Unit = {
    val arr =Array(CheckTimeOutTask, SubmiTask("100","task"),HeartBeat(3000))
    arr(Random.nextInt(arr.length)) match{

      case CheckTimeOutTask =>println("CheckTimeOutTask")
      case SubmiTask(port,task) =>println("SubmiTask")
      case HeartBeat(time) =>println("HeartBeat")
      case _ => println("not find") // any

    }
  }
}

case class HeartBeat(time:Long)
case class SubmiTask(id:String , taskName:String)
case object CheckTimeOutTask
