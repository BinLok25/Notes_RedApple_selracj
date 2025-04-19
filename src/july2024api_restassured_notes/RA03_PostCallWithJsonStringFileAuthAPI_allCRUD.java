package july2024api_restassured_notes;

public class RA03_PostCallWithJsonStringFileAuthAPI_allCRUD {
	/**
	 * 
	 * POST: call creation using RestAssured on eclipse
	 * i) copy the cURL and create the request on postman
	 * ----Based on the headers, body ... provided as per the cURL 
	 * ii) create the TC
	 * --the data body can be supplied 3 ways -- 1) as hardcoded String Body
	 * 2) as JSON File under src/test/resources 3) as a POJO class created under
	 * src/main/java
	 * ---LIMITATION OF A JSON FILE: the email type of data cannot be taken twice - has to
	 * be unique and we have to keep on changing the email each time we execute the TC
	 * -----which is overcome/handled with the usage of POJO class => since POJO follows
	 * ENCAPSULATION --- we supply unique email ids with the help of setter methods
	 * 
	 * use restful booker url for practicing
	 * 
	 * POJo:plain old java object
	 *  is a special class which helps to create the java object for that particular
	 *  class
	 * 
	 *  POJO: follows encapsulation
	 *  a pojo class
	 *  --cannot extend/implement anything(will not have any parent class)
	 *  --private data field(variables)
	 *  --public constructor
	 *  --public getter/setters => methods
	 *  
	 *  in the Test caller class -- create the object of pojo class and pass
	 *  the params in the constructor -- and then supply the same obj reference
	 *  object in the body() of the TC-which is in builder pattern
	 *  
	 *  BUT will not work --- BECAUSE needs a separate dependency to do the serialization =>
	 *  conversion of pojo to json
	 * -----needed an ObjectMapper class -- coming from Jackson databind library-jacksondatabindLib
	 * Specify an object request content that will automatically be serialized to JSON or
	 * XML, and sent with the request. If the object is a primitive or NUMBer the object will
	 * be converted to a string and put in the request body--this works for POST and PUT
	 * requests only. Trying to do this with other https methods will cause an exception
	 * to be thrown
	 * IN the recent RA library - it is not automatically converting the POJO to JSON, RA
	 * is not able to do that -- so here we have to apply the concept of serialization
	 * 
	 * And RA says that in order for this to happen -- there is the need of this OBJECTMaPPer
	 * class -- coming from Jackson lib/api -- fasterxmljackson
	 * 
	 * 
	 * 
	 *  getAuthToken_usingPOJOTest_TC3() is still WIP so TC is not complete
	 * 
	 * google for jackson maven api -- coming from fasterxmljackson api 
	 * ====> get it from mvn repo
	 * 
	 * WORK-FLOW: CRUD
	 * ==============>>>>
	 * i) create the Auth token to be used for all the other calls
	 * ii) create a POST call and grab the id
	 * iii) use this id for the UPDATE/PUT call
	 * iv) use the same id in the DELETE CALL to delete the same record
	 * 
	 * CRUD
	 * ===============>>>>>
	 * tc1:
	 * test: createbooking(POST)
	 * post: bookingid - 123
	 * get: /booking/123: 200
	 * 
	 * tc2:
	 * update a booking:
	 * post: bookingid - 123
	 * get: /booking/123: 200
	 * put: /booking/123: 200
	 * 
	 * tc3:
	 * delete a booking:
	 * post: bookingid - 123
	 * get: /booking/123: 200
	 * delete: /booking/123: 200/401
	 * 
	 * tc4:
	 * get a booking:
	 * post: bookingid - 123
	 * get: /booking/123: 200
	 * 
	 * BEST PRACTICE: never rely on existing data - create data dynamically thru script
	 * create a fresh id then use the same id for all other get, put, delete calls
	 * 
	 * TCs should be always independent of each other
	 * And should follow AAA pattern - arrange, act and assert
	 * 
	 */
	

}
