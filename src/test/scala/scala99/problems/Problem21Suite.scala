package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 26/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem21Suite extends FunSuite{
  import Problem21.insertAt;

  test("Should add given element at the list at 0th position"){
    assert( insertAt("Matrix", 0, List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) ==  List("Matrix",'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j','k') )
  }

  test("Should add given element at the list at 10th position"){
    assert( insertAt("Fury", 10, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) ==  List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', "Fury", 'k') )
  }

  test("Should add given element at the list at 11th position"){
    assert( insertAt("Enemy At The Gates", 11, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) == List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', "Enemy At The Gates") )
  }

  test("Should throw an exception if index is negative"){
    assertThrows[UnsupportedOperationException]{
      insertAt("The Departed", -2, List('a','b','c'))
    }
  }

  test("Should throw an exception if index is greter than list length"){
    assertThrows[UnsupportedOperationException]{
      insertAt("American History X", 99, List('a','b','c'))
    }
  }


}
