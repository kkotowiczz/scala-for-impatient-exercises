package com.github.kkotowiczz.chapter5

class MilitaryTime(private val hours: Int, private val mins: Int) {
  def before(other: MilitaryTime) = {
    hours < other.hours || hours == other.hours && mins < other.mins
  }
}
