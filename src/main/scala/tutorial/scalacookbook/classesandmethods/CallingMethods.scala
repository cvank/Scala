package tutorial.scalacookbook.classesandmethods

import scala.collection.mutable.ListBuffer

/**
  * Created by chandrashekar.v on 6/5/2017.
  */
object CallingMethods {

  def main(args: Array[String]): Unit = {
    val pizza = new Pizza("Veg", 1)
    pizza addIngrediant "Capsicum"
    pizza.addIngrediant("Tomato")
    pizza addIngrediant ("Mushroom")
    pizza order

    val nonVegpizza = new Pizza("Non-Veg", 2)
    nonVegpizza addIngrediant "Chicken"
    nonVegpizza.addIngrediant("pepperoni")
    nonVegpizza addIngrediant ("Cheese")
    // Scala methods that take a single parameter can be invoked without dots or parentheses.
    nonVegpizza.addIngrediants("Corn","Capsicum")
    nonVegpizza.order

  }
}

class Pizza(var pizzaType: String, val no: Int) {
  var ingrediants = ListBuffer[String]()

  def addIngrediant(ing: String) = {
    ingrediants += ing
    println("Ingrediant " + ing + " added")
  }

  def addIngrediants(ing: String*) = {
    ingrediants.appendAll(ing)
    println("Ingrediant " + ing.toString() + " added")
  }

  def order = {
    println("Pizza ordered")
    println("With ingrediants :" + ingrediants.toString())
  }
}



