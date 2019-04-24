package com.github.kkotowiczz.chapter5

import scala.beans.BeanProperty

class Student(@BeanProperty var id: Long,
              @BeanProperty var name: String) {
  override def toString: String = s"Student[$id:$name]"
}
