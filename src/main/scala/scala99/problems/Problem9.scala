package scala99.problems

/**
  * Created by prashant on 16/03/18.
  */

/*
  Pack consecutive duplicates of list elements into sublists.
  If a list contains repeated elements they should be placed in separate sublists.
  Example:

  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/

object Problem9 {


  def pack(input: List[Any]): List[List[Any]] = {
        val (a,b) = input.span( _==input.head )
        if(b == Nil)
          List(a)
        else
          a::pack(b)
  }

  def main(args: Array[String]): Unit = {
      print(pack(List('a','a','b','c','c','c','d')))
  }


}
