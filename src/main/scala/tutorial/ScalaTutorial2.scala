package tutorial

import scala.util.control.Breaks._

/**
  * Created by chandrashekar.v on 5/25/2017.
  */
object ScalaTutorial2 {

  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- List(1, 2, 3, 4, 5))
        if (i == 2)
          break;
        else
          println(i)
    }
  }

}
