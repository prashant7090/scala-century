package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 20/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem17Suite extends FunSuite{
  import Problem17.split;

  test("Should split the list into two parts, first parts should should be of given length"){
    assert( split(3,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) ==   (List('a','b','c'),  List('d', 'e', 'f', 'g','h','i','j','k'))  )
  }

  test("For zero index, it Should create first tuple as empty list and second tuple as input"){
    assert( split(0,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) ==   (List(),  List('a','b','c','d', 'e', 'f', 'g','h','i','j','k'))  )
  }

  test("For index greter than list length it Should first tuple as input and second tuple as empty list"){
    assert( split(12,List('a','b','c', 'd', 'e', 'f', 'g','h','i','j','k')) ==   (List('a','b','c','d', 'e', 'f', 'g','h','i','j','k'), List())  )
  }


}
