package scala99.problems

/**
  * Created by prashant on 22/03/18.
  */

/*
  P18 (**) Extract a slice from a list.
  Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
  Example:

  scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g)
*/

object Problem18{

  def slice(startIndex:Int, endIndex:Int,input:List[Char]):List[Char] = {
    (input zipWithIndex).filter{
      case (e,index) => index >=startIndex && index < endIndex
    }.map(_._1)
  }

  def main(args: Array[String]): Unit = {
    println(slice(0,17,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')))
  }


}
