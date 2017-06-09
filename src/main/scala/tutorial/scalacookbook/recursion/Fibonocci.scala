package tutorial.scalacookbook.recursion

/**
  * Created by chandrashekar.v on 5/31/2017.
  */
object Fibonocci {

  def main(args: Array[String]): Unit = {

    print(fib)
  }

  def fib() = {

    def fibPrint(seq1: Int, seq2: Int): Unit = {

      val next = seq1 + seq2;
      println(next)
      if (next > 10000) System.exit(0)
      else
        fibPrint(seq2, next)

    }

    fibPrint(1, 2)
  }
}
