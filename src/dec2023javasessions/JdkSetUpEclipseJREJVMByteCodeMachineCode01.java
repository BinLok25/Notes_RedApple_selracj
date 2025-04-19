package dec2023javasessions;

public class JdkSetUpEclipseJREJVMByteCodeMachineCode01 {
	/**
	 * 
	 * 1.Java JDK 11
	 * JDK 15 --> 1 to 15 version
	 * JDK 8 --> 1 to 8
	 * 
	 * JDK : design(coding) + other Tools + Libs + JRE + JVM + Comp
	 * JRE : Java RunTime Env
	 * 
	 * Java Code --> Client Machine --> JRE
	 * 
	 * JDK --> JRE --> JVM
	 * JVM(Java Virtual Machine) -- Platform Dependent -- Mac, Wind, Linux
	 * 
	 * Java Code(Source Code) Test.java --> Compile(Javac) -->Test.class(Byte Code)
	 * --> JVM (OS) --> Machine Code(010101)
	 * 
	 * c/c++ --> source code --> machine code(hardware)
	 * 
	 * Java vs Python/JS -- RunTime lang
	 * java is always faster because of compilation
	 * 1000 LOC -- 80% compiled --> RunTime -- Run(20%)
	 * 
	 * py: no compiler 1000LOC --> RT(100%)
	 * 
	 * Env Setup: JAVA_HOME --> Docker, Jenkins, Maven, CMD --->
	 * to read java from here
	 * 
	 * 2. Eclipse/IntelliJ: Java Editor Tools(IDE)
	 * JDK --> Eclipse
	 * 
	 * compilation : .java to .class
	 * decompilation: .class to .java
	 * so java performance is much better than py/JS
	 * 
	 * 2.Selenium --- JDK 11
	 * 
	 * IQ] what is the diff between src code, machine code, byte code??
	 * the .java and .class files are platform independent
	 * BUT the machine code is platform dependent
	 * 
	 * JRE -- will behave like interpreter
	 * 
	 * IQ] what is JIT ?? Just in time  -- is available at JRE level
	 * this jit will improve the performance ==> verifies the byte code
	 * 
	 * Class Loader: will load the class in the memory and from there the verification
	 * will start
	 * jit -- has no role during compile time 
	 * 
	 * how to install jdk??
	 * Google search: jdk 11 download
	 * jdk 1.1 / 11 both same
	 * ---based on the OS of your machine -- download the appropriate
	 * and install
	 * 
	 * if u have multiple jdks on ur system -- open the appropriate jdk -- open
	 * the bin 
	 * Goto Advance system vars -- open Env vars
	 * user vars + system vars} 2 types of vars
	 * go to system vars -- new -- JAVA_HOME -- and in the value paste the path until
	 * the bin folder of the jdk then click ok to be DONE then scroll down to the path
	 * var -- click EDIT
	 * 
	 * 2. go to the path vars
	 * click on path 
	 * on the path var - new -> whatever var you have created - write like this
	 * %JAVA_HOME%\bin
	 * click ok
	 * 
	 * close the cmd prompt -- re open -- to chk - type - java --version
	 * 
	 * 
	 */

}
