package com.github.kkotowiczz.chapter8

/*
1.Extend the following BankAccount class to a CheckingAccount class that charges $1
for every deposit and withdrawal.
class BankAccount(initialBalance: Double) {
private var balance = initialBalance
def currentBalance = balance
def deposit(amount: Double) = { balance += amount; balance }
def withdraw(amount: Double) = { balance -= amount; balance }
}
*/

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var balance = initialBalance
  override def deposit(amount: Double): Double = {
    chargeClient(1)
    balance += amount - 1
    balance
  }


  override def withdraw(amount: Double): Double = {
    chargeClient(1)
    balance -= amount + 1
    balance
  }
}
