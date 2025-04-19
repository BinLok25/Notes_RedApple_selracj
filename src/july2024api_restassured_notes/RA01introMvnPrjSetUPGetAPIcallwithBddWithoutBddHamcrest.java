package july2024api_restassured_notes;

public class RA01introMvnPrjSetUPGetAPIcallwithBddWithoutBddHamcrest {
	
	/**
	 * Rest Assured -- core features
	 * 
	 * --open source/free
	 * --java DSL
	 * 
	 * --JDK : httpclient to call the Rest API
	 * ---java has provided httpclient so as to be used to interact with browser
	 * over the network thru api calls(CRUD)
	 * 
	 * they created a wrapper on top of http client - the lib on top of http
	 * client is called REST AsSured
	 * RA: is a pure DSL(domain specific lang) written in java on top of http client
	 * 
	 * the below are wrapper http libs on top of java
	 * --REST ASSured
	 * --OKHttpClient
	 * --JerseyClient
	 * =======================>
	 * 1.REQUest
	 *  ---GET/POST/PUT/DELETE
	 *  ---URI: baseUrl + /endpoint + QueryParams
	 *  ---Headers
	 *  ---Request Body/Payload
	 *  ---Auth: OAuth1,2, JWT, BearerToken, API keys, Basic Auth
	 * 
	 * 
	 * 
	 * 2.Response: 
	 *   ---Status
	 *   ---StatusLine
	 *   ---Body: JsonPath, XMLPath, 
	 *   ---Headers
	 *   ---Cookies
	 *  =====================
	 *  Maven     prj
	 *  RestAssured LIb: pom.xml 
	 *  TestNG    integration for validations
	 *  do not need parallel execution -- only sequential exec of tc's
	 *  ======================
	 *  Eclipse/Intellij
	 * 
	 * 	UI(Se) + API(RA) ==> single
	 * 
	 * Rest Assured:
	 * 
	 * 1. BDD style
	 * given
	 * when
	 * then
	 * 
	 * 2. Non BDD style
	 * 
	 * need to create a client 
	 * 
	 * Employee class
	 * {
	 *   static m1(){}
	 *   
	 *   m2(){}
	 *   
	 *   main(){
	 *   	Employee.m1();
	 *   	Employee obj = new Employee();
	 *   	obj.m2();
	 *   }
	 *  }
	 *   
	 *   //
	 *   hamcrest lib --> RestAssured
	 *   Matchers
	 *   size -- 20
	 *   
	 *   $ -- top node => root of the json
	 *   
	 *   for API testing automation -- not a good idea to use cucumber=>BAD APPROACH
	 *   the 3 amigos are not together to write the feature file
	 *   industry practice: uri ends with .com and endpoint starts with /products
	 * 
	 */

}
