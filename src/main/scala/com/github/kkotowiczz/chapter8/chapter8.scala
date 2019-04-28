package com.github.kkotowiczz.chapter8

import com.github.kkotowiczz.chapter8.items.{Bundle, SimpleItem}
import com.github.kkotowiczz.chapter8.points.LabeledPoint

object chapter8 extends App {
  val si = new SimpleItem(356.12, "some item")

  println(si.description)

  val item1 = new SimpleItem(23.3, "some other Item")

  val bundle = new Bundle(si :: item1 :: Nil)

  println(bundle.price, bundle.description)

  val lPoint = new LabeledPoint("Black Thursday", 1929L, 230.07)
}
