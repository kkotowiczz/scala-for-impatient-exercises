package com.github.kkotowiczz.chapter6

object Rgb extends Enumeration {
  type Rgb = Value
  val Black = Value(0x000000)
  val Blue = Value(0x0000ff)
  val Green = Value(0x00ff00)
  val Red = Value(0xff0000)
  val Yellow = Value(0xffff00)
  val Cyan = Value(0x00ffff)
  val Magenta = Value(0xff00ff)
  val White = Value(0xffffff)
}
