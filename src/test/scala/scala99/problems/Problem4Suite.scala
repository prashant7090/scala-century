package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 13/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem4Suite extends FunSuite{
  import Problem4.findTotalElmentsInList;

  test("A list with 3 elements should written 3"){
    assert(findTotalElmentsInList(List(1,2,3)) === 3)
  }

  test("An empty list should written 0"){
    assert(findTotalElmentsInList(List()) == 0)
  }

}
