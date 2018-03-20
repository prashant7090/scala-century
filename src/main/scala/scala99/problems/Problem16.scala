package scala99.problems

/**
  * Created by prashant on 20/03/18.
  */

/*
  P16 (**) Drop every Nth element from a list.
  Example:
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/

object Problem16{

  def drop(nth:Int,input:List[Char]):List[Char] = {
     (input zip (Stream from 1)).filter(_._2%nth != 0).map( _._1)
  }

  def main(args: Array[String]): Unit = {
      println(drop(3,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')))
  }


}
