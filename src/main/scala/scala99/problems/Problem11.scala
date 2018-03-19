package scala99.problems

/**
  * Created by prashant on 19/03/18.
  */

/*
  P11 (*) Modified run-length encoding.
  Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
  Example:

  scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*/

object Problem11 {

  def encodeModified(input:List[Any]):List[Any]={
    if(input.isEmpty)
      throw new UnsupportedOperationException("List is empty")
    val (a,b) = input.span(_ == input.head)

    if(b==Nil){
      if(a.length == 1)
        a.head ::List()
      else
        (a.length,a.head)::List()
    }
    else {
      if(a.length == 1)
        a.head :: encodeModified(b)
      else
        (a.length, a.head) :: encodeModified(b)
    }
  }
  def main(args: Array[String]): Unit = {
      print(encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))
  }


}
