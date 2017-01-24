/*
Write a function that concatenates a list of lists into a single list. Its runtime should be linear in the total length of all lists. The signature of the method should be:
def concateList[A](l1:List[A],l2:List[A]):List[A]
(Note: You can use Pattern matching over lists to implement the method. But, do not use any provided methods as solutions)
*/

class Source {
  //Concatenating Lists Using foldRight
  def concatenateList(l1: List[Any], l2: List[Any]): List[Any] = {
    val l = l1.foldRight(l2)(_ :: _)
    l
  }

  //Concatenating Lists Using Pattern Matching
  def concateList(l1: List[Any], l2: List[Any]): List[Any] = {
    l1 match {
      case Nil => l2
      case x :: Nil => x :: l2
      case x :: xs => x :: concateList(xs, l2)
    }
  }
}

object ListConcatenator {
  def main(args: Array[String]) {
    val srcList1 = List(1, 2, 3, 4)
    val srcList2 = List("a", "b", "c", "d")
    val s = new Source()
    val finalList = s.concatenateList(srcList1, srcList2)
    println("The Final Concatenated List is: " + finalList)
    val finalList2 = s.concateList(srcList1, srcList2)
    println("The Final List is: " + finalList2)
  }
}

