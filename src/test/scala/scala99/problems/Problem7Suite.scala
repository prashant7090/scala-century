package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

import scala99.problems.Problem3.findKthElementOfList

/**
  * Created by prashant on 15/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem7Suite extends FunSuite{
  import Problem7.flatten;

  test("Nested list should return flatten result"){
    assert(flatten(List(List(1,2,3),4,List(5,6,7))) ===  List(1,2,3,4,5,6,7) )
  }

}
