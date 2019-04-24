package com.github.kkotowiczz.chapter5

class Person2(val fullName: String) {
  private val splitted = fullName.split(" ")
  val firstName = splitted(0)
  val lastName = splitted(1)
}
