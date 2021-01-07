package capitulo4

object e03 {

  class Rational(n: Int, d: Int) {

    require(d != 0)
    val number: Int = n
    val denom: Int = d

    def this(n: Int) = this(n, 1)

    println("created " + n + "/" + d)

    override def toString = n + "/" + d

    def add(that: Rational): Rational =
      new Rational(
        number * that.denom + that.number * denom,
        denom * that.denom
      )

    def lessThan(that: Rational) =
      this.number * that.denom < that.number * this.denom

    def max(that: Rational) =
      if (this.lessThan(that)) that else this
  }

  def main(args: Array[String]): Unit = {
    val y = new Rational(1)
    println(y)
  }
}
