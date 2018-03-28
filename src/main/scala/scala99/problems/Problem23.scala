package scala99.problems

import scala.util.Random

/**
  * Created by prashant on 27/03/18.
  */

/*
  * P23 (**) Extract a given number of randomly selected elements from a list.
  Example:
  scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  res0: List[Symbol] = List('e, 'd, 'a)
  Hint: Use the solution to problem P20

*/

object Problem23{

    import Problem20.removeAt;

    def randomSelect(nth:Int, input:List[Any]): List[Any] = {
      val total = if(nth > input.length) input.length else nth
      def loop(nth: Int, output: List[Any]):List[Any] = {

        if(nth == 0){
          output
        }else{
         val r = scala.util.Random
         val (list,el) = removeAt(r.nextInt(input.length),input)
         loop(nth-1,output:+el)
        }
      }
      loop(total,List())
    }


    def randomSelectLib(nth:Int, input:List[Char]):List[Char] = {
      Random.shuffle(input).take(nth)
    }


  def main(args: Array[String]): Unit = {
      println(randomSelect(3,List('a','b','v','z','r','t','b','c','k')))
  }

}
