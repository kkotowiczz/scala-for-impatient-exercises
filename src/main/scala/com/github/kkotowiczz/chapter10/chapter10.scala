package com.github.kkotowiczz.chapter10

object chapter10 extends App {
  val op1 = new OrderedPoint(1, 1)
  val op2 = new OrderedPoint(1, 2)
  val op3 = new OrderedPoint(2, 1)
  println(op1 compare(op2))
  println(op2 compare(op3))
  println(op1 compare(op3))
}
