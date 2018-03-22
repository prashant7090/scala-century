package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 22/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem18Suite extends FunSuite{
  import Problem18.slice;

  test("Should slice the list containing the elements from 3rd element up to 6th"){
    assert(slice(3,7,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('d', 'e', 'f', 'g'))
  }

  test("Should return the entire list if endIndex is greter then list length and index start from zero"){
    assert(slice(0,20,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k'))
  }



}
