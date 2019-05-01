package com.github.kkotowiczz.chapter10.vehicles
import com.github.kkotowiczz.chapter10.surfaces.Surface

class Car(override val canMoveOn: List[Surface], override val isOn: Boolean) extends EngineVehicle {}
