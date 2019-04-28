package com.github.kkotowiczz.chapter8.inheritance

class Square(override val a: Double) extends Rectangle(a, a) {
  override def area: Double = a * a
}
