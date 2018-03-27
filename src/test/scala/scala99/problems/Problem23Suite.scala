package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 27/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem23Suite extends FunSuite{
  import Problem23.randomSelect;

  test("Should return list of size 5"){
    assert( randomSelect(5,List('a','b','c','d','f','g','h')).size == 5 )
  }

  test("Should return list of size 7"){
    assert( randomSelect(55,List('a','b','c','d','f','g','h')).size == 7 )
  }


}
