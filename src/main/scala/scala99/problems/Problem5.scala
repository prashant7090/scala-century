package scala99.problems

/**
  * Created by prashant on 13/03/18.
  */

/*
  Reverse a list.
  Example:
  scala> reverse(List(1, 1, 2, 3, 5, 8))
  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

object Problem5 {

  def reverseList(list:List[Int]):List[Int] ={
    def loop(input:List[Int],output:List[Int]): List[Int] = {
      input match {
        case Nil => output;
        case x::xs => loop(xs, x::output)
      }
    }
    loop(list, List());
  }


  def main(args: Array[String]): Unit = {
    println("List: " + reverseList(List(1, 1, 2, 3, 5, 8)))
  }


}
