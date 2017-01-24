/*Write a function that splits a list elements into a pair of lists on the basis of given boolean function. The signature of the method should be:
def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])
(Note: Do not use method filter provided in the library)
*/
class SplitList {

  //Boolean Function
  def isDivisibleByTwo(element:Int):Boolean = {
    if(element%2==0) true else false
  }

  //Function to split list
  def splitList2(srcList:List[Int],f:Int=>Boolean):(List[Int],List[Int]) = {
    val resListTuple = srcList.partition(f)
    resListTuple
  }

  def splitList(srcList:List[Int],f:Int=>Boolean):(List[Int],List[Int]) ={
    (for(l<-srcList if f(l)) yield l, for(l1<-srcList if(!f(l1))) yield l1)
  }
}

object ListSpliter {
  def main(args: Array[String]) {
    val sp = new SplitList()
    val srcList = List(1,2,3,4,5,6,7,8,9,10)
    val finalResListTuple = sp.splitList2(srcList,sp.isDivisibleByTwo(_))
    val resListTuple = sp.splitList(srcList,sp.isDivisibleByTwo(_))
    println("The Final Tuple is: "+finalResListTuple)
    println("The Final Tuple is: "+resListTuple)
  }

}

