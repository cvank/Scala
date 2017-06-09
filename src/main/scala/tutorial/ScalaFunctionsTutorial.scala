package tutorial

import scala.collection.mutable.ArrayBuffer

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaFunctionsTutorial {

  def main(args: Array[String]): Unit = {

    def getSum(num: Int, num2: Int): Int = {
      return num + num2
    }

    println(getSum(5, 4))
    println(getSum(num2 = 5, num = 4))

    def sayHi(): Unit = {
      println("Basic Function saying Hi")
    }

    sayHi

    def getSumVarArgs(args: Int*): Int = {
      var sum: Int = 0

      for (num <- args) {
        sum += num;
      }
      return sum
    }

    println("Sum variable number of args:" + getSumVarArgs(1, 2, 3, 4, 5))
  }

  val favNumbers = new Array[Int](20)
  val friends = Array("Scala", "Java")
  friends(0) = "Spark"
  println("Friends at index 0:" + friends(0))
  println("Friends array Size:" + friends.size)

  // Variable Size array
  val friends2 = ArrayBuffer[String]()
  friends2.insert(0, "Friends2_0")
  friends2 += "Friends2_1";
  println("Freinds2 Array")
  printArray
  // concat arrays
  friends2 ++= friends;
  println("after adding friends array")
  printArray
  friends2 ++= Array("Friends2_2", "Friends2_3");
  println("after adding one more array")
  printArray
  friends2.insert(1, "F1", "F2", "F3", "F4")
  println("after inserting elements at index 1")
  printArray
  friends2.remove(0)
  println("after removing element at index 0")
  printArray
  friends2.remove(1, 2) // Remove two elements at idnex 1
  println("after removing two elements at index 1")
  printArray

  for (j <- 0 to favNumbers.length - 1) {
    favNumbers(j) = j
    println(favNumbers(j))
  }

  val favNumversTimesTwo = for (num <- favNumbers) yield 2 * num

  favNumversTimesTwo.foreach(println)

  val favNumversDivBy4 = for (num <- favNumbers if num % 4 == 0) yield num
  favNumversDivBy4.foreach(println)

  // Two Dimensional Array
  var mulTable = Array.ofDim[Int](10, 10)
  for (i <- 0 to 9; j <- 0 to 9) {
    mulTable(i)(j) = i * j;
    printf("%d x %d = %d \n", i, j, mulTable(i)(j))
  }

  // Agg Operations on array
  println("Sum of array:" + favNumbers.sum)
  println("Min of array:" + favNumbers.min)
  println("Max of array:" + favNumbers.max)

  val sortedFavNumbers = favNumbers.sortWith(_ > _)

  println("Sorted Array" + sortedFavNumbers.deep.mkString(","))

  private def printArray = {
    friends2.foreach(i => printf("%3s", i))

  }
}
