package com.github.kkotowiczz.chapter9

import java.io.File

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
  reversed.foreach(print)
  sourceFile.close()
}
