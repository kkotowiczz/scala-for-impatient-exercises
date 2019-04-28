package com.github.kkotowiczz.chapter9

import java.io.File
import com.github.kkotowiczz.random

import scala.io.Source

object chapter9 extends App {
/*
  Write a Scala code snippet that reverses the lines in a file (making the last
  line the first one, and so on).
 */

  val filePath = "./txt/srcfile.txt"
  val sourceFile = Source.fromFile(filePath)

  val lines = sourceFile.getLines
  val reversed = lines.foldRight("")((acc, curr) => curr + "\n" + acc)
//  reversed.foreach(print)

  /*
  Write a Scala program that reads a text file containing only floating-point
numbers. Print the sum, average, maximum, and minimum of the numbers
in the file
   */

  val ss = Source.fromFile(filePath)
  val secondSource = ss.getLines()
  val wordsLongerThan12 = secondSource.flatMap(_.split("\\s")).filter(_.length > 12)
//  wordsLongerThan12.foreach(println)
  sourceFile.close()
  ss.close()

  // write file with random number of doubles

  def writeDoubleToFile(): Unit = {
    import java.io._
    val printWriter = new PrintWriter(new File("./txt/Doubles.txt"))
    println(random.nextInt)
    val range = random.nextInt / 10000
    val doubles = for {
      i <- 0 to range
      next = Math.random() * range
    } yield next
    printWriter.write(doubles.mkString("\n"))
    printWriter.close()
  }

  writeDoubleToFile()

//  Write a Scala program that reads a text file containing only floating-point
//  numbers. Print the sum, average, maximum, and minimum of the numbers
//  in the file.

  val doubleFileSource = Source.fromFile("./txt/Doubles.txt")
  val doublesLines = doubleFileSource.getLines
  val doubleList = doublesLines.map(_.toDouble).toList
  val sum = doubleList.sum
  val avg = sum / doubleList.size
  val max = doubleList.max
  val min = doubleList.min

  println("sum" -> sum, "avg" -> avg, "min" -> min, "max" -> max)


  /*
    Write a Scala program that writes the powers of 2 and their reciprocals to a
    chapfile, with the exponent ranging from 0 to 20. Line up the columns:

   */

  def writePowersAndReciprocals(): Unit = {
    import java.io._
    val printWriter = new PrintWriter(new File("./txt/powers.txt"))
    val powersAndReciprocals = for {
      i <- 0 to 20
      pow = Math.pow(2, i)
    } yield (pow, 1 / pow )
    val pnrString = powersAndReciprocals.map(pnr => pnr._1.toInt + " " * (15 - pnr._1.toString.length)  + pnr._2)
    printWriter.write(pnrString.mkString("\n"))
    printWriter.close()
  }
  writePowersAndReciprocals()

  /*
  Write a Scala program that reads a text file and prints all tokens in the file
  that are not floating-point numbers. Use a regular expression.
   */

  // TODO


  /*
  Write a Scala program that prints the src attributes of all img tags of a web
  page. Use regular expressions and groups.
   */
  def getHtmlFile(url: String) = {
    val html = Source.fromURL(url)
    html.mkString("")
  }

  val htmlFile = getHtmlFile("https://dorzeczy.pl/")
  val imagePattern = """src=([\w\W]+?)""""
  val imgs = for {
    line <- htmlFile.split(" ")
    if(line.matches(imagePattern))
  } yield line

  imgs.foreach(println)

}
