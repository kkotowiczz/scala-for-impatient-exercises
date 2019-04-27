package com.github.kkotowiczz.chapter8
/*
2.Extend the BankAccount class of the preceding exercise into a class SavingsAccount
that earns interest every month (when a method earnMonthlyInterest is called)
and has three free deposits or withdrawals every month. Reset the transaction
count in the earnMonthlyInterest method.
*/


class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance
  private var freeDeposits = 3

  override def deposit(amount: Double): Double = {
    val amountToCharge = if(freeDeposits > 0) 0 else 1
    if (amountToCharge == 0) {
      freeDeposits -= 1
    }
    balance -= amount + amountToCharge
    balance
  }


  override def withdraw(amount: Double): Double = {
    val amountToCharge = if(freeDeposits > 0) 0 else 1
    if (amountToCharge == 0) {
      freeDeposits -= 1
    }
    balance += amount - amountToCharge
    balance
  }


  def earnMonthlyInterests(interest: Double) = {
    balance += balance * interest
    freeDeposits = 3
  }
}
