package scala99.problems

/**
  * Created by prashant on 26/03/18.
  */

/*
  P20 (*) Remove the Kth element from a list.
  Return the list and the removed element in a Tuple. Elements are numbered from 0.
  Example:

  scala> removeAt(1, List('a, 'b, 'c, 'd))
  res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
*/

object Problem20{


  def removeAt(nth: Int,input: List[Char]): (List[Char],Any) = {
    if(nth < 0 || nth > input.length)
      (input,None)
    else{
      ((input take nth) :::input.drop(nth+1),(input take nth+1).last)
    }
  }

  def main(args: Array[String]): Unit = {
    println(removeAt(10,List('a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

}
