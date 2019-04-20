import java.util

import scala.collection.immutable.{HashMap, SortedMap}
import scala.io.Source
import scala.collection.JavaConverters._


// Exercise 1:   Set up a map of prices for a number of gizmos that you covet. Then produce
// a second map with the same keys and the prices at a 10 percent discount.
val gizmos = Map("Nintendo Switch" -> 1399, "XBOX" -> 1199, "Playstation 4" -> 1799)
val discountedGizmos = for ((k, v) <- gizmos) yield (k, v - (v * 0.1))
discountedGizmos.foreach(println)

// Exercise 2 & 3: Write a program that reads words from a file. Use a mutable map to count
//  how often each word appears. To read the words, simply use a java.util.Scanner:
// Repeat the preceding exercise with an immutable map.
val filePath = "./txt/srcfile.txt"
val fileSource = Source.fromFile(filePath)
val fileContent = fileSource.getLines

val wordsCountHashMap = fileContent.flatMap(_.split("\\W+"))
    .foldLeft(Map.empty[String, Int]) {
      (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
    }

//wordsCountHashMap.foreach(println)

// Exercise 4: Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.

val wordsCountSortedMap = SortedMap[String, Int]() ++ wordsCountHashMap

//wordsCountSortedMap.foreach(println)

// Exercise 5: Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
val treeMap = new util.TreeMap[String, Int]()
treeMap.putAll(wordsCountHashMap.asInstanceOf[HashMap[String, Int]].asJava)
treeMap.forEach((key, v) => println(key, v))


fileSource.close