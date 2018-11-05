package actor.ImplicitConvertion

import scala.io.Source

class RichFile(val file:String) {
  def read():String={
    Source.fromFile(file).mkString
  }
}

object RichFile{
  def main(args: Array[String]): Unit = {
    // 显示实现了read方法
    val file = "/usr/local/text"
//    val content: String = new RichFile(file).read()
//    println(content)
    // 隐式转换
    import actor.ImplicitConvertion.MyPredef.fileToRichFile
    val contennt = file.read()
    println(contennt)

  }
}
