package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class APISpec extends FlatSpec with Matchers {

  """Given an array of scores, method "scoresIncreasing"""" should """return true if each score is equal or greater than the one before. The array will be length 2 or more.""" in {
    API.scoresIncreasing(Array(1, 3, 4)) should equal(true)
    API.scoresIncreasing(Array(1, 3, 2)) should equal(false)
    API.scoresIncreasing(Array(1, 1, 4)) should equal(true)
  }

  """Given an array of scores, method """"" should """return true if there are scores of 100 next to each other in the array. The array length will be at least 2.""" in {
    API.scores100(Array(1, 100, 100)) should equal(true)
    API.scores100(Array(1, 100, 99, 100)) should equal(false)
    API.scores100(Array(100, 1, 100, 100)) should equal(true)
  }

  """Given an array of scores sorted in increasing order, method "scoresClump"""" should """return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.""" in {
    API.scoresClump(Array(3, 4, 5)) should equal(true)
    API.scoresClump(Array(3, 4, 6)) should equal(false)
    API.scoresClump(Array(1, 3, 5, 5)) should equal(true)
  }
}