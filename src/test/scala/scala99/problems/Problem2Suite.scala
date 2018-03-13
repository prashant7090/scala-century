package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 13/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem2Suite extends FunSuite{
  import Problem2.findSecondLastElementOfList

  test("test second last element of non empty list"){
    assert(findSecondLastElementOfList(List(1,2,3,4)) === 3)
  }

  test("test empty list which should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      findSecondLastElementOfList(List())
    }
  }

  test("test list with less than 2 element should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      findSecondLastElementOfList(List(1))
    }
  }

}
