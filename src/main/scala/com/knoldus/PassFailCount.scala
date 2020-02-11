package com.knoldus

class PassFailCount {
  val studentList = List(Student(1, "Manas"), Student(2, "Muskan"), Student(3, "Sparsh"), Student(4, "Yamini"), Student(5, "Shivani"), Student(6, "Umang"), Student(7, "Krishna"), Student(8, "Abhinav"), Student(9, "Nischal"), Student(10, "Suraj"))
  val marksList = List(Marks(1, 1, 10), Marks(1, 2, 60), Marks(1, 3, 70), Marks(1, 4, 50), Marks(1, 5, 80), Marks(1, 6, 90), Marks(1, 7, 95), Marks(1, 8, 65), Marks(1, 9, 30), Marks(1, 10, 70),
    Marks(2, 1, 50), Marks(2, 2, 89), Marks(2, 3, 99), Marks(2, 4, 22), Marks(2, 5, 66), Marks(2, 6, 30), Marks(2, 7, 100), Marks(2, 8, 54), Marks(2, 9, 56), Marks(2, 10, 100),
    Marks(3, 1, 60), Marks(3, 2, 79), Marks(3, 3, 19), Marks(3, 4, 33), Marks(3, 5, 77), Marks(3, 6, 60), Marks(3, 7, 50), Marks(3, 8, 43), Marks(3, 9, 67), Marks(3, 10, 100),
    Marks(4, 1, 70), Marks(4, 2, 69), Marks(4, 3, 40), Marks(4, 4, 44), Marks(4, 5, 88), Marks(4, 6, 90), Marks(4, 7, 25), Marks(4, 8, 32), Marks(4, 9, 78), Marks(4, 10, 100),
    Marks(5, 1, 80), Marks(5, 2, 59), Marks(5, 3, 22), Marks(5, 4, 55), Marks(5, 5, 11), Marks(5, 6, 12), Marks(5, 7, 12), Marks(5, 8, 21), Marks(5, 9, 89), Marks(5, 10, 100))

  // Returns Pass/Fail Count
  def checkStatus(subjectId: Int, percentage: Double, result: String): String = {
    result.toLowerCase match {
      case "pass" => s"Pass count: ${marksList.flatMap(x => if (x.subId == subjectId && x.marksObtained >= percentage) Some(x) else None).length}"

      case "fail" => s"Fail count: ${marksList.flatMap(x => if (x.subId == subjectId && x.marksObtained < percentage) Some(x) else None).length}"
    }
  }
}

object PassFailCountObject extends App {
  val passFailCount = new PassFailCount
  println(passFailCount.checkStatus(2, 20, "pass"))
}
