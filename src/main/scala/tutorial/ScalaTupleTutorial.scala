package tutorial

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaTupleTutorial {


  def main(args: Array[String]): Unit = {
    var tupleMarge = (103, "MargeSimpson", 10.25)

    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
    tupleMarge.productIterator.foreach(i => println(i))

    println(tupleMarge.toString())
  }
}
