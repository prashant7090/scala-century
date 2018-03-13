package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 13/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem5Suite extends FunSuite{
  import Problem5.reverseList

  test("Test reverse of list"){
    assert( reverseList(List(1,2,3)) === List(3,2,1) )
  }

  test("Test reverse of empty list"){
    assert( reverseList(List()) === List() )
  }

}
