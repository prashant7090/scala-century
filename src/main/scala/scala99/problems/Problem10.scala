package scala99.problems

/**
  * Created by prashant on 19/03/18.
  */

/*
  P10 (*) Run-length encoding of a list.
  Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  Example:

  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/

object Problem10 {

  def encode(input:List[Any]):List[Any]={
    if(input.isEmpty)
      throw new UnsupportedOperationException("List is empty")
    val (a,b) = input.span(_ == input.head)
    if(b==Nil)
        (a.length,a.head)::List()
    else
      (a.length,a.head)::encode(b)
  }
  def main(args: Array[String]): Unit = {
      print(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }


}
