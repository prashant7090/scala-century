package scala99.problems

/**
  * Created by prashant on 13/03/18.
  */

/*
  Find out whether a list is a palindrome.
  Example:
  scala> isPalindrome(List(1, 2, 3, 2, 1)) 1 2 2 1
  res0: Boolean = true
*/

object Problem6 {

  def isPalindrome(list: List[Int]): Boolean = {

    if(list.isEmpty)
      throw new UnsupportedOperationException("List is empty!")

    def loop(list: List[Int]): Boolean={
      list match {
        case Nil => true
        case x::Nil => true
        case x::xs if(x == xs.last) => loop(xs.dropRight(1))
        case _ => false
      }
    }

    loop(list)

  }


  def main(args: Array[String]): Unit = {
      println(isPalindrome(List(1,8,8)))
  }


}
