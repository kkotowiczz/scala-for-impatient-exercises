package com.github.kkotowiczz.chapter6

class UnitConversion(val factor: Double) {
  def convert(amount: Double) = amount * factor
}
