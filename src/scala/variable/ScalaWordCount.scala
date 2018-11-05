package scala.variable

object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello python", "hello C", "nihao JavaScript")


    val words = lines.flatMap(_.split(" "))
    println("1 lines: "+lines.map(_.split(" ")).flatten)
    println("2 words: "+words) // same

    val tuples: List[(String, Int)] = words.map((_, 1)) // the _ represents each word, we create tuples

    println("3 tuples: "+tuples)

    val grouped: Map[String, List[(String, Int)]] = tuples.groupBy(_._1) //group by the word
    println("4 grouped: "+grouped)

    val sumed: Map[String, Int] = grouped.mapValues(_.size)
    println("5 sumed: "+sumed)

    val sorted: List[(String, Int)] = sumed.toList.sortBy(_._2)
    println("6 sorted: "+sorted)

    println(sorted.reverse)



  }

}
