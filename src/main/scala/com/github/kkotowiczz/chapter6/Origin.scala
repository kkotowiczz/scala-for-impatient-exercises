package com.github.kkotowiczz.chapter6

class Origin(val x1: Int, val y1: Int)  extends java.awt.Point {
  override def toString: String = s"$x1 : $y1"
}

object Origin {
  def apply(x: Int, y: Int): Origin = new Origin(x, y)
}
