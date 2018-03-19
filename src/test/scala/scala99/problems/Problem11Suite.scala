package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 16/03/18.
  */

@RunWith(classOf[JUnitRunner])
class Problem11Suite extends FunSuite{
  import Problem11.encodeModified;

  test("Consecutive duplicates of elements should encode as tuples (N, E)"){
    assert( encodeModified(List('a','a','b','c','c','c','d')) == List( (2,'a'), 'b', (3,'c'), 'd' ))
  }

  test("Shoudl throw a exception for an empty list"){
      assertThrows[UnsupportedOperationException]{
        encodeModified(List())
      }
  }

}
