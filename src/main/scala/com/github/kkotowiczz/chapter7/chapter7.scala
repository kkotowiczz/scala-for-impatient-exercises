package com.github.kkotowiczz.chapter7

import com.github.kkotowiczz.chapter7.outerPackage.horstmannPackage.{Ex1Sol1, Ex1Sol2}



object chapter7 extends App {
  /* 1.Write an example program to demonstrate that
package com.horstmann.impatient
is not the same as
package com
package horstmann
package impatient

*/
  val ex1_1 = new Ex1Sol1()
  println(ex1_1.ex1Sol1Val)

  val ex1_2 = new Ex1Sol2()
  println(ex1_2.impatient)
  println(ex1_2.horstmann)


 /*
 5.syntax instead of simply letting you add functions and variables to a package?
  What is the meaning of private[com] def giveRaise(rate: Double)? Is it useful?

  This means that method giveRaise is private for com package and all its subpackages
  In case of book package structure com.horstmann.impatient this is not really useful, because it's visible in every class, since com package is root of package structure

  */

  /*
  Write a program that copies all elements from a Java hash map into a Scala
  hash map. Use imports to rename both classes.
  In the preceding exercise, move all imports into the innermost scope possible.
   */

  object Ex06_07 {
    import java.util.{HashMap => JavaHM}
    import scala.collection.{Map => ScalaHM}
    import scala.collection.JavaConverters._

    def javaHashMapToScalaHashMap(javaHM: JavaHM[Int, String]) = {
      javaHM.asScala.toMap
    }
  }

  /*
  8.What is the effect of
import java._
import javax._
Is this a good idea?


  It's not good idea, importing all classes from package can lead to name collision
   */

  /*
    10. Apart from StringBuilder, what other members of java.lang does the scala
    package override?

    All "primitives boxing Class" f.e. Byte, Char, Long etc.
   */



}
