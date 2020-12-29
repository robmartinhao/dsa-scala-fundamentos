package capitulo2

import scala.io.Source

object e09 {

  def main(args: Array[String]): Unit = {

    def countChars3(args: Array[String]): Unit = {

      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {
        val lines = Source.fromFile(args(0)).getLines().toList
        val longestLine = lines.reduceLeft(
          (a, b) => if (a.length > b.length) a else b
        )
        val maxWidth = widthOfLength(longestLine)
        for (line <- lines) {
          val numSpaces = maxWidth - widthOfLength(line)
          val padding = " " * numSpaces
          println(padding + line.length + " | " + line)
        }
      }
    }
    countChars3(Array("src/main/scala/capitulo2/e09.scala"))
  }
}
