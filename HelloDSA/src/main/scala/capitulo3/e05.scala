package capitulo3

import java.io.File
import scala.io.StdIn.readLine

object e05 {

  def main(args: Array[String]): Unit = {
//    var line = ""
//    var x = 1
//    do {
//      line = readLine()
//      println("Read: " + line)
//      x = x + 1
//    } while (line != "")
//    println("Fim")

//    var line = ""
//    while ((line = readLine()) != "") {
//      //Isso n]ao funciona
//      println("Read: " + line)
//    }

//    for (i <- 1 to 4)
//      println("Iterion " + i)
//    println("")
//
//    for (i <- 1 until 4)
//      println("Iterion " + i)
//    println("")

//    val filesHere = new File("./").listFiles()
//    for(file <- filesHere)
//      println(file)

//    val filesHere = new File("src/main/scala/capitulo3").listFiles
//    for(file <- filesHere) {
//      if (file.getName.endsWith(".scala"))
//        println(file)
//    }

//    val filesHere = new File("src/main/scala/capitulo3").listFiles
//    for(file <- filesHere if (file.getName.endsWith(".scala"))) {
//      println(file)
//    }

    val filesHere = new File("src/main/scala/capitulo3").listFiles
    for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    )
    println(file)
  }
}
