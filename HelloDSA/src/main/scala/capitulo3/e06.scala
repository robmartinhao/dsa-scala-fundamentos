package capitulo3

import java.io.File

object e06 {

  var filesHere = new File("src/main/scala/capitulo3").listFiles()

  def fileLines(file: File) =
    scala.io.Source.fromFile(file).getLines().toList

  def grep (pattern: String) =
    for (
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)

  def main(args: Array[String]): Unit = {
//    //Não é comum em Scala...
//    for (i <- 0 to filesHere.length -1)
//      println(filesHere(i))

    grep(".*gcd.*")
  }
}
