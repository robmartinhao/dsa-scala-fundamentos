package capitulo4

object e04 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    println(g)

    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n, 1)

    override def toString = numer + "/" + denom

    private def gcd(a: Int, b: Int): Int =
      if(b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    var number = new Rational(66,42)
    println(number)
  }
}
