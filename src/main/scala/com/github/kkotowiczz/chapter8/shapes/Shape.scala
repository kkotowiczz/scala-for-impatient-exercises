package com.github.kkotowiczz.chapter8.shapes

import com.github.kkotowiczz.chapter8.points.LabeledPoint

/*
Define an abstract class Shape with an abstract method centerPoint and subclasses
Rectangle and Circle . Provide appropriate constructors for the subclasses and
override the centerPoint method in each subclass.
 */

abstract class Shape {
  def centerPoint: LabeledPoint
}
