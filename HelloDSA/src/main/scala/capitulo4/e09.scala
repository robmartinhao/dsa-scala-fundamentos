package capitulo4

import scala.io.Source

object LongLines2 {

  def processFile(filename: String, width: Int) = {

    def processLine(filename: String, width: Int, line: String) = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }
}

object e09 {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines2.processFile(arg, width)
  }
}
