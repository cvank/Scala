package tutorial.scalacookbook.classesandmethods

import scala.beans._

/**
  * Created by chandrashekar.v on 6/5/2017.
  */
object Driver {

  def main(args: Array[String]): Unit = {
    var javaBean = new JavaBeanExample("Apache", "Spark", 1)
    println(javaBean.toString)
    println(javaBean.getFirstName)
    println(javaBean.getLastName)
    println(javaBean.getAge)

    javaBean.setFirstName("Map")
    javaBean.setLastName("Reduce")
    javaBean.setAge(2)

    println(javaBean.toString)
    println(javaBean.getFirstName)
    println(javaBean.getLastName)
    println(javaBean.getAge)

    val email = new EmailAccount
    email.setAccountName("apache.spark")
    println("Email: " + email.getAccountName)

  }
}

/**
  * just by adding the @BeanProperty tag to your class fields,
  * the get and set (getter and setter) JavaBean methods will be generated automatically.
  *
  * @param firstName
  * @param lastName
  * @param age
  */
class JavaBeanExample(@BeanProperty var firstName: String, @BeanProperty var lastName: String,
                      @BeanProperty var age: Int) {

  override def toString: String = ("%s, %s, %d").format(firstName, lastName, age)
}

class EmailAccount {
  @BeanProperty var accountName: String = null
  @BeanProperty var username: String = null
  @BeanProperty var password: String = null
  @BeanProperty var mailbox: String = null
  @BeanProperty var imapServerUrl: String = null
  @BeanProperty var minutesBetweenChecks: Int = 0
  @BeanProperty var protocol: String = null
  @BeanProperty var usersOfInterest = new java.util.ArrayList[String]()
}