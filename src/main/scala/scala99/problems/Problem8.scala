package scala99.problems

import sun.invoke.empty.Empty

/**
  * Created by prashant on 15/03/18.
  */

/*
  Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/

object Problem8 {

  def compress(list:List[Char]):List[Char]={
    if (list.isEmpty) throw new UnsupportedOperationException("list is empty")
    def loop(input: List[Char], output:List[Char]):List[Char] ={
      input match {
        case x::Nil => output:+x
        case x::xs if(x != xs.head) => loop(xs,output:+x)
        case x::xs => loop(xs,output)
      }
    }

    loop(list,List())
  }



  def main(args: Array[String]): Unit = {
    println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e','p')))
  }


}
