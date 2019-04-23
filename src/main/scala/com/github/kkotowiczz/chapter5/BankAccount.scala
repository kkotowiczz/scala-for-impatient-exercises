package com.github.kkotowiczz.chapter5

// Write a class BankAccount with methods deposit and withdraw , and a read-only
// property balance
class BankAccount {
  private var accBalance = 0
  def withdraw(amount: Int) = {
    accBalance = if(accBalance - amount > 0) accBalance - amount else 0
  }
  def deposit(amount: Int) = {
    accBalance += amount
  }
  def balance = accBalance
}
