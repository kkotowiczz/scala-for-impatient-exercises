val river = "Mississippi"


//
//val s: Map[Char, List[Int]] = river.foldLeft(Map.empty[Char, List[Int]]) {
//  (acc, curr) => if(!acc.isDefinedAt(curr)) Map(curr -> List(river.indexOf(curr))) else Map('w' -> List(1))
//}
//s.foreach(println)

def makeString(list: List[String], sep: String): String = list.reduceLeft((acc, curr) => acc  + sep  + curr)

println(makeString(List("a", "b", "c", "d"), "\n"))

def reducer1(lst: List[Int]) = (lst :\ List[Int]())(_ +: _)
def reducer2(lst: List[Int]) = (List[Int]() /: lst)(_ :+ _)
def reducerReversing(lst: List[Int]) = (List[Int]() /: lst)((curr, acc) => acc +: curr)


println(reducer1(List(1, 3, 5, 6)))
println(reducer2(List(1, 4, 6, 1, 3)))
println(reducerReversing(List(1, 4, 6, 1, 3)))

def columns(list: List[Int], columnsNumber: Int) = {
  val quantityOfArrays = list.length / columnsNumber
  val grouped = list.grouped(quantityOfArrays)
  val aggregated = for {
    i <- 0 to quantityOfArrays
    if(grouped.hasNext)
  } yield grouped.next().toArray
  aggregated.toArray
}
columns(List(1, 2, 3, 4, 5, 6), 3).foreach(println)