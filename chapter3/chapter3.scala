import scala.collection.mutable.ArrayBuffer
import scala.util._

// Exercise 1: Write a code snippet that sets a to an array of n random integers between 0
//               (inclusive) and n (exclusive).

def generateRandomArray(n: Int): Array[Int] = {
  val r = new Random
  val seq = for(i <- 0 to n) yield r.nextInt(n)
  seq.toArray
}

val arr1 = generateRandomArray(35)
//arr1.foreach(println)

// Exercise 2: Write a loop that swaps adjacent elements of an array of integers. For example,
//             Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .

val arr2 = Array(1, 2, 3, 4, 5)

for(i <- 0 until arr2.length if i % 2 == 1) { val temp = arr2(i); arr2(i) = arr2(i - 1); arr2(i - 1) = temp }

//arr2.foreach(println)

val arr3 = Array(1, 2, 3, 4, 5)

val arr4 = for {
  i <- 0 until arr3.length
  if(i % 2 == 1)
  j <- (i to i - 1 by -1)
} yield arr3(j)

//arr4.foreach(println)
// Exercise 4: Given an array of integers, produce a new array that contains all positive
// values of the original array, in their original order, followed by all values that
// are zero or negative, in their original order.

val ex4Array = Array(-1, 5, -320, 4, 0, -30, -50, 6, 11)

val partitioned = ex4Array.partition(_ > 0)

val combined = partitioned._1 ++ partitioned._2
combined foreach(println)

// Exercise 5: How do you compute the average of an Array[Double]?

val ex5Array = Array(30.42, 15.16, 21.99, 3.61)

val ex5Avg = ex5Array.sum / ex5Array.length.toDouble
println(ex5Avg)

// Exercise 6: How do you rearrange the elements of an Array[Int] so that they appear in
// reverse sorted order? How do you do the same with an ArrayBuffer[Int] ?

val ex6Array = Array(-1, 5, -320, 4, 0, -30, -50, 6, 11).sortWith(_ < _)

var ex6ArrayBuff = ArrayBuffer(-1, 5, -320, 4, 0, -30, -50, 6, 11)
ex6ArrayBuff = ex6ArrayBuff.sortWith(_ < _)
println(ex6ArrayBuff)

// Exercise 7: Write a code snippet that produces all values from an array with duplicates
// removed. (Hint: Look at Scaladoc.)

val ex7Array = Array(33, 12, 791, 33, -123, 581, 64, 12)
ex7Array.distinct.foreach(println)

/*
Exercise 8: Suppose you are given an array buffer of integers and want to remove all but
the first negative number. Here is a sequential solution that sets a flag
when the first negative number is called, then removes all elements beyond.

var first = true
var n = a.length
var i = 0
while (i < n) {
  if (a(i) >= 0) i += 1
  else {
    if (first) { first = false; i += 1 }
    else { a.remove(i); n -= 1 }
  }
}
This is a complex and inefficient solution. Rewrite it in Scala by collecting
positions of the negative elements, dropping the first element, reversing the
sequence, and calling a.remove(i) for each index.
 */


var ex8Array = ArrayBuffer(1, 5, 320, -4, 0, -30, -50, 6, 11)

var indexesToDelete = for {
  i <- ex8Array.indices
  if (ex8Array(i) < 0)
} yield i

indexesToDelete = indexesToDelete.drop(1)
for(i <- indexesToDelete.reverse) ex8Array.remove(i)
ex8Array.foreach(println)

// Exercise 10:  Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs
// that are in America. Strip off the "America/" prefix and sort the result.

val timezones = java.util.TimeZone.getAvailableIDs
val ex10Result = timezones.filter(_.startsWith("America")).map(_.replace("America/", "")).sorted
ex10Result.foreach(println)
