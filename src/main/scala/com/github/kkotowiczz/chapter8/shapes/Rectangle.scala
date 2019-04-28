package com.github.kkotowiczz.chapter8.shapes

import com.github.kkotowiczz.chapter8.points.LabeledPoint

class Rectangle(val a: Double, val b: Double) extends Shape {
  override def centerPoint: LabeledPoint = new LabeledPoint("Rectangle Center Point", a / 2, b / 2)
}
