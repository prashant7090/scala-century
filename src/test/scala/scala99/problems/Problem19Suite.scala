package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 23/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem19Suite extends FunSuite{
  import Problem19.rotate;

  test("Should rotate the list by 3 element left"){
    assert( rotate(3,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('d', 'e', 'f', 'g','h','i','j','k','a','b','c' ) )
  }

  test("Should rotate the list by 2 element right"){
    assert( rotate(-2,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('j','k','a','b','c', 'd', 'e', 'f', 'g','h','i') )
  }

  test("List should remaining same for 0 rotate operation"){
    assert( rotate(0,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k') )
  }


}
