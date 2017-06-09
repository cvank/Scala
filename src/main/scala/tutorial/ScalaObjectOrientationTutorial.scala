package tutorial

/**
  * Created by chandrashekar.v on 5/30/2017.
  */
object ScalaObjectOrientationTutorial {

  def main(args: Array[String]): Unit = {

    var c = new C(4)
    //c.x // not possible as 'x' is private
    var c1 = new C1(4)

    var c2 = new C2(4)
    println(c2.x) // possible as x here is public.

    //var c3 = new C3(-5) // Assetion fails
    var c3 = new C3(5)
    println(c3.x)

    val x = "abc"
    if(x.isInstanceOf[String])
      println("x is String")

    val d = 0.4
    val xAsString = d.toString.asInstanceOf[String]
    println(xAsString)

  }


}

// The below two class declarations are the same. - COnstructor Params private
class C(x: Double)

class C1(private val x: Double)

// Constructor params Public
class C2(val x: Double)

class C3(var x: Double) { // declare a public member  & Constructor is a class body
  assert(
    x > 0, "Please provide positive value"
  )

  // declare a gettable but not settable member

  var y = x
  val readonly = 5

  // declare a private member
  private var secret = 1

  //alternative constructor
  def this() {
    this(42)
  }


}