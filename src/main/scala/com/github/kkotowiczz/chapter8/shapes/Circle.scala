package com.github.kkotowiczz.chapter8.shapes
import com.github.kkotowiczz.chapter8.points.LabeledPoint

class Circle(val d: Double) extends Shape {
  override def centerPoint: LabeledPoint = new LabeledPoint("Circle center point", d / 2, d / 2)
}
