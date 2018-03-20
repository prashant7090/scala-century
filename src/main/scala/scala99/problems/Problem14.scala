package scala99.problems

/**
  * Created by prashant on 20/03/18.
  */

/*
  P14 (*) Duplicate the elements of a list.
  Example:
  scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/

object Problem14 {

  def duplicate(input:List[Char]):List[Any] = {

    def loop(input:List[Char],output:List[Any]):List[Any] = {
      val (c,r) = input.span(_ == input.head)
      if(r==Nil)
        output:::(c:+c.head)
      else
        (output:::(c:+c.head)):::loop(r,output)
    }
    loop(input,List())

  }

  def main(args: Array[String]): Unit = {
      println(duplicate(List('a', 'b', 'c', 'c', 'd')))
  }


}
