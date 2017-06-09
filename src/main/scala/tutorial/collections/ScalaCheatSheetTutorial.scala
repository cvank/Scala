package tutorial.collections

/**
  * Created by chandrashekar.v on 5/30/2017.
  */
object ScalaCheatSheetTutorial {

  def main(args: Array[String]) {

    dataStructuresCheats
  }

  private def dataStructuresCheats = {
    // Creates Tuple literal (Tuple3)
    println((1, 2, 3).toString());

    // Creates Tuple literal (Tuple22)
    println((1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22).toString());

    // destructuring bind: tuple unpacking via pattern matching.
    var (x, y, z) = (1, 2, 3)

    println(x.toString) // Prints 1

    //Bad - each assigned to the entire tuple.
    var a, b, c = (1, 2, 3)
    println(a.toString) // Prints (1,2,3)

    var xx = 1 :: List(2, 3)

    println("XX" + xx)

    // Range sugar - Below all declarations are same
    1 to 5
    1 until 5
    1 to 10 by 2

    var xs = List(4, 5, 6)
    println(xs(2)) // Paren indexing.
  }
}
