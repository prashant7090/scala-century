package scala99.problems

import scala99.problems.Problem20.removeAt

/**
  * Created by prashant on 27/03/18.
  */

/*
  P24 (*) Lotto: Draw N different random numbers from the set 1..M.
  Example:
  scala> lotto(6, 49)
  res0: List[Int] = List(23, 1, 17, 33, 21, 37)
*/

object Problem24{

  import Problem22.range
  import  Problem23.randomSelect

  def lotto(n:Int, to:Int, from:Int):List[Any] = {
      randomSelect(n, range(to,from))
  }


  def main(args: Array[String]): Unit = {
    println(lotto(5,1,10))
  }

}
