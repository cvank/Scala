package tutorial.scalacookbook.classesandmethods

/**
  * Created by chandrashekar.v on 6/5/2017.
  */
object NamedAndDefaultArguments {

  def main(args: Array[String]): Unit = {

    // Named parameter
    printName(firstName = "Apache", lastName = "Saprk")

    printName("Apache", "Saprk")

    // Print with defaults
    printNameWithDefaults()
    printNameWithDefaults("Apache")
    printNameWithDefaults("Apache", 1)

  }

  def printName(firstName: String, lastName: String): Unit = {
    println("Firstname:" + firstName + " Last Name: " + lastName)
  }

  // With default arguments
  def printNameWithDefaults(firstName: String = "Unknown", age: Int = 0): Unit = {
    println("Firstname:" + firstName + " Age: " + age)
  }
}
