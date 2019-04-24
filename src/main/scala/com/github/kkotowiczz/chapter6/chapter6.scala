package com.github.kkotowiczz.chapter6

import com.github.kkotowiczz.chapter6.CardSuits.CardSuits

object chapter6 extends App{
  val inchesToCentimeters =  new UnitConversion(2.54)
  println(inchesToCentimeters.convert(213.54))

  val gallonsToLitres = new UnitConversion(0.264172)
  println(gallonsToLitres.convert(3532.21))

  val milesToLitres = new UnitConversion(1.609344)
  println(milesToLitres convert 9.9123)

  val or1 = Origin(1, 5)
  val or2 = Origin(55, 6)

  println(or1, or2)

  println(args.reverse.mkString(" "))

  println(CardSuits.Spade)

  def checkIfRed(cardSuits: CardSuits) = cardSuits.toString == "\u2665" || cardSuits.toString == "\u2666"


  println(checkIfRed(CardSuits.Club))
  println(checkIfRed(CardSuits.Spade))
  println(checkIfRed(CardSuits.Heart))


  println(Rgb.Cyan)
}
