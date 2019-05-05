def values(f: Int => Int, low: Int, high: Int) = for(i <- low to high) yield(i, f(i))

println(values(x => x * x, -5, 5))

// How do you get the largest element of an array with reduceLeft ?

val array = Array(1, 70, 30, 213, 381, 41412, 14, 1248, 211, 10, 40)

val max = array.reduceLeft((acc, curr) => if(acc > curr) acc else curr)
println(max)

//Implement the factorial function using to and reduceLeft , without a loop or
//recursion.
def factorial(n: Int) = {
   if(n < 1) 1 else  (1 to n) reduceLeft(_ * _)
 }

println(factorial(5))

def factorialFold(n: Int): Unit ={
  (1 to n).foldLeft(1)(_ * _)
}

def largest(fun: Int => Int, inputs: Seq[Int]) = {
  val max = inputs.maxBy(fun(_))
  fun(max)
}

println(largest(x => 10 * x - x * x, 1 to 10))

def adjustToPair()