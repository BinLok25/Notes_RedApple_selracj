package dec2023javasessions;

public class StringDataTypeConcatCharTypeCastingNarrWide03 {
	/**
	 * 
	 * only characters have ascii value NOT Strings
	 * 
	 * Strings can be concatenated with any type of DATA
	 * 
	 * When two chars added -- it adds up their ascii values
	 * 
	 * ascii value of space==>' ' is 32
	 * 
	 * ascii values considered only if both vars are chars(only for addition of chars)
	 * => in between single quotes
	 * ' '+ ' '
	 * 
	 * String: is a non-primitive data type, is a class,is a collection
	 * of multiple characters - space is also a kind of special character
	 * and is considered
	 * how to declare a String?? in double quotes
	 * 
	 * String x = "hello"//hashcode -- bytes and bits=>some space inside the memory
	 * 
	 * ==> is a collection of multiple characters
	 * when 2 no.s added--a mathematical operation happens and a result will be a no
	 * when 2 strings added--concatenation of two strings happens and result will be a
	 * String
	 * 
	 * + : acts as an arithmetic operator when it is adding two ints
	 * + : acts as a concat operator when adding two Strings
	 * 
	 * whenever addition of chars happens-it will start taking its ascii values
	 * WHERE AS
	 * for a String -- have no ascii values
	 * 
	 * BODMAS : rule we follow in mathematics is followed with mathematical addition in
	 * java
	 * 
	 * CASTING:
	 * whenever ur  adding 2 bytes -- java is smart enough to say that the resultant var 
	 * should be stored in a higher 
	 * range var==> big brother of byte==> int
	 * 
	 * PRE DEFINED: in java
	 * whenever u r adding 2 bytes-add the resultant not in the immediate big var(short)
	 * BUT even in BIGGER var int
	 * either int, long as well 
	 * 
	 * java gave the limit only for byte and short==> byte + byte neeeds to be stored in
	 * int var
	 * short + short --needs to be stored in int
	 * 
	 * byte - byte should be stored in int only--same logic is applied eventhough
	 * a byte type - byte type will be definitely a byte BUT in order that it should
	 * be easier for java to manage--the same logic applied here
	 * 
	 * BUT int is such a big range(-2147483648 to 2147483647):holds int + int -- holds in int var
	 * since java has to limit somewhere so as to do memory management
	 * 
	 * range: -128 to 127
	 * byte a = 100;
	 * byte b = 110;
	 * 
	 * byte c = a+b; //is 210 within range BUT still errs
	 * 
	 * WIDENING:
	 * small data types can be stored in bigger data types
	 * 
	 * NARROWING: explicit type casting: not recommended
	 * big no. stored in small data type--
	 * can be done with casting BUT will loose some data
	 * 
	 * DOUBLE CASTING:
	 * 
	 * 
	 * 
	 */
	/*
	 * when dividing if the denominator is int -- the output picks only the int part
	 * e.g: 9/2 = 4.5 -->4
	 * if the denominator is float -- then the output will be a floating point no
	 * 
	 * java will chk if either the Nr or Dr is a decimal point no -- then the result
	 * will be in decimal point no
	 * 
	 * num/0 ---> give AE -- Arithmetic Exception
	 * num % 0 ---> AE
	 * 
	 * 0/9 --- 0
	 * 
	 * pure no. int/0 always gives AE BUT
	 * a decimal no(f/double)/0 --- infinity
	 * 
	 * a decimal no(f/double)/0.0  -- Infinity
	 * 
	 * JAVA: handles divide by 0.0 OR decimal no/0.0 differently
	 * 
	 * 0.0/0.0 --NaN - Not a number
	 * 
	 * when dividing both the numbers are pure ints then result is infinity
	 * 
	 * if one Of them are either of them is in decimal -- then result is NaN
	 * 
	 * ESCAPING: escaping the character ==> put extra back slashes before and after
	 * the word which needs to be put in between double quotes
	 * for SINGLE quote --Escape character not needed
	 * 
	 */
}
