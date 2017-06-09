package tutorial.scalacookbook

import scala.annotation.switch

/**
  * Created by chandrashekar.v on 6/2/2017.
  */
object UsingMatch {

  def main(args: Array[String]) = {

    
    // @ Switch annotation provides a warning at compile time if the switch can’t be compiled to a tableswitch or lookupswitch.
    val month = (x: Int) => (x: @switch) match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Invalid Month"
    }

    println(month(2))

    println(getClassAsString(12.0f))
    println(getClassAsString(List(1, 2, 3)))
    println(getClassAsString(Array(1, 2, 3)))
  }

  def getClassAsString(x: Any): String = x match {

    case s: String => "String"
    case i: Int => "Int"
    case d: Double => "Double"
    case f: Float => "Float"
    case l: List[_] => "List"

    case default => {
      def handleUnknown(x: Any) = {
        println(x)
      }

      handleUnknown(default)
      return "unknown"
    }


    //case _ => "Unknown"
  }
}
