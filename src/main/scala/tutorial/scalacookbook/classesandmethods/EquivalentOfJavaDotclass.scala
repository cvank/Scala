package tutorial.scalacookbook.classesandmethods

import java.util.{HashMap => JavaMap}
import scala.collection.immutable.{Map => ScalaImmutableMap}
import scala.collection.mutable.{Map => ScalaMutableMap}

/**
  * Created by chandrashekar.v on 6/5/2017.
  *
  * In Scala .class is not allowed, instead classOf() needs to be used.
  */
object EquivalentOfJavaDotclass {

  def main(args: Array[String]): Unit = {
    val stringClass = classOf[String]
    println(stringClass)
    println(stringClass.getDeclaredMethods)

    val javaMap1 = new JavaMap[Int, String]()
    javaMap1.put(1, "a")

    val scalaMutableMap = ScalaMutableMap(1 -> "a")

    val scalaImmutableMap = ScalaImmutableMap(1 -> "a")

    println(javaMap1.toString)
    println(scalaMutableMap.toString)
    println(scalaImmutableMap.toString)
  }

}
