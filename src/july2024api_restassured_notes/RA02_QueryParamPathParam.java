package july2024api_restassured_notes;

public class RA02_QueryParamPathParam {
	/**
	 * DATA Provider: to provide path params in RA call/script
	 * 
	 * the return type of Dataprovider is 2 dimensional object Array
	 */
	
	/**
	 * 
	 * how to use DataProvider???
	 * ===========>>>>>>
	 * to parameterize the script with diff sets of data
	 * in actual prj - will be using data provider with testng
	 * using - AtTheRateDataprovider --ANNOTATION
	 * 
	 * Test Case - loginTest(username, password){}
	 * 
	 * we have 5 diff sets of data -- without data provider - we might have
	 * to call the TC with 5 diff data
	 * -----------instead using DATA Provider
	 * we write 
	 * 1)
	 * @Test(dataprovider = 'getData')
	 * TestCase=>public static void loginTest(){}
	 * 
	 * 
	 * 2)we create getData() which has all the data lines=>
	 * @dataprovider //so testng marks this particular fn as the DATAProvider
	 * getData(){
	 * 
	 * 			Data1 - un, pwd
	 * 			Data2
	 * 			Data3
	 * 			Data4
	 * 			Data5
	 * 
	 * 			}
	 * 
	 * 3)we have to write another annotation - so java class gets to know where
	 * exactly-->>the data provider is
	 * 
	 * 
	 * 4) will write one excel file -- testdata.xlx where
	 * all 5 lines of data will be there
	 * 
	 * USING DATA PROVIDER IN REST ASSURED TO SUPPLY THE PATH PARAMS:
	 * ==============>>>>IMP
	 * i) write @DataProvider annotation before the particular @Test-in which
	 * you will be supplying the path params
	 * ii) in the brackets after @Test(dataProvider="methodNameThatProvidesData")
	 * 
	 * 
	 * the return type of DataProvider is a TWO DIMENSIONAL OBJECT ARRAY
	 * 
	 * EXTRACT Method:
	 * 	.extract()
	 * 		.path("error")
	 * ------------->>>is used in the work flow kind of collections where you create a post
	 * call to create a record in the database, and from the response you extract the path
	 * to a specific attribute -- id, userid .... and then you use the same attribute value
	 * in the next Test case
	 * create the user - using POST call, id gets created by the server, fetch the same id, using GET call and
	 * use the same user id to modify the data - using UPDATE call and then in TC DELETE the
	 * same userid ===> completes the total work flow operations of CRUD 
	 * 
	 * WORKFLOW:
	 * create the POST call -- get the userid using GET call -- append the same user id in
	 * the PUT and also in the DELETE  call
	 * 
	 * equalTo: json Object {}
	 * hasItem: json Array []
	 */

}
