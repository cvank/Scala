package tutorial.scalacookbook

/**
  * Created by chandrashekar.v on 5/31/2017.
  *
  * A mathematical method that can be used to solve the roots of equations.
  */
object NewtonsMethod {

  def main(args: Array[String]): Unit = {

    val fx = (x: Double) => 3 * x + math.sin(x) - math.pow(math.E, x)
    val fxPrime = (x: Double) => 3 + math.cos(x) - math.pow(math.E, x)

    val initialGuesses = 0.0
    val tolerance = 0.00005

    println(newtonsMethod(fx, fxPrime, initialGuesses, tolerance))

  }

  def newtonsMethod(fx: Double => Double, fxPrime: Double => Double,
                    x: Double, tolerance: Double): Double = {

    var x1 = x
    var xNext = newtonsMethodHelper(fx, fxPrime, x1)
    while (math.abs(xNext - x1) > tolerance) {
      x1 = xNext
      xNext = newtonsMethodHelper(fx, fxPrime, x1)
    }
    xNext
  }

  private def newtonsMethodHelper(fx: Double => Double, fxPrime: Double => Double, x1: Double): Double = {
    x1 - fx(x1) / fxPrime(x1)
  }
}
