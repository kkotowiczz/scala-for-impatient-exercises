package com.github.kkotowiczz.chapter8.square

import com.github.kkotowiczz.chapter8.points.Point

/*
Define an abstract class Shape with an abstract method centerPoint and subclasses
Rectangle and Circle . Provide appropriate constructors for the subclasses and
override the centerPoint method in each subclass.
 */

class Square(val corner: Point, width: Double) extends java.awt.Rectangle {
  def this(width: Double) = this(new Point(0d, 0d), width)
  def this(point: Point) = this(point, 0)
  def this() = this(new Point(0d, 0d), 0)
}
