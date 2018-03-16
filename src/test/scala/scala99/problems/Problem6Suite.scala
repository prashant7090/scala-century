package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite


/**
  * Created by prashant on 13/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem6Suite extends FunSuite{
  import Problem6.isPalindrome;

  test("Palindrome list should return true for odd length of list"){
    assert(isPalindrome(List(1,2,1)) === true)
  }

  test("Palindrome list should return true for even length of list"){
    assert(isPalindrome(List(1,2,2,1)) === true)
  }

  test("Non palindrome list should return false for odd length of list"){
    assert(isPalindrome(List(1,2,3)) === false)
  }

  test("Non palindrome list should return false for event length of list"){
    assert(isPalindrome(List(1,2,3,4,5,6,7,8)) === false)
  }

  test("An Empty list should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      isPalindrome(List())
    }
  }

}
