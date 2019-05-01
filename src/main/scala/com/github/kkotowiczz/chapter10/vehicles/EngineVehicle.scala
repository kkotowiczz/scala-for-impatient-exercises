package com.github.kkotowiczz.chapter10.vehicles

import com.github.kkotowiczz.chapter10.surfaces.Surface

trait EngineVehicle extends Vehicle {
  val isOn: Boolean

  override def move(surface: Surface): Unit = {
    println("Engine is on " + isOn)
    super.move(surface)
  }
}
