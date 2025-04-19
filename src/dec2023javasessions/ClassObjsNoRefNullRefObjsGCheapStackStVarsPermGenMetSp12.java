package dec2023javasessions;

public class ClassObjsNoRefNullRefObjsGCheapStackStVarsPermGenMetSp12 {
	/**
	 * 
	 * can we create any obj without any name?? yes without refname
	 * --are called no ref objs-not a good practice- since they occupy
	 * unnecessary space in the memory
	 * 
	 * OBJECT: cannot hold any static property
	 * 
	 * IQ]
	 * 
	 * LOCAL VARS: can be final BUT cannot be STATIC
	 * 
	 * java memory management:
	 * -----------------divided into heap and stack
	 * all objs - stored in heap, the ref names stored in stack memory
	 *  //references -- stored inside the stack memory
	 * each obj - has one copy of class vars - which stored in heap-inside the obj
	 * 
	 * no reference object
	 * ------
	 * new User().name = "Tom";
	 * new User().age = 25;
	 * 
	 * null reference object
	 * -------
	 * User u4 = new User();
	 * u4 = null; //created inside the heap and ref name u4 -- in stack - will break
	 * from the obj and will be pointing to null ==> earthed OR null sign
	 * the obj stays on the heap --- WITHOUT A REF NAME
	 * u4.name = "Naveen"; //null.name -- NullPointerException -- NPE
	 * 
	 * null.anything --> NPE => the ref pointing to null=> u4=null
	 * cannot assign any thing to null objs
	 * 
	 * objects will never overflow -- and fall into stack memory
	 * hence Garbage collector has to enter and free up the space occupied by
	 * null ref objs
	 * 
	 * AutoMechanism in Java/GC: will enter heap memory to destroy the null
	 * reference objects - and frees up the space
	 * --GC is dependent on JVM, which monitors the heap memory and instructs
	 * the GC to free up the space on heap
	 * 
	 *  System.gc(); //this method will call gc -- there is no guarantee that it will
	 *  definitely call
	 *  GC: always dependent on JVM's decision/call
	 *  
	 *  GC: is only for heap memory
	 *  will GC come inside stack?? NO it is designed only for Heap memory
	 * 
	 * single object: can have n/multiple references
	 * one more object with duplicate name cannot be created
	 * 
	 * java will create copies of non-static class vars to be given 1 copy to
	 * each - object on the heap
	 * CMA/permanentGen/MetaSpace: common memory location - is not part of the 
	 * heap where all static
	 * IQ] Diff between Metaspace and perm generation
	 * jdk 1 to 1.7 -the CMA was called perm gen -static memory(fixed)
	 * jdk 1.8 --the CMA was called Metaspace(dynamic)
	 * class vars are stored --are common values for all objects
	 * FINAL: this key word is used to make a value constant/unchangeable by user
	 * STATIC: common vars/values for all objects
	 * 
	 * non-static vars : should be accessed thru object reference
	 * 
	 * 
	 * one obj: can have multiple references
	 * 
	 * 
	 * 
	 * 
	 * STATIC PROPERTIES: of an object -- is the repetitive/same value of a var being repeated for 
	 * all diff obj's
	 * e.g:a company name value, 
	 *  the wheels property of all Cars, the steering wheel -- the same so since this is common value can be 
	 * initialized at the class level itself -- not going to vary for each obj
	 * whereas the other vars values will be diff for each obj
	 * --these static property/vars will be created in the CMA(common memory allocation)
	 * 
	 * CMA(common memory allocation): is a separate memory location also called PERMANENT GENERATION
	 * WHICH GOT RENAMED AGAIN AS META SPACE----->>>>>>>>>
	 * where one common property/var is created to be used by all objs
	 * 
	 * STATIC PROPERTIES: should be accessed thru the class name
	 * 
	 * to make the STATIC PROPERTIES value not to be changed by outsiders -- should be made final
	 * to make it CONSTANT ==> not changeable -- should be declared final
	 * 
	 * once declared final -- ide gives this error mesge 'initialize final field at declaration'
	 * 
	 * //3.can I access the static var using the obj ref name?
		System.out.println(c1.wheels);//yellow warning - should be accessed the common way
		==> NOT THRU THE OBJ REF -- either directly or thru classname
		
		
	 * 
	 * 
	 * IQ] what is the diff between permanent generation and the META SPACE??
	 * ------>>> upto jdk 1 to 1.7 it was called permanent generation which was a static memory
	 * ===> it was fixed storage declared ==> not elastic
	 * --->>there was no feature of GC entering
	 * after jdk 1.8 onwards then PERMANENT GEN -->> was started to be called META SPACE
	 * ======> Which was a major change that it became dynamic memory as well
	 * 
	 * 
	 */

}
