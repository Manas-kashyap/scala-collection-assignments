package com.knoldus

class SumMul {
  def multiplyElements(list: List[Int]): Int = {
    list.foldLeft(1) { (result, elements) => elements * result
    }

  }

  def addElements(list: List[Int]): Int = {
    list.foldLeft(0) { (result, elements) => elements + result
    }
  }
}
