/*
Compute the length of a list using method foldRight. The signature of the method should be:
def length[A](l: List[A]): Int
(Note: Do not use length method provided in the scala library)
*/

class SourceList {
  //Calculating the length of List
  def length(srcList: List[Any]): Int = {
    val l = srcList.foldRight(0)((_, x) => x + 1)
    l
  }
}

object ListlengthCalculator {
  def main(args: Array[String]) {
    val srcList = List("a", "b", "c", "d")
    val s = new SourceList()
    val listLength = s.length(srcList)
    println(s"The Length of the List is: $listLength")
  }

}
