# scala_list_assignment
Compute the length of a list using method foldRight. The signature of the method should

be:

def length[A](l: List[A]): Int

(Note: Do not use length method provided in the scala library)

2. Implement a method hasSubsequence for checking whether a List contains another List as a

subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as

subsequences. The signature of the method should be:

def hasSubsequence[A](list:List[A],sub:List[A]):Boolean

3. Write a function that concatenates a list of lists into a single list. Its runtime should be

linear in the total length of all lists. The signature of the method should be:

def concateList[A](l1:List[A],l2:List[A]):List[A]

(Note: You can use Pattern matching over lists to implement the method. But, do not use

any provided methods as solutions)

4. Write a function that splits a list elements into a pair of lists on the basis of given boolean

function. The signature of the method should be:

def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])

(Note: Do not use method filter provided in the library)
