package tutorial.scalacookbook.recursion

import scala.annotation.tailrec

/**
  * Created by chandrashekar.v on 5/31/2017.
  */
object RecursiveSum {

  def main(args: Array[String]): Unit = {
    val list = List(1, 100)

    println(sum(list))
    println(tailRecursiveSumSolution(List(1, 100), 0))

    println(sumAccumulator(List(1, 100, 2)))
    println(sumWithReduce(List(1, 100, 2)))
  }

  private def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: t => x + sum(t)
  }

  private def tailRecursiveSumSolution(list: List[Int], sum: Int): Int = list match {
    case Nil => sum
    case x :: tail => tailRecursiveSumSolution(tail, sum + x)
  }

  private def sumAccumulator(list: List[Int]): Int = {

    @tailrec
    def tailRecursiveSumSolution1(list: List[Int], sum: Int): Int = list match {
      case Nil => sum
      case x :: tail => tailRecursiveSumSolution1(tail, sum + x)
    }

    tailRecursiveSumSolution1(list, 0)
  }

  def sumWithReduce(list: List[Int]): Int = {
    list.reduceLeft(_ + _)
  }
}
