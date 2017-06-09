package tutorial

import scala.text.DocGroup

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaClassTutorial {

  def main(args: Array[String]): Unit = {

    val rover = new Animal("Rover", "Woof")
    println(rover.toString)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName()} with id ${whiskers.id} says ${whiskers.sound}")

    val spike = new Dog("Spike", "woof", "Grrr")
    println(spike.toString)

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }

  class Animal(var name: String, var sound: String) {

    val id = Animal.newIdNum

    def getName(): String = name

    def getSound(): String = sound

    def setName(name: String) {
      if (!name.matches(".*\\d+.*"))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound: String) {
      this.sound = sound
    }

    def this() {
      this("No Name", "No Sound")
    }

    def this(name: String) {
      this("No Name", "No Sound")
      this.setName(name)
    }

    override def toString: String = {
      return "%s with the id %d says  %s".format(this.name, this.id, this.sound)
    }
  } // End Class Animal

  object Animal {
    private var idNumber = 0;

    private def newIdNum = {
      idNumber += 1;
      idNumber
    }
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String) {
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this(name: String) {
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this() {
      this("No Name", "No Sound", "No Growl")
    }

    override def toString: String = {
      return "%s with the id %d says  %s and growls %s".format(this.name, this.id, this.sound, this.growl)
    }
  }

  abstract class Mamal(val name: String) {
    var moveSpeed: Double

    def move: String
  }

  class Wolf(name: String) extends Mamal(name) {

    var moveSpeed: Double = 35.0

    override def move: String = "This Wolf  %s moves at speed %.2f mph".format(this.name, this.moveSpeed)
  }

} // End of ScalaClassTutorial
