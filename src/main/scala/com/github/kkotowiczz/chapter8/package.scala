package com.github.kkotowiczz

package object chapter8 {
  private var _bankAcc = 0
  def bankAcc = _bankAcc
  def chargeClient(amount: Int) = _bankAcc + amount
}
