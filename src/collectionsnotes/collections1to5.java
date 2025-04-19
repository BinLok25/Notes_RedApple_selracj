package collectionsnotes;

public class collections1to5 {
	
	/*
	 * iterable: top interface
	 * collections: another interface below iterable which extends iterable
	 * -----under collections interface there are 3 other interfaces which extends
	 * collections interface--list, Queue, Set
	 * 
	 * List: there are 4 classes under the list interface-amongst which 3
	 * (ArrayList, LinkedList, Vector) directly
	 * implement List, Stack is a class which extends Vector class and indirectly
	 * implements List interface
	 * Linked list: is a class which implements both List and Dequeue interfaces
	 * 
	 * Queue: is an interface - under which there is another interface Dequeue
	 * Priority Queue is a class which implements Queue
	 * ArrayDeque is a class which implements Dequeue
	 * 
	 * Set: is an interface under which there are two classes-- HashSet, LinkedHashset
	 * which implement Set interface.
	 * ---there is one more interface-sorted set that extends Set interface
	 * And it has a class, Treeset that implements the Set interface and is a direct
	 * child of it.
	 * 
	 * ArrayList(2):
	 * 
	 * static array: is an array whose size is fixed
	 * int a[] = new int[5];
	 * ==> there are only 5 eles--whose indices are 0 1 2 3 4
	 * 
	 * once defined it is fixed and more eles cannot be added
	 * if you try to add more eles --throws indexOutOfBounds exception
	 * 
	 * to overcome this disadvantage of having fixed size and also same type
	 * of eles can be there in one particular type of array
	 * ----------ArrayList concept came into being
	 * ArrayList is a dynamic array==> size can be elastic, and the multiple types
	 * of data can be held in one array

	 * Array: Static 
	 * ArrayList: dynamic, implements List interface, stores values on the basis
	 * of index, is not synchronized==> multiple threads can attack at the sametime
	 * 
	 * ArrayList: can be generic Or non-generic
	 * after jdk 1.5 the concept of generic came into being-where it can be mentioned
	 * what type of data goes into the array list
	 * 
	 * if it is non-generic, any type of data can be stored in the arraylist
	 * =>can store both primitive(int, boolean, double,...) and non-primitive(objects) datatypes
	 * 
	 * ==> is raw meaning generics not defined AND SO YELLOW LINE WARNING
	 * How to define generics--in angular brackets-mention the datatype to be stored
	 * --NOW YELLOW LINE DISAPPEARS
	 * 
	 * before jdk 1.5 generics were not defined
	 * Now since it is defined--any type of data can be stored
	 * 
	 * if not sure what type of data u r going to store--then pass E inside the angular
	 * brackets
	 * 
	 * User defined Objects/classes can be stored inside the generics as well
	 * --create the user defined object class inside the same pkg
	 * --create the test class in the same pkg
	 * --initialize the object in the test class
	 * --call the object using reference and do the task whatever you want to do
	 * 
	 * IMP METHODS OF ARRAYLIST:
	 * ------------
	 * addAll();   ---merges two arraylists together
	 * removeAll(); --removes the eles from the combined list
	 * retainAll(); ---retrieves only common eles from the lists
	 * 
	 * LinkedList(3):
	 * ----------------is a class which implements both Dequeue interface and also List
	 * interface.
	 * --is a very special class in terms of pointers, references
	 * --is a special dynamic array which stores the data on the basis of 2 things-
	 * i) is the actual data ii) is the reference 
	 * ---each node in a linked list is divided into 2 parts --data and reference to
	 * the next node--next is pointing to null
	 * each linked list also has a head and tail
	 * which are not nodes BUT just the starting point and ending point
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
