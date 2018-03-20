package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 20/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem16Suite extends FunSuite{
  import Problem16.drop;

  test("Should Drop every 3rd element from a list"){
    assert( drop(3,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('a','b','d','e','g','h','j','k')  )
  }

  test("Should Drop every 2nd element from a list"){
    assert( drop(2,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('a','c', 'e',  'g','i','k')  )
  }

}
