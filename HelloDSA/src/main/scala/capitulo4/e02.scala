package capitulo4


class Rational(n: Int, d: Int) {

  require(d != 0)
  val number: Int = n
  val denom: Int = d
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
    if(this.lessThan(that)) that else this
}

object e02 {

  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1,2)
    val twoThirds = new Rational(2,3)

    println("oneHalf [" + oneHalf + "]")
    println("twoThirds [" + twoThirds + "]")

    println("oneHalf.lessThan(twoThirds) [" + oneHalf.lessThan(twoThirds) + "]")
    println("oneHalf.max(twoThirds) [" + oneHalf.max(twoThirds) + "]")
  }
}
