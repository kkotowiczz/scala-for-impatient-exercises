package com.github.kkotowiczz.chapter10.vehicles

import com.github.kkotowiczz.chapter10.surfaces.Surface

trait Vehicle extends Moving {
  val canMoveOn: List[Surface]
  override def move(surface: Surface): Unit = {
    if(canMoveOn.contains(surface))
      println("Moving on " + surface)
    else println("Cannot move")
  }
}
