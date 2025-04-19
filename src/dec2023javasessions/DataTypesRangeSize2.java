package dec2023javasessions;

public class DataTypesRangeSize2 {
	
	/**
	 * 
	 * JAVA dataTypes ---- primitive AND nonprimitive
	 * primitive ----boolean(1bit),   NUMERIC
	 *   boolean -- true/false
	 *     Numeric ---- char(2bytes) and Integral
	 *     Integral -- integer and floating-point
	 *     Integer -- byte(1byte), short(2bytes), int(4bytes), long(8bytes)
	 *     floating-point -- float(4bytes) and double(8bytes)
	 * 
	 * 
	 * the space taken in the memory by vars: Auxiliary space
	 * -------------------------------
	 * memory management(what var should be created of what type) is very imp
	 * =========================>>
	 * byte: used cases--age,months, week days
	 * no.of months,no.of days in a week, suitable for age var since age can be within 125 years-if int is taken
	 * memory is wasted-we are habitual of using int all the time
	 * 
	 * short: used cases
	 * 
	 * int: used cases 
	 * bill amount, pricing information in an e-commerce appn
	 * 
	 * long: used cases
	 * population of world, random no generation, distance between two solar planets
	 * no of hair on the scalp, no. of covid cases in the world, ecomm website users
	 * med equipment ranges
	 * 
	 * ssn, aadhar, ph,bank card no.s, --should not be stored in long no.s since they
	 * just waste the memory since we do not do any numeric calculations with these no.s
	 * it is just for storing purpose -- so better to store as a String data type AS
	 * Strings take dynamic memory allocation inside the Heap memory
	 * 
	 * RAM: hardware - ram is always dynamic memory
	 * ROM: installing software- is rom memory
	 * 
	 * can we increase the java memory??yes with flags xmx, ...
	 * 
	 * float: use cases
	 * pricing info, pi value, rating, temp, weight, some tax info
	 * 
	 * double: use cases
	 * build no, 
	 * 
	 * boolean: used cases
	 * conditional checks-is active?,
	 * 
	 * java: strict data type concept==>store the respective type vars in the
	 * respective container type
	 * 
	 * data types: at top level
	 * --------primitive and non-primitive
	 * primitive
	 * -------> boolean, Numeric,character
	 * -------->>Numeric --->Integral, floating point
	 * ---------->>>Integral - byte, short, int, long
	 * -------------->>>floating -- float,double
	 * 
	 * 
	 * 
	 * 1.primitive data types:no need to create the object==>so not 100% object oriented
	 *  1.a.A. boolean type: true/false
	 *    size: ~1 bit
	 *    range: no range for boolean
	 *    true/false: pre-defined words in java, BUT not the key words but called literals
	 *    
	 *    boolean flag = true;
	 *    boolean pop = false
	 *  1.a.B.Numeric Type:
	 *    Integral
	 *       1.a.B.i)Integer: byte, short, int, long
	 *       byte:
	 *         size: 1byte = 8 bits
	 *         range: -128 to 127-- -2^7 to 2^7-1
	 *         how to declare a byte var?
	 *         byte b = 10;
	 *         byte b=22;errs since duplicate vars not allowed in java
	 *         b= 22; is allowed assigns new value to the already declared var
	 *         
	 *      short:
	 *        size: 2 bytes = 2x8=16 bits
	 *        range: -32768 to 32767-- -2^15 to 2^15-1
	 *        
	 *        short s1 = 1000;
	 *        short s2 = 1;
	 *        
	 *     int:
	 *       size: 4 bytes = 4x8=32 bits
	 *       range: -2147483648 to 2147483647 -- -2^31 to 2^31-1
	 *       
	 *       int i = 10;
	 *       
	 *     long:
	 *       size: 8 bytes = 8x8 = 64 bits
	 *       range: -2^63 to 2^63-1
	 *       
	 *       long l = 100029292;
	 *       long l1 = 9898555558; will err need to append with L
	 *       
	 *       yellow warning: if vars are created and not being used
	 *       
	 *  1.a.B.ii)under Integral-second type-floating type:float, double
	 *  ----------------->>     
	 *    float:
	 *    size: 4bytes = 32 bits
	 *    range: after ., can take upto 7 digits
	 *    
	 *     
	 *    double:
	 *    size: 8 bytes = 64 bits
	 *    range: after ., can take upto 15 digits
	 *       
	 *        
	 *       
	 *       1.a.B.ii)floating-point: float, double ==> point values
	 *       we have to explicitly say it is float/double soo append with f/d
	 *       
	 *       float:
	 *        size: 4 bytes = 32 bits
	 *        range: after ., can take up to 7 digits
	 *        
	 *        float f1 = 10.33f;
	 *        system.out.println(f1);
	 *        
	 *        float f2 = 45.55; errs since f is not appended-compiler does not
	 *        know what kind of point value no it is
	 *        
	 *        float f3 = 100;
	 *        system.out.println(f3); outputs: 100.0
	 *        
	 *       double:
	 *         size: 8 bytes = 64 bits
	 *         range: after . can take up to 15 digits
	 *         
	 *         double d1 = 12.3333;
	 *         double buildNo = 1.1; can be stored in float type to save memory
	 * 
	 * 
	 *     Character type: since coming from Number family - stored internally as 
	 *     a number
	 *     unicode --->>> ASCII values
	 *     only and only single digit value-coming under numeric
	 *     family so stored as ascii values
	 *     mathematical calculations of char vars happen on their ascii values***
	 *     DEFAULT value: of char data type is SPACE
	 *     size: 2 bytes = 16 bits
	 *     range: a-z(97 to 122) and A-Z(65 to 90), 0-9(48 to 57),
	 *       how to declare?? 
	 *       char c = 'a';
	 *       char c1 = '1';
	 *       char c2 = '$';
	 *       
	 *       char n1 = 'a';
	 *       char n2 = 'b'
	 *       system.out.println(n1+n2);
	 * 
	 *     unicode: ASCII values
	 * 2.non-primitive data types: String, Class, Interfaces, Arrays, Object
	 * 
	 * 
	 * 
	 * JAVA: not 100 % obj oriented - since programming can be done using primitive
	 * data types which are not objects
	 * 
	 */

}
