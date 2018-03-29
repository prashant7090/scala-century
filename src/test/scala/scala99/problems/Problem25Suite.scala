package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 29/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem25Suite extends FunSuite{
  import Problem25.randomPermute;

  test("Should create the list 5 elements, element should be between 10 to 20"){
      assert(randomPermute(List(1,2,3,4)).length == 4 )

  }


}
