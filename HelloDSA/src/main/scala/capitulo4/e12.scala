package capitulo4

object e12 {

  def makeIncrease(more: Int) = (x:Int) => x + more

  def main(args: Array[String]): Unit = {

    val inc1 = makeIncrease(1)

    println(inc1(10))
  }
}
