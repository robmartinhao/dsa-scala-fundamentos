package capitulo3

object e08 {
  var colors = List("Red", "Blue", "Black", "Gray", "White", "Yellow")

  def searchFrom(i: Int): Int = {
    if (i >= colors.length) -1
    else if (!colors(i).startsWith("B")) searchFrom(i + 1)
    else if (colors(i).endsWith("ck")) i
    else searchFrom(i + 1)
  }

  def main(args: Array[String]): Unit = {

    var i = -1
    var foundIt = false

//    while (i < colors.length && !foundIt) {
//      i = i + 1
//      if(colors(i).startsWith("B")) {
//        if(colors(i).endsWith("ck"))
//          foundIt = true
//      }
//    }
//
//    if (foundIt)
//      println(colors(i))
//    else
//      println("Not Found")

//    println("Index: " + searchFrom(0))

    import scala.util.control.Breaks._

    breakable {
      i = -1
      while (i < colors.length) {
        i += 1
        if (colors(i).startsWith("B") && colors(i).endsWith("ck")) {
          break;
        }
      }
    }
    if (i > 0)
      println(colors(i))
    else
      println("Not Found")

  }

}
