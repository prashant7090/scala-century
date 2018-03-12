package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 6/12/17.
  */
@RunWith(classOf[JUnitRunner])
class Problem1Suite extends FunSuite{
  import Problem1.findLastElementOfList

  test("test last element of non empty list"){
    assert(findLastElementOfList(List(1,2,3,4)) === 4)
  }

  test("test empty list which should throw exception"){
    assertThrows[NoSuchElementException]{
      findLastElementOfList(List())
    }
  }

}
