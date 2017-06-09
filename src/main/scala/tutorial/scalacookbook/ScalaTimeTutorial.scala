package tutorial.scalacookbook

import java.text.SimpleDateFormat
import java.util.Calendar

/**
  * Created by chandrashekar.v on 6/2/2017.
  */
object ScalaTimeTutorial {

  def main(args: Array[String]): Unit = {
    val now = Calendar.getInstance()
    val currentMin = now.get(Calendar.MINUTE)
    println(currentMin)
    println(now.get(Calendar.HOUR_OF_DAY))

    val currentTIme = now.getTime
    println("Current Time: " + currentTIme)
    val hourFormat = new SimpleDateFormat("hh")
    val ampmFormat = new SimpleDateFormat("a")
    val minFormat = new SimpleDateFormat("mm")
    println("Current Min: " + minFormat.format(currentTIme))
    println("Current Hour: " + hourFormat.format(currentTIme))
    println("Am/PM: " + ampmFormat.format(currentTIme))

    def currMinDivbyFive: Boolean = {
      val now = Calendar.getInstance().getTime()
      val minFormat = new SimpleDateFormat("mm")
      val minAsString = minFormat.format(now)
      try {
        val cMin = Integer.parseInt(minAsString)
        cMin % 5 == 0
      } catch {
        case _ => false
      }
    }

    println(currMinDivbyFive)

  }
}
