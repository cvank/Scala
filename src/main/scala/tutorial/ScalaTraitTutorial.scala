package tutorial

/**
  * Created by chandrashekar.v on 5/24/2017.
  */
object ScalaTraitTutorial {

  def main(args: Array[String]): Unit = {
    val superman = new SuperHero("Superman")
    println(superman.fly)
    println(superman.hitBullet)
    println(superman.ricochet(2500))
  }

  trait Flyable {
    def fly: String
  }

  trait BulletProof {
    def hitBullet: String

    def ricochet(startSpeed: Double): String = {
      "The bullet ricochets at a speed of %.1f ft/sex".format(startSpeed * .75)
    }

  }

  class SuperHero(val name: String) extends Flyable with BulletProof {
    override def fly: String = "%s flys through air".format(this.name)

    override def hitBullet: String = "The bullet bounces off of %s ".format(this.name)
  }

}
