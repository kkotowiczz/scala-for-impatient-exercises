package com.github.kkotowiczz.chapter8

import com.github.kkotowiczz.chapter8.items.{Bundle, SimpleItem}

object chapter8 extends App {
  val si = new SimpleItem(356.12, "some item")

  println(si.description)

  val item1 = new SimpleItem(23.3, "some other Item")

  val bundle = new Bundle(si :: item1 :: Nil)

  println(bundle.price, bundle.description)
}
