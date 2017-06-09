package tutorial.scalacookbook

/**
  * Created by chandrashekar.v on 6/7/2017.
  */
object TupleExamples {

  def main(args: Array[String]): Unit = {

    def getUserInfo = ("A", 42, 2000)

    val (name, age, weight) = getUserInfo
    println(name + " , " + age + " ," + weight)

    val (justName, _, _) = getUserInfo
    println("JustName:" + justName)

    val tuple = ("A1", 43, 201.0)

    for (elem <- tuple.productIterator) {
      println(elem)
    }

    //Creating tuple with ->

    val tuple2 = 1 -> 2
    tuple2.productIterator.foreach(println)


    // Access tuple in annonymous function
    val x = Map(1 -> "foo", 2 -> "bar")
    val y = x map { case (k, v) => s"$k is $v" }

    y.foreach {
      case (k) => println(k)
    }

  }

}
