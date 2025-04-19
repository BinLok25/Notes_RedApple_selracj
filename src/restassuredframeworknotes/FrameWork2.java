package restassuredframeworknotes;

public class FrameWork2 {
	/*
	 * RECAP: in the last session, created the HLD(high level design) document and
	 * created the folder structure for frame work on eclipse, took the screen shot
	 * of the folder tree view from cmd prompt--to attach in the documents
	 * ------------------------------------
	 * created the maven prj --which has src/main/java, src/test/java, src/test/resources
	 * and created the packages--to write the classes with no testng code in src/main/java
	 * 
	 * for classes with testng code -- created the package tests to contain all the 
	 * testng kind of testcases
	 * 
	 * for all the resource files -- created folder to contain the json files, config folder
	 * to contain all the config.properties files, test runners folder to contain all
	 * the testng.xml files, a separate folder testdata to contain all the testdata
	 * related files
	 * 1)------------------start with writing the code for config.properties file-
	 * since it is the starting point from where the configMgr starts to config Env
	 * LIKE
	 * url,baseUri,tokens for the related Auths[basic, form, digestive, Oauth1.0,
	 * Oauth2.0,JWT....etc==>
	 * for basic--just need username and pwd
	 * for digestive--
	 * for form--
	 * for Oauth1--need apikeys to start with-clientid, clientSecret,then auth-token
	 * -----temporary token, verifier....
	 * for Oauth2--need apikeys+clientid+clientsecret+permanenttoken
	 * -needed for the particular 
	 * ---for Jwt-JWT token=>ALL THESE TOKENS SAVED IN CONFIG.PROPERTIES file
	 * api --TESTCASE CREATION
	 * 
	 *  2) create the configMgr file--to READ the properties from CONFIG.PROPERTIES
	 *  so the configMgr file will be under src/main/java --in a separate pkge-under
	 *  which there is separate class --configMgr
	 *  --create the code for it
	 *  Before this create the config.properties file under src/test/resources in a
	 *  separate folder and write the token data in it--STEP 1 already DONE
	 *  
	 *  IQ]WHICH CLASS IN JAVA IS RESPONSIBLE TO READ THE CONFIG PROPERTIES IN JAVA?
	 *  ----FileInputStream class from java.io Pkg and Properties class from
	 *  java.util Pkg
	 *  
	 *  typical design for creating and reading the properties file:
	 *  ---with the use of a i)STATIC BLOCK--to get executed even before the constructor
	 *  for the class is called
	 *         ii) inside the static Block --write the code to load the file using
	 *         FileInputStream class inside a try---catch block
	 *         
	 *         in the try BLOCK-create the object of input Stream
	 *         in the catch BLOCK-to catch the exception-if the file is not found 
	 *         and also
	 *         USING THE REFLECTION CONCEPT OF JAVA
	 *         --which would find this code ---even when written in src/main/java
	 *         OR even if in any package in the project
	 *         
	 *         the job of REFLECTION Class is to load the class from any where in
	 *         the projects folder STRUCTure
	 *         
	 *         if the properties file is not loaded then since it is non-primitive
	 *         data Type-its default value would be NULL
	 *         
	 *         --So write the code with conditional statements-with cases when
	 *         there is input then load the file and if not throw some custom
	 *         created exception
	 *         
	 *  after the configuration for the TC being read from the Config.properties file
	 *  BY the configMGR 
	 *  --3)
	 *  
	 *  READ THE PROPERTIES WITH THE HELP OF REFLECTION CLASS
	 *  ==================================Imp IQ
	 *  
	 *  4)RESTCLIEnt:
	 *  ============now focus on RestClient where u need to write the code as
	 *  wrapper classes on top of RA raw lib==> all crud methods
	 *  
	 *  next thing it has to do is CRUD OPERATIONS
	 *  
	 *  4) so write the code for all the CRUD operations using the respective methods
	 *  Since RA is a raw library -- write wrapper classes utilities/fns on top of
	 *  the get(), post(), update(), delete() methods inside the same CONFIGMGR class
	 *  ---using the switch statement to switch between the CRUD methods
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
