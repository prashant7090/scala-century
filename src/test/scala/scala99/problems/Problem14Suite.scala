package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 20/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem14Suite extends FunSuite{
  import Problem14.duplicate;

  test("Should create the duplicates elements of list"){
    assert( duplicate(List('a','a','b','c','c','c','d')) ==  List('a','a','a','b','b','c','c','c','c','d','d')  )
  }


}
