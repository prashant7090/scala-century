package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
  * Created by prashant on 26/03/2018.
  */

@RunWith(classOf[JUnitRunner])
class Problem22Suite extends FunSuite{
  import Problem22.range;

  test("Should create a list from 0 to 9"){
    assert( range( 0, 9) ==  List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) )
  }

  test("Should create a list from -10 to 10"){
    assert( range(-10, 10) ==  List(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10) )
  }

  test("Should return an empty for the range -10 to 10"){
    assert( range(10, -10) ==  List() )
  }


}
