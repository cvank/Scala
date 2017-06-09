package tutorial

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaMapTutorial {

  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Bob Smith"
      , "Secretary" -> "Sue Brown")

    if (employees.contains("Manager"))
      printf("Manager: %s\n", employees("Manager"))


    val customers = collection.mutable.Map(100 -> "Paul", 101 -> "Smith")
    printf("Customer 1: %s\n", customers(100))

    customers(100) = "Changed paul"

    for ((k, v) <- customers) {
      printf("%d : %s\n", k, customers(k))
    }
  }

}
