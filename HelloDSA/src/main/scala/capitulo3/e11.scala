package capitulo3

object e11 {

  def main(args: Array[String]): Unit = {

    //    val a = 1;
    //    {
    //      val a = 2;
    //      {
    //        println(a)
    //      }
    //    }

    printMultiTable()
  }

  def printMultiTable() = {
    var i = 1;
    // Somenete i em escopo aqui

    while (i <= 10) {
      var j = 1;
      // Ambos i e j em escopo aqui

      while (j <= 10) {
        val prod = (i * j).toString
        // i, j e prod em escopo aqui

        var k = prod.length
        // i, j, prod e k em escopo aqui

        while (k < 4) {
          print(" ")
          k += 1
        }
        // i e j ainda em escopo; prod e k fora de escopo
        print(prod)
        j += 1
      }
      println()
      i += 1
    }
    // i ainda em escopo; j, prod e k fora de escopo
  }
}
