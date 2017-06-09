package tutorial.scalacookbook

import java.util

import scala.collection.JavaConversions.seqAsJavaList
import scala.collection.mutable.{ArrayBuffer, ListBuffer}
//import scala.collection.JavaConversions._
//import scala.collection.JavaConverters._

/**
  * Created by chandrashekar.v on 6/5/2017.
  */
object CollectionsTest {

  def main(args: Array[String]) = {

    // Mutable Arrays - Array Buffer
    val arrayBuffer = ArrayBuffer[String]()
    arrayBuffer += "Apache"
    arrayBuffer += "Spark"
    arrayBuffer += "Tutorial"

    println(arrayBuffer(0))
    println(arrayBuffer.length)

    // Immutable String array
    val fruits = Array("Apple", "Orange", "Banana")
    val vegies = new Array[String](2)
    vegies(0) = "Capsicum"
    vegies(1) = "Banana"
    println(fruits.mkString)
    println(vegies.mkString(" "))

    // Mutable String array
    val cars = ArrayBuffer("Merc", "Audi", "BMW")
    cars += "Tata"
    cars += "Maruti"
    println(cars.mkString(("\n")))
    println(cars.mkString(" . "))

    val numbers = Array(1, 2, 3, 4, 5)
    println(numbers.mkString(", "))

    // Specifying prefix , separator and Suffix
    println("mkString using prefix, suffix and separtor: " + numbers.mkString("[", ",", "]"))


    // Handling Java collections in Scala
    val javaList = new util.ArrayList[String]()
    javaList.add("Apache")
    javaList.add("Spark")

    // Importing scala.collection.JavaConversions._/Convertors._
    javaList.forEach(x => println(x))

    // 2D array
    val matrix = Array.ofDim[Int](2, 2)
    matrix(0)(0) = 0
    matrix(0)(1) = 1
    matrix(1)(0) = 2
    matrix(1)(1) = 3

    println(matrix(0)(1))
    println(matrix(1)(0))

    // Looping through Map
    val map = Map("k" -> 1, "v" -> 2)
    var sum = 0
    for ((x, y) <- map) {
      sum += y
    }
    println("Sum of values in map: " + sum)

    // foreach and case
    map foreach { case (k, v) => println("Key:" + k + " Value:" + v) }

    // foreach and tuples
    map foreach { x => println("Key:" + x._1 + " Value:" + x._2) }

    var similarItems = Map[String, Boolean]()
    map.keys.foreach(key => {
      if (key.contains("a"))
        similarItems += (key -> true)
    })
  }

  // Scala for comprehension
  val names = Vector("Bob", "Fred", "Joe", "Julia", "Kim")
  println("Using For to loop through Vector.")
  for (name <- names if (name.startsWith("J")))
    println(name)

  // Using foreach
  println("Using foreach to loop through Vector.")
  names.filter(x => x.startsWith("J")).foreach(println)


  // List operations
  val list1 = List(1, 2, 3)
  val list2 = List(4, 5, 6)

  // Merge two Lists using :::
  val mergedList = list1 ::: list2
  println("Printing Merged list :::")
  mergedList.foreach(println)

  // Merge two Lists using ++
  val mergedList2 = list1 ++ list2
  println("Printing Merged list ++")
  mergedList2.foreach(println)

  // Merge two Lists using List.concat
  val mergedList3 = List.concat(list1, list2)
  println("Printing Merged list ..List.concat")
  mergedList3.foreach(println)

  val mergedList4 = list1 :: list2
  println("Printing Merged list ::")
  mergedList4.foreach(println)

  // Creating List in scala

  //LISP style
  val lispList = 1 :: 2 :: 3 :: Nil
  println("Printing list created using Lisp style: " + lispList.mkString(", "))

  // Java Style
  val listJavaStyle = List(1, 2, 3)

  // Using range - Begings at 0 and ends at 9
  val listUsingRange = List.range(0, 10)

  //Using fill method
  val listUsingFill = List.fill(3)(this)
  println("Printing list created using fill method:")
  for (elem <- listUsingFill) {
    println(elem)
  }

  // Using tabulate method
  // The tabulate method creates a new List whose elements are created according to the function you supply.
  val listUsingTabulate = List.tabulate(5)(n => n * n)
  println("Printing list created using tabulate method: ")
  for (elem <- listUsingTabulate) {
    println(elem)
  }

  // Scala List examples
  //Mixing types in list
  val numbers = List[Number](1, 2.0, 33d, 0x1)

  // List using range and step argument
  val listRangeWithStep2 = List.range(0, 10, 2)
  println("listRangeWithStep2: " + listRangeWithStep2.mkString(", "))

  // Prepend an element to a list
  val list = List(2, 3, 4, 5, 6)
  val updatedList = 1 :: list
  println("Printing list after prepending 1 - " + updatedList.mkString(" "))

  // Merge lists

  val a = List("a", "b", "c")
  val b = List("a", "b", "c")
  val c = a ::: b

  // This merge Operation has O(n) speed where n is the number of elements in the first list.
  println("Printing the merged list: " + c.mkString(" "))

  // Filtering Scala Lists
  val x = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val evenNumbersList = x.takeWhile(ele => ele % 2 == 0)
  println("Printing even numbers filtered using take while method: " + evenNumbersList.mkString(" "))

  // List Map function
  val y = x.map(_ * 2)
  println("Printing the list after performing Map operation: " + y.mkString(" "))

  val listOfNames = List("Fred", "Joe", "Bob")
  println("Printing names after converting to uppercase:")
  listOfNames.map(_.toUpperCase).foreach(println)

  // Sorting Scala Lists
  val randomNumbers = List(10, 2, 1, 4, 8, 9)
  val sortedList = randomNumbers.sortWith(_ < _)
  println("Sorted List " + sortedList.mkString(" "))

  // Other scala List operations
  // foldLeft
  // reduceLeft
  // flatten - Takes list of lists and generates a single list
  // tail - returns every elements of the list except the first one.
  // init - returns all elements of the list except the last one
  // head - first element of the list
  // last - last element of the list
  //Folding lists: /: and :\

  // Map examples

  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)

  map.foreach(x => println(x._1 + "-->" + x._2))
  map.foreach { case (k, v) => println(k + "-->" + v)
  }
}
