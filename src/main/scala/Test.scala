/**
  * Created by chandrashekar.v on 4/21/2017.
  */
object Test {

  def main(args: Array[String]): Unit = {
    println("Testing")
    println(factorial(5))
    println(factorial1(5))
    println(factorialBad(500)) // Doesn't work for big numbers due to stack overflow error.
    val list1 = List(1,2,3,4,5)
    println(sumElements(list1))
    println(mapOp(list1))

    val car = new Car(1990, 0);
  }
  def factorial(n:Int) = factorialImpl(n, 1)

  def factorial1(n:Int) = {
    @scala.annotation.tailrec
    def factorialImpl(n:Int, fact:BigInt):BigInt = {
      if(n==1)
        return fact
      factorialImpl(n-1, n*fact)

    }

    factorialImpl(n, 1)
  }

  @scala.annotation.tailrec
  def factorialImpl(n:Int, fact:BigInt):BigInt = {
    if(n==1)
      return fact
    factorialImpl(n-1, n*fact)

  }

  def factorialBad(n:Int): BigInt = {
    if(n==1)
      return 1;
    n*factorialBad(n-1);

  }

  def sumElements(l:List[Int]) =  l.foldLeft(0) {(c, e)=>c + e}

  def mapOp(l:List[Int]) = l.map(e=>e*2)
}


class Car(val year:Int, var miles:Int) {
  println("Created Car")
}