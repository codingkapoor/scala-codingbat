package com.codingkapoor.codingbat

import scala.annotation.tailrec

object RecursionI {

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def bunnyEars(bunnies: Int): Int = {
    if (bunnies == 0) 0
    else if (bunnies == 1) 2
    else 2 + bunnyEars(bunnies - 1)
  }

  def fibonacci(n: Int) = {

    @tailrec
    def fibonacciR(first: Int, second: Int, counter: Int): Int = {
      if (counter == 0) first
      else fibonacciR(second, first + second, counter - 1)
    }

    fibonacciR(0, 1, n)
  }

  def bunnyEars2(bunnies: Int): Int = {
    if (bunnies == 0) 0
    else if (bunnies % 2 != 0) 2 + bunnyEars2(bunnies - 1)
    else 3 + bunnyEars2(bunnies - 1)
  }

  def triangle(rows: Int): Int = {
    if (rows == 0) 0 else if (rows == 1) 1 else {
      rows + triangle(rows - 1)
    }
  }

  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def sumDigits(n: Int) = {
    n.toString.map(_.asDigit).sum
  }

  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def count7(n: Int) = {
    n.toString.map(_.asDigit).count(_ == 7)
  }

  def count8(n: Int) = {
    val digitsInPair = n.toString.toList.sliding(2, 2).toList

    @tailrec
    def count8(counter: Int, ls: List[List[Char]]): Int = ls match {
      case Nil => counter
      case x :: Nil =>
        val c = x.count(_ == '8'); if (c == 2) count8(counter + c + 1, Nil) else count8(counter + c, Nil)
      case x :: xs =>
        val c = x.count(_ == '8'); if (c == 2) count8(counter + c + 1, xs) else count8(counter + c, xs)
    }

    count8(0, digitsInPair)
  }

  def powerN(n: Int, base: Int) = {

    @tailrec
    def powerNR(res: Int, counter: Int): Int = {
      if (counter == 1) res
      else powerNR(res * n, counter - 1)
    }

    powerNR(n, base)
  }

  def countX(str: String) = {

    @tailrec
    def countXR(res: Int, ls: List[Char]): Int = ls match {
      case Nil => res
      case x :: Nil => if (x == 'x') countXR(res + 1, Nil) else countXR(res, Nil)
      case x :: xs => if (x == 'x') countXR(res + 1, xs) else countXR(res, xs)
    }

    countXR(0, str.toList)
  }


  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def countHi(str: String) = {
    str.sliding(2).toList.count(_ == "hi")
  }

  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def changeXY(str: String) = {
    str.replaceAll("x", "y")
  }

  def changePi(str: String) = {

    @tailrec
    def changePiR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case Nil => res
      case x :: Nil => changePiR(res :+ x, Nil)
      case x :: y :: xs => if (x == 'p' && y == 'i') changePiR(res :+ '3' :+ '.' :+ '1' :+ '4', xs) else changePiR(res :+ x, y :: xs)
    }

    changePiR(Nil, str.toList).mkString
  }

  def noX(str: String) = {

    @tailrec
    def noXR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case x :: Nil => if (x == 'x') res else res :+ x
      case x :: xs => if (x == 'x') noXR(res, xs) else noXR(res :+ x, xs)
    }

    noXR(Nil, str.toList).mkString
  }

  def array6(nums: Array[Int], index: Int) = {

    @tailrec
    def array6R(res: Boolean, arr: List[Int]): Boolean = arr match {
      case Nil => res
      case x :: Nil => if (x == 6) array6R(res = true, Nil) else array6R(res = false, Nil)
      case x :: xs => if (x == 6) array6R(res = true, Nil) else array6R(res = false, xs)
    }

    array6R(res = false, nums.drop(index).toList)
  }

  def array11(nums: Array[Int], index: Int) = {

    @tailrec
    def array11R(counter: Int, ls: List[Int]): Int = ls match {
      case Nil => counter
      case x :: Nil => if (x == 11) array11R(counter + 1, Nil) else array11R(counter, Nil)
      case x :: xs => if (x == 11) array11R(counter + 1, xs) else array11R(counter, xs)
    }

    array11R(0, nums.drop(index).toList)
  }

  def array220(arr: Array[Int], index: Int) = {
    arr.sliding(2).count {
      case Array(x) => x / x == 2 // This condition is introduced to take care of cases when Array is left with only one element.
      case Array(x, y) => y / x == 10
    } > 0
  }

  def allStar(str: String) = {

    @tailrec
    def allStarR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case Nil => res
      case x :: Nil => allStarR(res :+ x, Nil)
      case x :: xs => allStarR(res :+ x :+ '*', xs)
    }

    allStarR(Nil, str.toList).mkString
  }

  def pairStar(str: String) = {

    @tailrec
    def pairStarR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case Nil => res
      case x :: Nil => pairStarR(res :+ x, Nil)
      case x :: xs => if (x == xs.head) pairStarR(res :+ x :+ '*', xs) else pairStarR(res :+ x, xs)
    }

    pairStarR(Nil, str.toList).mkString
  }

  def endX(str: String) = {

    @tailrec
    def endXR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case Nil => res
      case x :: Nil => if (x == 'x') endXR(res, Nil) else endXR(res :+ x, Nil)
      case x :: xs => if (x == 'x') endXR(res, xs) else endXR(res :+ x, xs)
    }

    endXR(Nil, str.toList).mkString + ("x" * str.count(_ == 'x'))
  }

  def countPairs(str: String) = {

    @tailrec
    def countPairsR(res: Int, ls: List[Char]): Int = ls match {
      case Nil => res
      case _ :: Nil => res
      case _ :: _ :: Nil => countPairsR(res, Nil)
      case x :: y :: xs => if (x == xs.head) countPairsR(res + 1, y :: xs) else countPairsR(res, y :: xs)
    }

    countPairsR(0, str.toList)
  }

  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def countAbc(str: String) = {
    val pattern = "abc|aba".r
    pattern.findAllIn(str).toList.size
  }

  def count11(str: String) = {
    val pattern = "11".r
    pattern.findAllIn(str).toList.size
  }

  def stringClean(str: String) = {

    @tailrec
    def stringCleanR(res: List[Char], ls: List[Char]): List[Char] = ls match {
      case Nil => res
      case x :: Nil => if (x == res.last) stringCleanR(res, Nil) else stringCleanR(res :+ x, Nil)
      case x :: xs => if (x == res.last) stringCleanR(res, xs) else stringCleanR(res :+ x, xs)
    }

    stringCleanR(Nil :+ str.head, str.tail.toList).mkString
  }

  def stringCleanII(str: String) = str.distinct

  // Such problems can be solved far more conveniently in ways other than recursion in Scala.
  def countHi2(str: String) = {
    val pattern1 = "hi".r
    val pattern2 = "xhi".r

    pattern1.findAllIn(pattern2.replaceAllIn(str, "")).size
  }

  def parenBit(str: String) = {
    val pattern = """\([a-z]*\)""".r
    pattern.findAllIn(str).toList.headOption match {
      case Some(res) => res
      case None => ""
    }
  }

  def nestParen(str: String) = {
    val pattern = """\([\(\)]*\)""".r
    pattern.findAllIn(str).nonEmpty
  }

  // Non-overlapping is taken into consideration
  def strCount(str: String, sub: String) = {
    val pattern = sub.r
    pattern.findAllIn(str).size
  }

  // Overlapping is taken into consideration
  def strCopies(str: String, sub: String, n: Int) = {
    str.sliding(3).count(_ == sub) == n
  }

  def strDist(str: String, sub: String) = {
    val pattern1 = s"$sub[a-z]*$sub".r
    val pattern2 = s"$sub".r

    val res = pattern1.findAllIn(str).toList ::: pattern2.findAllIn(str).toList
    if (res != Nil) res.sortBy(_.length).last.length else 0
  }

}
