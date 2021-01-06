package capitulo3

import java.io.File

object e07 {

  var filesHere = new File("src/main/scala/capitulo3").listFiles()

  def fileLines(file: File) =
    scala.io.Source.fromFile(file).getLines().toList

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length

  def main(args: Array[String]): Unit = {

    val collection = scalaFiles

    for(file <- collection)
      println(file)

    val collection2 = forLineLengths

    for(length <- collection2)
      println(length)
  }
}
