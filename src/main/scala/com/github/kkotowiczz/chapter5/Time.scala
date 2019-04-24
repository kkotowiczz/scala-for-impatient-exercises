package com.github.kkotowiczz.chapter5

class Time(val hours: Int, val mins: Int) {
  private val minsSinceMidnight = hours * 60 + mins

  def before(other: Time) = minsSinceMidnight < other.minsSinceMidnight
}
