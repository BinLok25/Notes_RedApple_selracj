package javacollect_notes;

public class JavaCollections1To5 {
	
	/**

	* 1:

	* collections: in Java, is a framework/ready made architecture already available to store

	* group of objects and also to manipulate them without having to write the code for business logic

	* from scratch

	* collections is available in java.util pkge

	*

	* Iterable is the top interface, under which there is this collection interface-under this there

	* are 3 more interfaces-List, Queue and Set

	* List: this interface has these classes-ArrayList, LinkedList, Vector, Stack

	* AL, LList, Vector directly implements List interface-But Stack extends Vector Class which is also

	* a parent class to Stack

	*

	* Queue: interface has one more interface Deque that extends Queue interface

	* Deque-extends Queue interface, also has a child class - ArrayDeque which implements Deque

	* LinkedList-is a child class of List interface--also implements Deque interface

	*

	* Set: this interface has 2 child classes-HashSet,LinkedHashSet-Both directly implement set AND has one more interface,

	* SortedSet-which has a child class underneath called TreeSet that directly implements Sorted Set

	*

	* Framework - to store and to manipulate the groups of objects

	* Operations - Searching, insertion, and Manipulation

	*

	* interfaces:

	* Set, List, Queue, Deque

	*

	* Classes:

	* ArrayList, Vector, LinkedList, HashSet, TreeSet, PriorityQueue

	*

	* 2:

	* ArrayList: is a child class of List interface-implementing it

	* ----is a DynamicArray

	* 1.can contain duplicate values/elements

	* 2.maintains insertion

	* 3.not Synchronized-hence slow

	* 4.allows random access to fetch any ele-as it stores on the basis of index

	*

	* to print all the values from ArrList-use for loop/or can use iterator also

	*

	* Static Arrays: are fixed and not dynamic-so there is this indexOutOfBounds Exception thrown when

	* we try to retrieve any thing out of range from the static Array-as the size is fixed

	*

	* To overcome this disadvantage-Dynamic Arrays concept came into picture

	* ARRAYLIST: is the most popular dynamic array

	*

	* Generics vs Raw:

	* Before jdk 1.5 generics were not defined

	* Generics gives the info about the type of data being inserted into the ArrayList or any other type

	* of collection

	* generics are defined within the angular brackets and

	*

	* if generics were not defined and the collection object is Raw--gives an yellow warning indicating

	* that generics are not defined

	*

	*/

}
