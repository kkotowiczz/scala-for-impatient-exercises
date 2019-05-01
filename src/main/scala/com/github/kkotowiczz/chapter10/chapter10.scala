package com.github.kkotowiczz.chapter10

import com.github.kkotowiczz.chapter10.loggers.CryptoLogger
import com.github.kkotowiczz.chapter10.surfaces.{Grass, Road, Water}
import com.github.kkotowiczz.chapter10.vehicles.{Bicycle, Car}

import scala.collection.BitSet

object chapter10 extends App {
  val op1 = new OrderedPoint(1, 1)
  val op2 = new OrderedPoint(1, 2)
  val op3 = new OrderedPoint(2, 1)
  println(op1 compare(op2))
  println(op2 compare(op3))
  println(op1 compare(op3))

  val bitset = BitSet

  val grass = new Grass()
  val road = new Road()
  val water = new Water()

  val car = new Car(List(grass, road), false)
  val car2 = new Car(List(grass, road), true)

  car.move(grass)
  car2.move(road)
  car2.move(water)

  val bicycle = new Bicycle(List(road, grass))
  bicycle.move(road)
  bicycle.move(water)
}
