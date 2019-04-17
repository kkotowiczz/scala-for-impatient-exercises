// exercise 1: The signum of a number is 1 if the number is positive, –1 if it is negative, and
// 0 if it is zero. Write a function that computes this value.
def signum(num: Int) = if(num == 0) 0 else if(num > 0) 1 else -1

// exercise 2: What is the value of an empty block expression {} ? What is its type?
println({})
// type of empty block is Unit ()

// exercise 3: Come up with one situation where the assignment x = y = 1 is valid in Scala.
var y = 0
val x: Unit = y = 1
println(x)

// exercise 4: Write a Scala equivalent for the Java loop
//for (int i = 10; i >= 0; i--) System.out.println(i);
for(i <- 10 to 0 by -1) println(i)

// exercise 5: Write a procedure countdown(n: Int) that prints the numbers from n to 0.
def countdown(n: Int) = for(i <- n to 0 by -1) println

countdown(3)
// Write a for loop for computing the product of the Unicode codes of all letters
//   in a string. For example, the product of the characters in "Hello" is 9415087488L .
var uniProd = 1
for(ch <- "Hello") uniProd *= ch
println(uniProd)

// exercise 7: Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps
//             Scaladoc.)
val uniProdFold = "Hello".foldLeft(1)((acc, curr) => acc * curr.toInt)
println(uniProdFold)

//exercise 8: Write a function product(s : String) that computes the product, as described
// in the preceding exercises.
def product(s: String) = s.foldLeft(1)((acc, curr) => acc * curr.toInt)

println(product("Some very veeeeery long string"))

// exercise 9: Make the function of the preceding exercise a recursive function.
def recursiveProduct(s: String): Int = {
    if(s.length == 0) 1
    else s.head.toInt * recursiveProduct(s.tail)
}

println(recursiveProduct("Hello"))

// Write a function that computes x n , where n is an integer. Use the following
//   recursive definition

def xToPow(x: Int, n: Int): Int = {
    if (n == 0) 1
    else if (n < 0) 1 / xToPow(x, n + 1)
    else if (n % 2 == 0) xToPow(x, n / 2) * xToPow(x, n / 2)
    else  x * xToPow(x, n - 1)

}

println(xToPow(-3, 3))
println(xToPow(5, 5))
println(xToPow(6, 3))