package scala99.problems

/**
  * Created by prashant on 15/03/18.
  */

/*
  Flatten a nested list structure.
  Example:
  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)

*/

object Problem7 {

    def flatten(list:List[Any]):List[Any] ={
      list.flatMap {
        case head: List[_] => flatten(head)
        case e => List(e)
      }
    }

  def main(args: Array[String]): Unit = {
      println("Flatten: " + flatten(List(List(1,2),4,List(5,6))))
  }


}
