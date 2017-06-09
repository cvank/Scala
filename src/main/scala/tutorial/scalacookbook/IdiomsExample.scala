package tutorial.scalacookbook

import scala.None

/**
  * Created by chandrashekar.v on 6/7/2017.
  */
object IdiomsExample {

  def main(args: Array[String]): Unit = {

    callToIntMethod("1")
    callToIntMethod("abc")

    def callToIntMethod(x: String) = toInt(x) match {
      case Some(i) => println(i)
      case None => println("Didn't work")
    }
  }


  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s))
    } catch {
      case i: Exception => None
    }
  }

  def toIntAny(s: Any): Option[Int] = {
    try {
      Some(Integer.parseInt(s.toString))
    } catch {
      case i: Exception => None
    }
  }

  val bag = List(1, 2, "foo", "bar", 3, 4)
  val sumVal = bag.flatMap(toIntAny).sum
  println("Sum: " + sumVal)
}
