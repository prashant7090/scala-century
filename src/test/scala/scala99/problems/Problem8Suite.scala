package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite



/**
  * Created by prashant on 15/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem8Suite extends FunSuite{
  import Problem8.compress;

  test("consecutive duplicate charcters should be removed from list"){
    assert(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) === List('a', 'b', 'c', 'a', 'd', 'e'))
  }

  test("An Empty list should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      compress(List())
    }
  }

}
