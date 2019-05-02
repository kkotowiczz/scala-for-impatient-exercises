package com.github.kkotowiczz.chapter11

object Chapter11 extends App {
  //According to the precedence rules, how are 3 + 4 -> 5 and 3 -> 4 + 5 evaluated?
//  println(3 + 4 -> 5)
//  println(3 -> 4 + 5)

  val frac1 = new Fraction(3, 5)
  val frac2 = new Fraction(1, 10)
  val frac3 = frac1 + frac2
  println(frac3)
}
