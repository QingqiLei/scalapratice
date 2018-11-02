package scala.variable

object ScalaWorldCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hello java hello python", "hello C", "nihao JavaScript")


    val words = lines.flatMap(_.split(" "))
    println(lines.map(_.split(" ")).flatten)
    println(words)

    val tuples: List[(String, Int)] = words.map((_, 1))

    println(tuples)

    val grouped: Map[String, List[(String, Int)]] = tuples.groupBy(_._1)
    println(grouped)

    val sumed: Map[String, Int] = grouped.mapValues(_.size)
    println(sumed)

    val sorted: List[(String, Int)] = sumed.toList.sortBy(_._2)
    println(sorted)

    println(sorted.reverse)

  }

}
