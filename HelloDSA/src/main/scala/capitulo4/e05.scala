package capitulo4

object e05 {

  class Rational(n: Int, d: Int) {

    require(d != 0)
    val numer = n
    val denom = d

    def this(n: Int) = this(n, 1)

    override def toString = numer + "/" + denom

    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def * (that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)
  }

  def main(args: Array[String]): Unit = {
    var x = new Rational(1, 2)
    var y = new Rational(2, 3)
    println(x + y)
    //ou
    println(x.+(y))

    println(x * y)
    //ou
    println(x.*(y))

    println(x + y * y)
    println((x + y) * y)
    println(x.+(y).*(y))

  }
}
