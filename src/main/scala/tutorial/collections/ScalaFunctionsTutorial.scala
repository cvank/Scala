package tutorial.collections

/**
  * Created by chandrashekar.v on 5/30/2017.
  */
object ScalaFunctionsTutorial {

  def main(args: Array[String]): Unit = {
    // Variable Declarations in Scala
    val x = 5; // Constant
    // BAD: x = 7
    var x1: Double = 5 // Explicit Type.

    // Function examples.
    // Good
    def f(x: Int) = {
      x * x
    }

    // Bad
    def f1(x: Int) {
      x * x
    }

    def f2(x: Any) = println(x)

    // Bad
    //def f3(x) = println(x) - Need types for every arg.

    // Type alias
    type R = Double

    // Call by Value
    def f4(x: R) = (x * x)

    def f5(x: => R) = (x * x) // Call by name.Lazy Parameters.

    // anonymous function: underscore is positionally matched arg.
    println("Printing map")
    (1 to 5).map(_ * 2).foreach(println)

    (1 to 5).map(2 *).foreach(println)
    // BAD :
    // (1 to 5).map(* 2).foreach(println)


    // Currying, Obvious syntax
    val zScore = (mean: R, sd: R) => (x: R) => (x - mean) / sd

    def zScoreFun(mean: R, sd: R) = (x: R) => (x - mean) / sd

    def zScoreFun1(mean: R, sd: R)(x: R) = (x - mean) / sd

    // need trailing underscore to get the partial, only for the sugar version.
    val normer = zScoreFun1(7, 0.4) _

    // generic type
    def mapMake[T](g: T => T)(seq: List[T]) = seq.map(g)

    // Infix sugar
    println("Infix Sugar:" + 5.+(3))

    // Varargs
    def sum(args: Int*) = args.reduceLeft(_ + _)

    println("Sum" + sum(1, 2, 4, 5, 6))
    // Annonymous function - Pipeline style
    (1 to 5) filter (_ % 2 == 0) map (_ * 2)


    (x: R) => (x * x) // Anonymous function.

  }
}
