package com.github.kkotowiczz

package object random {
  private var seed = 0
  private val a = 1664525
  private val b = 1013904223
  private val n = 32

  def setSeed(seed: Int) = this.seed = seed

  def nextDouble(): Double = {
    (seed * a + b) % Math.pow(2, n)
  }

  def nextInt(): Int = {
    nextDouble().toInt
  }
}
