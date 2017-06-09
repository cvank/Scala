package tutorial

import scala.io.StdIn
import scala.math._

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaTutorial {

  def main(args: Array[String]) {
    // Print sequence of numbers using local method.
    def printSequenceofNumbers = {
      for (i <- 1 to 10) {
        println(i)
      }
    }

    printSequenceofNumbers
    printLetters
    printList
    printEvenNumbers
    TwoLoops
    secretNumber
    printWithFormat
    stringOperations
  }

  private def stringOperations = {
    var sString = "Scala is a beautiful programming lanugage."
    println("Character at Index 4: " + sString(4));
    println("Index of Scala: " + sString.indexOf("Scala"));
    val charArry = sString.toArray;
    for (i <- charArry) {
      println("Char in sString:" + i)
    }
  }

  private def printWithFormat = {
    val name = "Scala"
    val version = 2.2

    println(s"Hello $name")
    println(f"Using Version $version")
  }

  private def secretNumber = {
    var numberGuess = 0;
    do {
      print("Guess the secret number")
      try {
        numberGuess = StdIn.readLine().toInt
      } catch {
        case bigNumber: NumberFormatException => println("Not a valid number")
        case _: Throwable => println("To Huge.. try smaller number")
      } finally {
        // finally block after catch
      }
    } while (numberGuess != 10)

    print("You guessed secret number !!!")
  }

  private def TwoLoops = {
    for (i <- 1 to 5; j <- 6 to 10) {
      println("i" + i)
      println("j" + j)
    }
  }

  private def printEvenNumbers = {
    // Print Even numbers
    val evenList = for {i <- 1 to 20
                        if (i % 2 == 0)
    } yield i
    for (i <- evenList)
      println("EVEN:" + i)
  }

  private def printList = {
    // Print List of Numbers
    val aList = List(1, 2, 3, 4)
    for (i <- aList)
      println("List Items" + i)
  }

  private def printLetters = {
    // Print letters
    val ranLetters = "AASASWDSCKJSJHKJSCKJCNK"
    for (i <- 0 until (ranLetters.length))
      println(ranLetters(i))
  }
}