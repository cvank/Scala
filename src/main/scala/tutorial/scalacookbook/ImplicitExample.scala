package tutorial.scalacookbook

/**
  * Created by chandrashekar.v on 6/2/2017.
  */
class ImplicitExample(val s: String) {

  def increment = s.map(c => (c + 1).toChar)
  def backwards = s.reverse

}

object ImplicitExample {
  def main(args: Array[String]): Unit = {
    val s = "ABC"
    implicit def stringToString(s: String) = new ImplicitExample(s)

    println(s.increment)
    println(s.backwards)


  }
}
