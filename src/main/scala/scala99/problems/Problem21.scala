package scala99.problems

/**
  * Created by prashant on 26/03/18.
  */

/*
  P21 (*) Insert an element at a given position into a list.
  Example:
  scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*/

object Problem21{


    def insertAt(ele:Any, nth: Int,input: List[Any]): List[Any] = {
          if(nth < 0 || nth > input.length){
            throw new UnsupportedOperationException("Given index is invalid")
          }
          else{
            ((input take nth):+ ele) ::: (input drop nth)
          }
    }


  def main(args: Array[String]): Unit = {
    println(insertAt("American History X", 3, List('a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
  }

}
