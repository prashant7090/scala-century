package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 20/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem15Suite extends FunSuite{
  import Problem15.duplicateN;

  test("Should Duplicate the elements of a list a given number of times"){
    assert( duplicateN(3,List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')  )
  }

}
