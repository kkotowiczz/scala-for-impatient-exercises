package com.github.kkotowiczz.chapter10.vehicles

import com.github.kkotowiczz.chapter10.surfaces.Surface

trait Vehicle extends Moving {
  val canMoveOn: List[Surface]
  override def move(surface: Surface): Unit = {
    if(canMoveOn.contains(surface))
      println(this.getClass.getName + " moving on " + surface)
    else println(this.getClass.getName +  " cannot move on " + surface )
  }
}
