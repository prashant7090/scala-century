package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 27/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem24Suite extends FunSuite{
  import Problem24.lotto;

  test("Should create the list 5 elements, element should be between 10 to 20"){
      assert(lotto(5,1,10).length == 5)

  }


}
