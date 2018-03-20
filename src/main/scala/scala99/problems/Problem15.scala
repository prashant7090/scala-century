package scala99.problems

/**
  * Created by prashant on 20/03/18.
  */

/*
  P15 (**) Duplicate the elements of a list a given number of times.
  Example:
  scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
*/

object Problem15{

  def duplicateN(ntimes:Int,input:List[Char]):List[Any] = {

    def loop(input:List[Char],output:List[Any]):List[Any] = {
      val (c,r) = input.span(_ == input.head)
      if(r==Nil)
        output:::(List.fill(c.length*ntimes)(c.head))
      else
        (output:::(List.fill(c.length*ntimes)(c.head)):::loop(r,output))
    }
    loop(input,List())

  }

  def main(args: Array[String]): Unit = {
      println(duplicateN(3,List('a','a','a', 'b', 'c', 'c', 'd','d')))
  }


}
