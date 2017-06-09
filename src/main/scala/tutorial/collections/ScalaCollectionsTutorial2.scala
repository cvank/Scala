package tutorial.collections

//Renaming Import
import scala.collection.immutable.{Vector => Vec28}

// Importing multiple Classes
import scala.collection.immutable.List

//Wildcard import

//Import all except EX: Import all from java.util except Date
//import java.util.{Date => _, _}


/**
  * Created by chandrashekar.v on 5/30/2017.
  */
object ScalaCollectionsTutorial2 {

  def main(args: Array[String]) {
    // Using custom import name vec28 for Vector
    val vec = Vec28[String]("a", "b", "c");
    println("Vector Size:" + vec.size)


    val xs = List(1, 2, 3, 4)
    val ys = List(1, 2, 3, 4)

    /*for (x <- xs; y <- ys)
      yield x * y*/

    def fun = (list1: List[Int], list2: List[Int]) => list1.flatMap(x => list2.map(y => x * y)).foreach(println)

    // Calling function
    println("Printing")
    fun(xs, ys);

    // Iterate omitting the upper bound using 'until'
    /*for (i <- 1 until 5)
      println(i)*/

    // Desugar above statement
    (1 until 5).foreach(i => println(i))

    // for comprehension: filter/map
    /*for (x <- xs if x % 2 == 0)
      yield x * 10;*/

    // Desugar above one
    xs.withFilter(x => x % 2 == 0).map(x => x * 10);

    // Zip with index
    val xsZipWithIndex = xs.zipWithIndex
    xsZipWithIndex.foreach(println)

    // for comprehension: destructuring bind
    /*for ((x, y) <- xs zip ys)
      yield x * y*/

    // Desugar abvoe statment
    val xsZipYs = (xs zip ys).map { case (x, y) => x * y }
    xsZipYs.foreach(println)

    // Zip with index
    xsZipYs.zipWithIndex


  }

}
