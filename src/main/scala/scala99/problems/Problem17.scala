package scala99.problems

/**
  * Created by prashant on 21/03/18.
  */

/*
  P17 (*) Split a list into two parts.
  The length of the first part is given. Use a Tuple for your result.
  Example:

  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/

object Problem17{

  def split(nth:Int,input:List[Char]):(List[Char],List[Char]) = {

    if(nth == input.length || nth > input.length)
      return (input,List())

    if(nth == 0)
      return (List(),input)


    def loop(index:Int,input: List[Char],firstTuple:List[Char]):(List[Char],List[Char]) = {
      input match {
        case x::xs if(nth == index) => (firstTuple:+x,xs)
        case x::xs => loop(index+1,xs,firstTuple:+x)
      }
    }
    loop(1,input,List())
  }

  def main(args: Array[String]): Unit = {
      println(split(4,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')))
  }


}
