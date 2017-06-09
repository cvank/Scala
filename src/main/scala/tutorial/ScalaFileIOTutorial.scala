package tutorial

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaFileIOTutorial {

  def main(args: Array[String]): Unit = {
    val write = new PrintWriter("test.txt")
    write.write("Writing some text to test")
    write.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    val lineIter = textFromFile.getLines()
    lineIter.foreach(println)
    textFromFile.close()

  }
}
