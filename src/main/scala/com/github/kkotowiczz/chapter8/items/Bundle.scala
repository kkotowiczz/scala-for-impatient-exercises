package com.github.kkotowiczz.chapter8.items

class Bundle(val itemList: List[Item]) extends Item {
  override def price: Double = itemList.foldLeft(0d)((acc, curr) => acc + curr.price)
  override def description: String = itemList.foldLeft("Bundle of: ")((acc, curr) => acc + curr.description + " ").trim
}
