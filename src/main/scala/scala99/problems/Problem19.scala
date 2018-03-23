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

  def rotate(nthRotate:Int, input:List[Char]):List[Any] = {
    if(nthRotate == 0)
      return input

    def loop(nthRotate:Int, input:List[Char],index:Int,output:List[Char]):List[Any] = {
        input match {
          case x::xs if(index < nthRotate && nthRotate > 0) => loop(nthRotate,xs,index+1,output:+x)
          case x::xs if(nthRotate !=index && nthRotate < 0) => loop(nthRotate,input dropRight(1),index-1,xs.last+:output)
          case _ if(nthRotate>0) =>  input:::output
          case _ if(nthRotate<0) => output:::input
          case _  => output:::input
        }
    }
    loop(nthRotate,input,0,List())
  }

  def main(args: Array[String]): Unit = {
    println(rotate(10,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')))
  }


}
