package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 26/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem20Suite extends FunSuite{
  import Problem20.removeAt;

  test("Should Return the list and the removed element from 3rd position in a Tuple"){
    assert( removeAt(3,List('a','b','c', 'd','e', 'f', 'g','h','i','j','k')) == (List('a','b','c', 'e', 'f', 'g','h','i','j','k'), 'd') )
  }

  test("Should Return the list and the removed element from 2nd position in a Tuple"){
    assert( removeAt(2,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == (List('a','b','d', 'e', 'f', 'g','h','i','j','k'), 'c') )
  }

  test("Should Return the list and the removed element from 0th position in a Tuple"){
    assert( removeAt(0,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == (List('b','c', 'd', 'e', 'f', 'g','h','i','j','k'), 'a') )
  }

  test("Should Return the list and the removed element from 10th position in a Tuple"){
    assert( removeAt(10,List('a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')) == (List('a','b','c', 'd', 'e', 'f', 'g','h','i','j'), 'k') )
  }

  test("Should Return the list with None in a Tuple for negative index"){
    assert( removeAt(-1,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == (List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k'), None) )
  }

  test("Should Return the list with None in a Tuple for index greter than list length"){
    assert( removeAt(99,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) == (List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k'),None) )
  }


}
