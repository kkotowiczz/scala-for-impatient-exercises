package com.github.kkotowiczz.chapter10.vehicles

import com.github.kkotowiczz.chapter10.surfaces.Surface

trait Moving {
  def move(surface: Surface): Unit
}
