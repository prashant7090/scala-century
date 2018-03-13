package scala99.problems

/**
  * Created by prashant on 13/03/18.
  */

/*
  Find the number of elements of a list.
  Example:
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6
*/

object Problem4 {

  def findTotalElmentsInList(list:List[Int]):Int = {
    def loop(list:List[Int],count:Int):Int = {
       list match {
         case Nil => count;
         case x::xs => loop(xs,(count+1))
       }
    }
    loop(list,0)
  }

  def main(args: Array[String]): Unit = {
      println(findTotalElmentsInList(List(1, 1, 2, 3, 5, 8)));
  }


}
