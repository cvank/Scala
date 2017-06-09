package tutorial

import scala.math._

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaHigherOrderFunctionsTutorial {

  def main(args: Array[String]): Unit = {

    val log10Func = log10 _
    println(log10Func(1000))

    List(1000.0, 10000.0).map(log10Func).foreach(println)

    List(1, 2, 3, 4, 5).map(x => x * 50).foreach(println)

    List(1, 2, 3, 4, 5).map(x => x * 50).filter(x => x % 2 == 0).foreach(println)


    def times3(num: Int) = num * 3

    def times4(num: Int) = num * 4

    def mult(func: (Int) => Double, num: Int) = {
      func(num)
    }

    printf("4*100 is %.1f\n", mult(times4, 100))

    val divisorVal = 10;
    val divisor10 = (num: Double) => num / divisorVal;

    printf("100/10 is %.1f\n", divisor10(100))
  }
}
