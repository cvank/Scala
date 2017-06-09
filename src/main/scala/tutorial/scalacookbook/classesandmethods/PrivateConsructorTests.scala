package tutorial.scalacookbook.classesandmethods

/**
  * Created by chandrashekar.v on 6/5/2017.
  */
object PrivateConsructorTests {

  def main(args: Array[String]): Unit = {

   // var o = new Order // Throws Exceptions here
  }
}

// Private keyword shown below makes the primary constructor "private"
class Order private(val orderId: Long) {

}
