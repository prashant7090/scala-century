package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem10Suite extends FunSuite{
  import Problem10.encode;

  test("Consecutive duplicates of elements should encode as tuples (N, E)"){
    assert( encode(List('a','a','b','c','c','c','d')) == List( (2,'a'), (1,'b'), (3,'c'), (1,'d') ))
  }

  test("Shoudl throw a exception for an empty list"){
      assertThrows[UnsupportedOperationException]{
        encode(List())
      }
  }

}
