package com.github.kkotowiczz.chapter8.inheritance

class Rectangle(val a: Double, val b: Double) extends Shape {
  override def area: Double = a * b
}
