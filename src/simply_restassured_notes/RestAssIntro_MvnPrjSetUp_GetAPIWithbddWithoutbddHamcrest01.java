package simply_restassured_notes;



public class RestAssIntro_MvnPrjSetUp_GetAPIWithbddWithoutbddHamcrest01 {
	
	/**
	 * 
	 * Rest Assured -- core features
	 * 
	 * --Open Source/Free
	 * --Java DSL
	 * 
	 * --JDK : http client to call the RestAPI
	 * 
	 * --Rest Assured  //all the 3 are wrapper classes on top of http client
	 * --OKHttpClient
	 * --JerseyClient
	 * 
	 *RA: is open source lib like sel,--freely available
	 *how exactly is RA is hitting diff calls => all CRUD operations??
	 *
	 * 
	 * what is RA? freely available
	 * it is a java DSL(domain specific Lang)
	 * it was difficult to write RA code in java
	 * every jdk has one http client => u can hit ur network calls with http client
	 * ==> this is the core feature of jdk BUT very complex in the sense the methods
	 * are not user friendly in terms of writing the code, not readable, very complex 
	 * in terms of implementation
	 * 
	 * what exactly has the RA guys did to overcome the above disadvantages is that
	 * --->>>they created a wrapper utility/classes on top of this http client
	 * 
	 * this utility/class wrapper on top of this http client ===> IS CALLED RA LIBRARY
	 * ===================================>>>>>>>>>>
	 * internally it is using http client only BUT what is the advantage of that??
	 * the ADVANTAGE is that they have given very straight forward methods -- like
	 * given, when, then, call, update, status,
	 * ===>common testing code we can write without any unnecessay complexities, very
	 * readable code we can write here
	 * -----for egs:
	 * we really want to parse the html code
	 * we really want to chk the status code
	 * ----it is very easy to chk with the rest assured code BUT internally it will be
	 * using the http client to call all the api calls(CRUD)=> rest assured apis
	 * ----so RA is a domain specific lang written in java on top of http client 
	 * ==>>>>IT IS A WRAPPER ON TOP OF HTTP CLIENT
	 * 
	 * RA is not having its own client -- it is using java jdk client here
	 * 
	 * can we say RA we can use with python???NO it is a pure java DSL language
	 * ----------other langs they have their own RA clients
	 * egs:
	 * python has 
	 * RestSharp for csharp(C#)
	 * 
	 * sel is also using http client internally to call the network calls
	 * 
	 * HOW TO REST ASSURED???
	 * ====================>>
	 * first thing is that we always focus on request part
	 * second thing is that the response
	 * ----->>request and response we always have to play between
	 * where exactly we have to validate(actual vs expected)--with request/ with response??
	 * -------obviously we have to validate once we get the response 
	 * 
	 * 1. Request
	 *  in the request section -- the most imp thing is what kind of call it is
	 *  either a GET/POst/PUT/DELETE call
	 *  	--GET/POST/PUT/DELETE
	 *  	--URI: baseUrl + /endpoint + QueryParams
	 *  	--Headers:
	 *  	--Request Body/Payload
	 *  	--Authorization : can be written in the header/Authorization tab as well
	 *  		(Oauth1,Oauth2,Bearer Token, JWT token, API key, Basic Auth)
	 *  
	 *  what type of diff methods are available in order to handle the authentication??
	 *  how to add the request and how to send the request??
	 *  once we send the request - will get the response 
	 *  AND NOW WE HAVE TO VALIDATE all the below in THE RESPONSE
	 *  
	 * 
	 * 2. Response
	 * 		--Status
	 * 		--StatusLine
	 * 		--Body(can validate if json/xml/html is coming) Json Path, XmlPath
	 * 		==>very huge json response we are getting-in which we can validate only
	 * products which come under electronics category and the price under 500$=>
	 * we have to parse the entire json array, do multiple chks-write a for loop and
	 * if else conditions -- then only we can check
	 * BUT instead of all of the above complex code -- with the help of Json/xml path-we
	 * can validate the condition easily
	 * JUST like how we use sql queries to validate the data base--we can do the same
	 * to validate the response body using json/xml paths
	 * 		--Headers
	 * 		--Cookies
	 * 
	 * NOW TO WRITE THE AUTOMATION CODE TO DO ALL THE ABOVE --HAVE TO USE
	 * =============>>>
	 * i) java lang
	 * ii) create a simple Maven prj and add RA library in the pom.xml file
	 * 
	 * have to add libs: RA,
	 * supportive libs: json path, xml path, json schema as well 
	 * Json/Xml schema validator lib: Jackson lib
	 * Google gson lib
	 * -----how to write TC's??
	 * we have to integrate with unit testing framework- testng lib
	 * no need to worry about parallel exec--since the tc's always run in sequential
	 * mode
	 * 
	 * =============<<<<<>>>>>>=================
	 * IN REST ASSURED there are 2 ways-->> WE CAN WRITE THE TEST/CALL THE API
	 * 
	 * i) way with bdd style BUT we are not writing any feature file etc...
	 * Cucumber is not the only BDD(approach) -- there are other ways also of implementing bdd
	 * BDD means we have to write the code using given, when, then
	 * 
	 * BDD style:
	 * given
	 * when
	 * then
	 * 
	 * when u r using bdd style to write the tc's -- can generate logs without any
	 * other lib like logsl4j etc...
	 * --can generate logs by appending .log().all() wherever there is given, when
	 * then
	 * 
	 * when writing the code using builder pattern
	 * 	.body() -- is overloaded with many diff params
	 *  so we can use hamcrest lib to match the body output with
	 *  for this -- need to do static import of this hamcrest lib 
	 *  import static org.hamcrest.Matchers.equalTo;
	 *  --has some inbuilt expressions/methods to match the body content with
	 *   --to match contents of the body to do validations
	 *   --$ means top node/root node  
	 * 
	 * bdd style code also we can write with Rest Assured - i.e why Rest Assured is
	 * super popular
	 * 
	 * ii)Non-BDD approach:
	 * 
	 * 
	 * 
	 * -----------------
	 * import static Employee.m1;
	 * 
	 * Employee class
	 * {
	 * 
	 * 		static m1(){}
	 * 
	 * 		m2(){}
	 * 
	 * 		main(){
	 * 		//	Employee.m1();
	 * 			m1();
	 * 			Employee obj = new Employee();
	 * 			obj.m2();
	 * 		}
	 * }
	 * 
	 * 
	 * Two main static imports needed for API automation tc's
	 * 
	 * import static io.restassured.RestAssured.given;
	 * import static org.hamcrest.
	 * 
	 * 
	 * fakestoreapi.com ---test url for auto tcs practice
	 * 
	 * RestAssured.baseURI = "";
	 * baseURI is a static variable of this class RestAssured
	 * 
	 * notes for RestAssured when mouseOver-autoPOp
	 * --------------------
	 * REST Assured is a Java DSL for simplifying testing of REST based services built on top of HTTP Builder. It supports POST, GET, PUT, DELETE, HEAD, PATCH and OPTIONS requests and to verify the response of these requests. Usage examples:

Assume that the GET request (to http://localhost:8080/lotto) returns JSON as:
 {
 "lotto":{
   "lottoId":5,
   "winning-numbers":[2,45,34,23,7,5,3],
   "winners":[{
     "winnerId":23,
     "numbers":[2,45,34,23,3,5]
   },{
     "winnerId":54,
     "numbers":[52,3,12,11,18,22]
   }]
  }
 }
 
REST assured can then help you to easily make the GET request and verify the response. E.g. if you want to verify that lottoId is equal to 5 you can do like this:
 get("/lotto").then().assertThat().body("lotto.lottoId", equalTo(5));
 
or perhaps you want to check that the winnerId's are 23 and 54:
 get("/lotto").then().assertThat().body("lotto.winners.winnerId", hasItems(23, 54));
 
XML can be verified in a similar way. Imagine that a POST request to http://localhost:8080/greetXML returns:
 <greeting>
     <firstName>{params("firstName")}</firstName>
     <lastName>{params("lastName")}</lastName>
   </greeting>
 
i.e. it sends back a greeting based on the firstName and lastName parameter sent in the request. You can easily perform and verify e.g. the firstName with REST assured:
 with().parameters("firstName", "John", "lastName", "Doe").when().post("/greetXML").then().assertThat().body("greeting.firstName", equalTo("John"));
 
If you want to verify both firstName and lastName you may do like this:
 with().parameters("firstName", "John", "lastName", "Doe").when().post("/greetXML").then().assertThat().body("greeting.firstName", equalTo("John")).and().body("greeting.lastName", equalTo("Doe"));
 
or a little shorter:
 with().parameters("firstName", "John", "lastName", "Doe").when().post("/greetXML").then().assertThat().body("greeting.firstName", equalTo("John"), "greeting.lastName", equalTo("Doe"));
 
You can also verify XML responses using x-path. For example:
 given().parameters("firstName", "John", "lastName", "Doe").when().post("/greetXML").then().assertThat().body(hasXPath("/greeting/firstName", containsString("Jo")));
 
or
 with().parameters("firstName", "John", "lastName", "Doe").post("/greetXML").then().body(hasXPath("/greeting/firstName[text()='John']"));
 
XML response bodies can also be verified against an XML Schema (XSD) or DTD. 
XSD example:
 get("/carRecords").then().assertThat().body(matchesXsd(xsd));
 
DTD example:
 get("/videos").then().assertThat().body(matchesDtd(dtd));
 
matchesXsd and matchesDtd are Hamcrest matchers which you can import from RestAssuredMatchers.
Besides specifying request parameters you can also specify headers, cookies, body and content type.
Cookie:
 given().cookie("username", "John").when().get("/cookie").then().assertThat().body(equalTo("username"));
 
Headers:
 given().header("MyHeader", "Something").and(). ..
 given().headers("MyHeader", "Something", "MyOtherHeader", "SomethingElse").and(). ..
 
Content Type:
 given().contentType(ContentType.TEXT). ..
 
Body:
 given().request().body("some body"). .. // Works for POST and PUT requests
 given().request().body(new byte[]{42}). .. // Works for POST
 
You can also verify status code, status line, cookies, headers, content type and body.
Cookie:
 expect().cookie("cookieName", "cookieValue"). ..
 expect().cookies("cookieName1", "cookieValue1", "cookieName2", "cookieValue2"). ..
 expect().cookies("cookieName1", "cookieValue1", "cookieName2", containsString("Value2")). ..
 
Status:
 get("/x").then().assertThat().statusCode(200). ..
 get("/x").then().assertThat().statusLine("something"). ..
 get("/x").then().assertThat().statusLine(containsString("some")). ..
 
Headers:
 get("/x").then().assertThat().header("headerName", "headerValue"). ..
 get("/x").then().assertThat().headers("headerName1", "headerValue1", "headerName2", "headerValue2"). ..
 get("/x").then().assertThat().headers("headerName1", "headerValue1", "headerName2", containsString("Value2")). ..
 
Content-Type:
 get("/x").then().assertThat().contentType(ContentType.JSON). ..
 
REST Assured also supports mapping a request body and response body to and from a Java object using Jackson, Gson or JAXB. Usage example:
 Greeting greeting = get("/greeting").as(Greeting.class);
 
 Greeting greeting = new Greeting();
 greeting.setFirstName("John");
 greeting.setLastName("Doe");

 given().body(greeting).when().post("/greeting");
 
See the javadoc for the body method for more details.
Full body/content matching:
 get("/x").then().assertThat().body(equalsTo("something")). ..
 get("/x").then().assertThat().content(equalsTo("something")). .. // Same as above
 
REST assured also supports some authentication schemes, for example basic authentication:
 given().auth().basic("username", "password").when().get("/secured/hello").then().statusCode(200);
 
Other supported schemes are OAuth and certificate authentication.
By default REST assured assumes host localhost and port 8080 when doing a request. If you want a different port you can do:
 given().port(80). ..
 
or simply:
 .. when().get("http://myhost.org:80/doSomething");
 
Parameters can also be set directly on the url:
 ..when().get("/name?firstName=John&lastName=Doe");
 
You can use the XmlPath or JsonPath to easily parse XML or JSON data from a response.
XML example:
            String xml = post("/greetXML?firstName=John&lastName=Doe").andReturn().asString();
            // Now use XmlPath to get the first and last name
            String firstName = with(xml).get("greeting.firstName");
            String lastName = with(xml).get("greeting.lastName");

            // or a bit more efficiently:
            XmlPath xmlPath = new XmlPath(xml).setRootPath("greeting");
            String firstName = xmlPath.get("firstName");
            String lastName = xmlPath.get("lastName");
        
JSON example:
            String json = get("/lotto").asString();
            // Now use JsonPath to get data out of the JSON body
            int lottoId = with(json).getInt("lotto.lottoId);
            List winnerIds = with(json).get("lotto.winners.winnerId");

            // or a bit more efficiently:
            JsonPath jsonPath = new JsonPath(json).setRootPath("lotto");
            int lottoId = jsonPath.getInt("lottoId");
            List winnerIds = jsonPath.get("winners.winnerId");
        
REST Assured providers predefined parsers for e.g. HTML, XML and JSON. But you can parse other kinds of content by registering a predefined parser for unsupported content-types by using:
 RestAssured.registerParser(<content-type>, <parser>);
 
E.g. to register that content-type 'application/custom' should be parsed using the XML parser do:
 RestAssured.registerParser("application/custom", Parser.XML);
 
You can also unregister a parser using:
 RestAssured.unregisterParser("application/custom");
 
If can also specify a default parser for all content-types that do not match a pre-defined or registered parser. This is also useful if the response doesn't contain a content-type at all:
 RestAssured.defaultParser = Parser.JSON;
 
If you need to re-use a specification in multiple tests or multiple requests you can use the ResponseSpecBuilder and RequestSpecBuilder like this:
 RequestSpecification requestSpec = new RequestSpecBuilder().addParameter("parameter1", "value1").build();
 ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();

 given().
         spec(requestSpec).
 when().
        get("/something");
 then().
         spec(responseSpec).
         body("x.y.z", equalTo("something"));
 
You can also create filters and add to the request specification. A filter allows you to inspect and alter a request before it's actually committed and also inspect and alter the response before it's returned to the expectations. You can regard it as an "around advice" in AOP terms. Filters can be used to implement custom authentication schemes, session management, logging etc. E.g.
 given().filter(ResponseLoggingFilter.logResponseIfStatusCodeIs(302)). ..
 
will log/print the response body to after each request.
You can also change the default base URI, base path, port, authentication scheme, root path and filters for all subsequent requests:
 RestAssured.baseURI = "http://myhost.org";
 RestAssured.port = 80;
 RestAssured.basePath = "/resource";
 RestAssured.authentication = basic("username", "password");
 RestAssured.rootPath = "store.book";
 
This means that a request like e.g. get("/hello") goes to: http://myhost.org:8080/resource/hello which basic authentication credentials "username" and "password". See rootPath for more info about setting the root paths, filters(java.util.List) for setting default filters
You can reset to the standard baseURI (localhost), basePath (empty), standard port (8080), default authentication scheme (none), default parser (none) and default root path (empty string) using:
 RestAssured.reset();
 
In order to use REST assured effectively it's recommended to statically import methods from the following classes:

io.restassured.RestAssured.*
io.restassured.matcher.RestAssuredMatchers.*
org.hamcrest.Matchers.*
	 * 
	 */

}
