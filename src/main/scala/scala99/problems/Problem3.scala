package scala99.problems

/**
  * Created by prashant on 13/03/18.
  */

/*
Find the Kth element of a list.

By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2

*/

object Problem3 {

  def findKthElementOfList(list:List[Int],k:Int): Int ={
      def loop(list:List[Int],k:Int,index:Int):Int ={
        list match {
          case Nil=> throw new UnsupportedOperationException("Element is not available on given index")
          case x::xs if(k ==index) => x
          case _::xs =>   loop(xs,k,(index+1))
        }
      }
    loop(list,k,0)
  }

  def main(args: Array[String]): Unit = {
      println(findKthElementOfList(List(1,2,3,4,5),4));
  }


}
