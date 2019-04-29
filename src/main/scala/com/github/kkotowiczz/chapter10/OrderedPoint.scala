package com.github.kkotowiczz.chapter10

import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[Point] {
  def compare(that: Point): Int = {
    if(this.x <= that.x && this.y < that.y) 1 else -1
  }
}
