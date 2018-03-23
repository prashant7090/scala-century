package scala99.problems

/**
  * Created by prashant on 22/03/18.
  */

/*
  19 (**) Rotate a list N places to the left.
  Examples:
  scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

  scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i
*/

object Problem19{

  def rotate(nth: Int,input: List[Char]): List[Char] = input match {
    case Nil => input
    case _ if(nth == 0) => input
    case _ if(nth < 0 ) => rotate(nth+1, input.last::input.init)
    case _ if(nth > 0)  => rotate(nth-1, input.tail:+ input.head )
  }

  def main(args: Array[String]): Unit = {
    println(rotate(12,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')))
  }

}
