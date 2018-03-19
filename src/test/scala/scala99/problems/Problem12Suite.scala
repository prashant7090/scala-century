package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem12Suite extends FunSuite{
  import Problem12.decode;

  test("Should create list of charcters from tuple list"){
    assert( decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))) == List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e') )
  }

  //TODO:come back and write this test case.
//  test("Should return empty list for empty input"){
//    assert( decode(List[] == List()) )
//  }

}
