package tutorial.collections

/**
  * Created by chandrashekar.v on 5/30/2017.
  */
object ScalaPatternMatchingTutorial {

  def main(args: Array[String]): Unit = {

    // Bad .. “v42” is interpreted as a name matching any Int value, and “42” is printed.
    val v42 = 42
    Some(3) match {
      case Some(v42) =>
        println("42")
      case _ => println("Not 42")
    }

    // Good
    val v43 = 43
    Some(3) match {
      case Some(`v43`) => println("43")
      case _ => println("Not 43")
    }

    /**
      * UppercaseVal is treated as an existing val, rather than a new pattern variable,
      * because it starts with an uppercase letter.
      * Thus, the value contained within UppercaseVal is checked against 3, and “Not 42” is printed.
      */
    val UppercaseVal = 42
    Some(3) match {
      case Some(UppercaseVal) => println("42")
      case _ => println("Not 42")
    }
  }
}
