package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem9Suite extends FunSuite{
  import Problem9.pack;

  test("Should create a sublist from consecutive duplicates elements of list"){
    assert( pack(List('a','a','b','c','c','c','d')) == List( List('a','a'), List('b'), List('c','c','c'), List('d') ))
  }

}
