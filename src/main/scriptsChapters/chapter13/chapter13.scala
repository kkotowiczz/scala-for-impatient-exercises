val river = "Mississippi"



val s: Map[Char, List[Int]] = river.foldLeft(Map.empty[Char, List[Int]]) {
  (acc, curr) => if(!acc.isDefinedAt(curr)) Map(curr -> List(river.indexOf(curr))) else Map('w' -> List(1))
}
s.foreach(println)