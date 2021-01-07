package capitulo4

object e01 {

  class Rational(n: Int, d: Int) {

    require(d!= 0)

    val number: Int = n
    val denom: Int = d

    println("created " + n + "/" + d)

    def add(that: Rational) : Rational =
      new Rational(number * that.denom + that.number * denom, denom * that.denom)

    override def toString = n + "/" + d
  }

  def main(args: Array[String]): Unit = {
    //new Rational(3,2)

    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    val test = oneHalf add twoThirds

    println(oneHalf.toString)
    println(test.toString)
    println(test.number + "/" + test.denom)
  }
}
