package dataproviderddtnotes;

public class DataProviderHowToProvideData {
	
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
	 */

}
