package capitulo4

object e07 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g

    def this(n: Int) = this(n, 1)

    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def +(i: Int): Rational =
      new Rational(numer + i * denom, denom)

    def -(that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )

    def -(i: Int): Rational =
      new Rational(numer - i * denom, denom)

    def *(that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)

    def *(i: Int): Rational =
      new Rational(numer * i, denom)

    def /(that: Rational): Rational =
      new Rational(numer * that.denom, denom * that.numer)

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    override def toString = numer + "/" + denom

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {

    implicit def intToRational(x: Int) = new Rational(x)

    val x = new Rational(2, 3)
    println(x.*(2))
    println(2.*(x))
    println(2 * x)
  }
}
