package scala99.problems

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite


/**
  * Created by prashant on 13/03/18.
  */
@RunWith(classOf[JUnitRunner])
class Problem3Suite extends FunSuite{
  import Problem3.findKthElementOfList;

  test("3rd element of List should return 4"){
    assert(findKthElementOfList(List(1,2,3,4,5),3) === 4 )
  }

  test("1st element of List should return 2"){
    assert(findKthElementOfList(List(1,2,3,4,5),1) === 2 )
  }

  test("0th element of List should return 1"){
    assert(findKthElementOfList(List(1,2,3,4,5),0) === 1 )
  }


  test("-1th element of List should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      findKthElementOfList(List(1,2,3,4,5),-1)
    }
  }

  test("5th(n+1) element of List should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      findKthElementOfList(List(1,2,3,4,5),5)
    }
  }

  test("An empty List should throw an exception"){
    assertThrows[UnsupportedOperationException]{
      findKthElementOfList(List(),0)
    }
  }



}
