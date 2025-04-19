package framework_notes;

public class FrWork1 {
	
	/**
	 * Design: design the folder structure for the frame work with all
	 * the component names
	 * --decide which kind of frame work we are going to implement
	 * --design a HLD => high level design of the framework
	 * 
	 * for maintaining the code properly and to manage the diff components
	 * FW: systmatic way of designing the components/modules which talk/
	 * communicate with each other
	 * --FW will help to debug the code to find the problem
	 * --it helps to optimize the code 
	 * 
	 * POM: says that for every page - there should be a respective pageclass
	 * .java file should be there --> a PAGE LAYER 
	 * ADVANTAGES:
	 * ---helps in the maintainence of code =>
	 * segregation of different pages/ classes for easy maintainence of
	 * code is possible 
	 * issues can be easily found and could also be fixed
	 * these pages are classic examples of ENCAPSULATION => private vars-
	 * private By locators
	 * 
	 * DRIVER FACTORY: which has a driver class which contains the methods
	 * to initialize the browser and return the driver -- the session of
	 * which is maintained through out the test scenario once initialized
	 * --which also has a method to initialize the properties file and
	 * access the key...values 
	 * this driver is again supplied to @BeforeTest annotation where all
	 * the pre-conditions for the tc is set up
	 * 
	 * TEST LAYER :
	 * which has different test classes to test each class components
	 * 
	 * accessed by public page methods
	 * 
	 * 
	 * TEST DATA: is maintained in the excel file using 3rd pary library
	 * apache poi
	 * also DATA PROVIDER is also used 
	 * 
	 * TEST RUNNERS: cannot run each tc individually -- so a single testng
	 * .xml file is created to run test suite containing many tc's we can
	 * also run the tc's parallely using @parallel
	 * 
	 * REPORTS:
	 * for logs we use log4j
	 * integrate powerful reports using allure, extent -- to customize
	 * with screen shorts -- using LISTENERS
	 * RETRY logic can also be implemented using testng
	 * ---THE ENTIRE PROJECT IS MAVEN--THE MOST ADVANTAGE OF WHICH IS
	 * pom.xml
	 * ------so as to have to maintain the versions of dependencies easily
	 * have the advantage of MAVEN life cycle=>compile, package and also
	 * deploy
	 * 
	 * EXECUTION: is happening only in the local 
	 * DEVOPS: comes into pic since the tc's/frame work is going to be
	 * merged on to the remote repo on to GITHUB -- from where the code
	 * is going to be picked by the JENKINS SERVER to run individual jobs
	 * --to trigger tc's 
	 * -- to create pipelines as well
	 * JENKINS: is a common server at the enterprise/org level- so not a good
	 * practice to run automation on the jenkins server
	 * --the tc's should be run on some remote/diff machine -- could be a
	 * docker image running on some remote/cloud
	 * 
	 */

}
