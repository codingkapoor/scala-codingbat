package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class LogicISpec extends FlatSpec with Matchers {

  """When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Method "cigarParty"""" should """return true if the party with the given values is successful, or false otherwise.""" in {
    LogicI.cigarParty(30, false) should equal(false)
    LogicI.cigarParty(50, false) should equal(true)
    LogicI.cigarParty(70, true) should equal(true)
  }

  """You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, the method "dateFashion"""" should """return 2(yes) as the result, with the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).""" in {
    LogicI.dateFashion(5, 10) should equal(2)
    LogicI.dateFashion(5, 2) should equal(0)
    LogicI.dateFashion(5, 5) should equal(1)
  }

  """The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, method "squirrelPlay"""" should """return true if the squirrels play and false otherwise.""" in {
    LogicI.squirrelPlay(70, false) should equal(true)
    LogicI.squirrelPlay(95, false) should equal(false)
    LogicI.squirrelPlay(95, true) should equal(true)
  }

  """You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, method "caughtSpeeding"""" should """return 0 as result. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.""" in {
    LogicI.caughtSpeeding(60, false) should equal(0)
    LogicI.caughtSpeeding(65, false) should equal(1)
    LogicI.caughtSpeeding(65, true) should equal(0)
  }
}