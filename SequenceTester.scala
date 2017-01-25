/*
Implement a method hasSubsequence for checking whether a List contains another List as a subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as
subsequences. The signature of the method should be:
def hasSubsequence[A](list:List[A],sub:List[A]):Boolean
*/

class Sequence {
  //method to check if the list conatins a sub list
  def hasSubsequence(srcList: List[Any], subList: List[Any]): Boolean = {
    val hasSequence = srcList.containsSlice(subList)
    hasSequence
  }
}

object SequenceTester {
  def main(args: Array[String]) {
    val l = new Sequence()
    val mainList = List(1, 2, 3, 4)
    val subList = List(2, 3)
    val checkSubsequence = l.hasSubsequence(mainList, subList)
    println(s"$mainList contains $subList: $checkSubsequence")
  }
}

