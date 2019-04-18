import scala.util._

// Exercise 1: Write a code snippet that sets a to an array of n random integers between 0
//               (inclusive) and n (exclusive).

def generateRandomArray(n: Int): Array[Int] = {
    val r = new Random
    val seq = for(i <- 0 to n) yield r.nextInt(n)
    seq.toArray
}

val arr1 = generateRandomArray(35)
arr1.foreach(println)

// Exercise 2: Write a loop that swaps adjacent elements of an array of integers. For example,
//             Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .

val arr2 = Array(1, 2, 3, 4, 5)

for(i <- 0 until arr2.length if i % 2 == 1) { val temp = arr2(i); arr2(i) = arr2(i - 1); arr2(i - 1) = temp }

arr2.foreach(println)
