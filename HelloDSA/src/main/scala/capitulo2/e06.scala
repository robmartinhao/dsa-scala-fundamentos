package capitulo2

object e06 {

  // Estilo Funcional

  def main(args: Array[String]): Unit = {

    def printArgs(args: Array[String]): Unit = {
      var i = 0
      while (i < args.length) {
        println(args(i))
        i += 1
      }
    }

    printArgs(Array("zero", "um", "dois"))

    println(" ")

    {
      def printArgs(args: Array[String]): Unit = {
        for (arg <- args)
          println(arg)
      }

      printArgs(Array("três", "quatro", "cinco"))
    }

    println(" ")

    {
      def printArgs(args: Array[String]): Unit = {
        args.foreach(println)
      }

      printArgs(Array("seis", "sete", "oito"))
    }

    println(" ")

    def formatArgs(args: Array[String]) = args.mkString("\n")
    val args = Array("nove", "dez")

    println(formatArgs(args))

    println(" ")

    val res = formatArgs(Array("zero", "um", "dois"))
    assert(res == "zero\num\ndois")
    println("Feito!")
  }
}
