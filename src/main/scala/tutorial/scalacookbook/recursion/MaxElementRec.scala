package tutorial.scalacookbook.recursion

import scala.annotation.tailrec

/**
  * Created by chandrashekar.v on 5/31/2017.
  */
object MaxElementRec {

  def main(args: Array[String]): Unit = {

    println(max(List(1, 100, 3, 1000)))

    println(maxUsingIfElse(List(1, 100, 3, 1000)))

  }

  def max(list: List[Int]): Int = {
    @tailrec
    def maxElement(list: List[Int], max: Int): Int = list match {
      case Nil => max
      case x :: tail =>
        val newMax = if (x > max) x else max
        maxElement(tail, x)
    }

    maxElement(list, 0)
  }

  def maxUsingIfElse(ints: List[Int]): Int = {

    @tailrec
    def usingIfElse(list: List[Int], max: Int): Int = {
      if (list.isEmpty) {
        max
      } else {
        val x = list.head
        val newMax = if (x > max) x else max
        usingIfElse(list.tail, newMax)
      }
    }

    usingIfElse(ints, 0)
  }
}
