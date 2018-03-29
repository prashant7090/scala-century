package scala99.problems

/**
  * Created by prashant on 29/03/18.
  */

/*
  P25 (*) Generate a random permutation of the elements of a list.
  Hint: Use the solution of problem P23.
  Example:

  scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
*/

object Problem25{

  import Problem23.randomSelect

  def randomPermute(input:List[Any]):List[Any] = {
      randomSelect(input.length,input)
  }


  def main(args: Array[String]): Unit = {
      println(randomPermute(List(1,2,3,4,5)))
  }

}
