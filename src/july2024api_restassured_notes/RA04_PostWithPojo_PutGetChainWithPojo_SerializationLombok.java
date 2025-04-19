package july2024api_restassured_notes;



public class RA04_PostWithPojo_PutGetChainWithPojo_SerializationLombok {
	/*
	 * In the previous class - added the dependency of fasterJacksonxml - data
	 * core library to run the tc with POJO object ---> for serialization of
	 * POJO to Json
	 * BUT still gives the exception -- illegalStateException
	 * ===> so now we are adding the Jackson data bind lib/dependency
	 * 
	 * DataBIND jackson: will help in auto serialization
	 * google search: jackson databind maven lib
	 * do not pick the RC one
	 * REMOVE the jackson-core and add jackson-databind
	 * 
	 * Now RUN the WIP tc
	 * 
	 * TC's : we executed using hardcoded body, using json file, using POJO
	 * -----------using json file is recommended when the data is static
	 * ---for dynamic data body, POJO is recommended
	 * 
	 * pojo --> json: serialization
	 * json --> pojo: de-serialization
	 * jackson - data bind lib -- takes care of both serialization and
	 * de-serialization
	 * ---->>>creating POJO class for this GoRestUser data as below
	 * {
    "name": "Tenali Ramakrishna",
    "gender": "male",
    "email": "ten3.rama@115ce.com",
    "status": "active"
		}
	 * 
	 * BUT then second time the same user email is used -- FAILS
	 * to fix this create a generateRandomEmail() method and append as a PARAM
	 * of the POJO class constructor 
	 * 
	 * use the pojo reference in the caller Test class --->>PROBLEM SOLVED
	 * 
	 * POJO LIMITATIONS: works when data is limited
	 * when variables are limited to 20
	 * 
	 * Becomes complicated when the var exceed to 100
	 * ---NOW TO TAKE CARE OF THIS SITUATION ***LOMBOK*** is used
	 * 
	 * LOMBOK: reduces the boiler plate code -- so many getters/setters
	 * with POJO in case of too many variables
	 * 
	 * whenever we use LOMBOK
	 * ========================>>i)google search for lombok maven dependency-same for wins/mac
	 * add the dependency in pom.xml -- removing the scope<provided> => i want to run it anywhere
	 * ii) download the jar file as well => on mvn repo click on the jar file -- gets downloaded onto
	 * ur system -- then go to the downloads folder from cmd prompt -- write the cmd
	 * java -jar lombokversion.jar 
	 * And ENTER
	 * a pop up win opens where u have to hit install, THEN restart eclipse
	 * lombok will provide annotations ==> asks just for the blue print of the class
	 * => how many vars THEN it will take care of everything
	 * 
	 * lombok -- pom.xml
	 * annotations: @
	 * 
	 * 1. add pom.xml
	 * 2. install a plugin
	 * 
	 * eclipse:
	 * lombok.jar
	 * cmd prompt : run the jar file => java -jar lombok.java
	 * this cmd will interact with the plugin and install it
	 * 
	 * HOW TO CREATE A LOMBOK??
	 * =========================>>>
	 * in order to create the LOMBOk - we have to create the annotations -- have to create the
	 * annotations @
	 * create a user class again -- this time the lombok one=> userLombok.java
	 * just above the userlombok class -- add all these annotations and import
	 * them from lombok.builder
	 * @Data
	 * @NoArgsConstructor
	 * @AllArgsConstructor
	 * @Builder
	 * 
	 * COMPLEX RESPONSE BODY/Json: 
	 * ==========================>>
	 * i) create private vars for the root elements
	 * ii) create a class for the elements which has a child under it
 	 *
	 * As per the response body of the http call on postman -- create
	 * the blue print and also append all the annotations to the 
	 * child classes/subclasses as well on top of the lombok class
	 */

}
