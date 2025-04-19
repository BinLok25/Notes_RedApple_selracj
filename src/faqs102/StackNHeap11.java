package faqs102;

public class StackNHeap11 {
	/**
	 * 
	 * OVERALL JRE ARCHITECTURE: JAVA MEMORY MANAGEMENT
	 * =========================>>>
	 * 
	 * JAVA HEAP MEMORY: stores 
	 *  //1.stores objs
	 *  //2.JRE Classes
	 *  //3.GC runs on heap memory, only to free some memory by destroying some objs
	 *  which donot have any reference
	 *  
	 *  STACK MEMORY: Java Stack memory - it is used for execution of a thread
	 *  contains method specific values => all local vars,refs of the objs - on the 
	 *  basis of LIFO(last in first out) concept
	 *  
	 *  Stack Memory size is very less as compared to HEAP Memory
	 * 
	 * Everything is about memory - objs, classes, vars, 
	 * Heap: is divided into 2 parts - YoungGeneration and OldGeneration
	 * all the class objs stored in YG - the first time created
	 * YG -- 3 parts -- Eden, Survivormemory0, Survivormemory1
	 * 
	 * new objs always stored in Eden memory - once full - garbage collection mechanism
	 * called minorGC will be performed automatically => will shift all objs/survivorObjs to S0, S1
	 * survivor memories
	 * 
	 * the blank/null ref objs -- will be destroyed when minorGC is called
	 * 
	 * OldGeneration: When S0 and S1 are full -- then java will shift the objs to Old
	 * generation -- when this Old Generation is full -- thats when the GC is called
	 * again -- which is then called MajorGC --> which takes lot of time
	 * 
	 * MajorGC: will effect the performance -- so shud be called occassionally
	 * otherwise performance of app will be DEGRADED
	 * 
	 * Inside Old Generation : there is MemoryPool
	 * MemoryPool: all immutable objs stored here - 
	 * 
	 * 
	 * PermanentGeneration: NOT part of Heap memory and is generated at the runTime
	 *  is another memory -- applications meta data is stored
	 * => meta data of classes, methods, 
	 * Another concept is called methodArea ==> the complete class structure is stored
	 * here ==> all static vars, constants stored here
	 * 
	 * RunTimeConstantPool: is inside the method Area and stores all static, diff const
	 * vars
	 * 
	 */

}
