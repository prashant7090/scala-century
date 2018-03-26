package scala99.problems

/**
  * Created by prashant on 26/03/18.
  */

/*
  P22 (*) Create a list containing all integers within a given range.
  Example:
  scala> range(4, 9)
  res0: List[Int] = List(4, 5, 6, 7, 8, 9)
*/

object Problem22{


    def range(from:Int, to: Int): List[Any] = {
      if(from > to)
        return List()

      def loop(from:Int, to:Int, output:List[Int]):List[Int] = {
        if(from > to){
          output
        }
        else {
          loop(from+1,to, output:+from)
        }
      }

      loop(from,to,List())
    }


  def main(args: Array[String]): Unit = {
    println(range(-1,10))
  }

}
