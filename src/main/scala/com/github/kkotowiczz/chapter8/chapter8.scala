package com.github.kkotowiczz.chapter8

import com.github.kkotowiczz.chapter8.items.SimpleItem

object chapter8 extends App {
  val si = new SimpleItem(356.12, "some item")

  println(si.description)
}
