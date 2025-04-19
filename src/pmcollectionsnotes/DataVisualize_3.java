package pmcollectionsnotes;

public class DataVisualize_3 {
	/*
	 * 1.none: no data
	 * 
	 * 2.raw:
	 *  a.JSON --- application/json
	 *  b.XML --- application/xml
	 *  c.Text --- text/plain
	 *  d.JS ---- application/javascript
	 *  e.HTML --- text/html
	 *  
	 *  3.form-data:
	 *      ---text
	 *      ---text
	 *      ---pdf
	 *      
	 *      content-type: multipart/form-data
	 *      
	 *  4.x-www-form-urlencoded ---> application/x-www-form-urlencoded
	 *  
	 *  5.binary:
	 *     ---only one file is allowed per request
	 *     ---alternative to the file upload (frm-data)
	 *     ---file name is not preserved (to the server)
	 * 
	 * stateless vs stateful apis:
	 * 
	 * stateless--when communication is happening between the client and the server
	 * each and every req and response is independent==> their session ids are not
	 * maintained
	 * 
	 * STATE: means session ids ==> information about that particular req/res
	 * server will never hold the session id
	 * 
	 * WebSocket(stateful)
	 * STATEFUL APIS: Where server is actually maintaining the session id
	 * are faster than stateless apis
	 * 
	 * Why Rest always follows stateless protocol ??
	 * 
	 * 
	 * VERTICAL SCALING: Single machine upgrading the gb/Ram 
	 * 
	 * HORIZONTAL SCALING: increase horizontally ==> increase the no of machines/servers
	 * being added(old concept)
	 * 
	 * Sid maintaining tool ==>session maintaining tool
	 * session maintaining repository/tool
	 * 
	 * SESSION4: Idempotent
	 * -----------------------
	 * Accept: client can accept which is coming from server
	 * Content-Type: client is sending a body(JSON/XML) to server
	 * 
	 * POST: create a resource--creates fresh resource/NOT IDEMPOTENT
	 * 1--first entry
	 * 2 --second entry
	 * 
	 * nthtime --nth entry==>n no of requests created in data base
	 * 
	 * PUT: update a resource
	 * 1 -- 1 updated
	 * 2 -- 1 updated again
	 * 3 -- 1 updated
	 * 
	 * n ---1 updated
	 * 
	 * update several times the same id/resource/entry in database gets updated--
	 * this feature is called idempotency
	 * 
	 * PATCH: in some books it says Patch is idempotent and in some books says
	 * not idempotent
	 * 
	 * ----Patch is also partial part of PUT call so should be Idempotent
	 * 
	 * GOOD PRACTICE TO CHK IF PUT IS IDEMPOTENT--real time projects
	 * =============else need to create a DEFECT
	 * 
	 * PUT --> POST
	 * /users/8787
	 * {
	 *   "name": "Tom",
	 *   "email": "tom@gmail.com"
	 *   }
	 *   ======Response====
	 *   {
	 *     id: 8787,
	 *     "name": "Tom",
	 *     "email": "tom@gmail.com
	 *     }
	 *     
	 *     TRY THE ABOVE USED CASE PRACTICALLY(Put behaves LIKE POST)
	 *     if implemented/designed by Dev in such a way
	 *     ==> if the above design is implemented by the devs
	 *     --that is if the id is available then the same id gets updated
	 *     --else the id is created and then the record has the same body
	 *     
	 *     ---------------
	 *     DELETE:
	 *     /users/9090 ---> 204
	 *     
	 *     SCOPE OF POSTMAN VARIABLES:
	 *     1. L - Local
	 *     2. D - Data
	 *     3. E - Environment - QA/Dev/Stage/Prod
	 *     4. C - Collection--for all collection requests
	 *     5. G - Global -- for all the collections in you WorkSpace
	 *     
	 *     dev:
	 *     https://gorest.dev.co.in
	 *     
	 *     QA:
	 *     https://gorest.qa.co.in
	 *     
	 *     Stage:
	 *     https://gorest.stage.co.in
	 *     
	 *     Prod:
	 *     https://gorest.prod.co.in
	 *     
	 *     SESSION 5:Pagination Concept
	 *     ------------------
	 *     PM variables -- should be accessed with a dollar sign in betweent the
	 *     double curly braces
	 *     e.g:
	 *     {{$randomFullName}}
	 *     {{$randomPhoneNumber}}
	 *     
	 *     4 different types of levels in the LOGS:
	 *     Log, INfo, Warning, Error
	 *     
	 *     API RESPONSE PAGINATION:
	 *     To get bulk data from server--it is the responsibility of Dev to have
	 *     written code for backend pagination as well
	 *     
	 *     there are 4 types of pagination headers:
	 *     ------------
	 *     X-Pagination-Total     total no of results
	 *     X-Pagination-Pages     total no of pages
	 *     X-Pagination-Page      current page number
	 *     X-Pagination-Limit     results per page
	 *     ====================
	 *     no of records per page ==>X-pagination-LImit has a default value which
	 *     can be increased or decreased/customized using the Query parameters
	 *     
	 *     QUERY PARAMS: used in the url using ? mark
	 *     
	 *     What is Query Param??
	 *     If out of 1000 users fetched from the server--you want to access a 
	 *     particular record with 'where' conditions LIKE name = 'Tom', 'phoneno'=
	 *     123567893
	 *     etc then you retrieve the record by using ? in the url on postman
	 *     and passing the params-
	 *     single or however many using the & in between for more conditions
	 *     ----------
	 *     1000 users
	 *     
	 *     query Param: to filter the data
	 *     name = tom
	 *     status = active
	 *     
	 *     https://www.amazon.com/users?name=tom&status=active
	 *     
	 *     chk the API documentation to see how the query params should be supplied
	 *     
	 *     PATH PARAM:
	 *      colon is the identifier to be used along with the key in postman to retrieve
	 *      the record as per the path param
	 *     
	 *  URL
	 *  https://gorest.co.in/public/v2/users/765215/orders?data-01-01=2024
	 *     
	 *  URI:(Uniform Resource Identifier)
	 *  everything in the link is called URI
	 *  A general term that encompasses both URLs and URNs as well as other schemes
	 *  that identify resources
	 *     
	 *  URL:(Uniform Resource Locator)
	 *  A specific type of URI that provides a means to locate the resource, all URLs
	 *  are URIs
	 *     
	 *  URN:(Uniform Resource Name)
	 *  Another specific type of URI that provides a unique name for a resource within
	 *  a name space but doesnot provide location information
	 *     
	 *  URI (general term)
	 *    --URL
	 *    --URN
	 *    
	 *  API EndPoints:
	 *  /users
	 *  /users{id}
	 *  /users/orders/{orderid}
	 *     
	 *  DEFault port no for http 80
	 *  Default port no for SSH is 22
	 *  Default port no for https 443 
	 *  
	 *  ISBN:
	 *  international standard book number
	 *  
	 *  
	 *  an example with URI+URL+URN
	 *  https://www.naveenautomationlabs.com:8080/path/to/resource?urn=urn:isbn:0451450523#fragment
	 *  
	 *  protocol(scheme)   : http
	 *  subdomain          : www
	 *  Domain             : naveenautomationlabs
	 *  TLD(Top Level Domain) : com
	 *  Port               : 8080
	 *  Query              : urn=urn:isbn:0451450523
	 *  Fragment           : fragment
	 *  
	 *  SESSION 6:
	 *  -----------------
	 *  IQ] What do you mean by OPTIONS HTTP method??
	 *  We are not requesting anything from the server with this request.
	 *  All it does after hitting send with this options method is--in the
	 *  Headers Section of the response--you will get to see all the diff HTTP
	 *  methods allowed for this API
	 *  Access-Control-Allow-Methods     GET,HEAD,PUT,PATCH,POST,DELETE
	 *  ---we do not use this options much--since it is not serving any data
	 *  BUt still for a quick chk to see what all methods are allowed -- can use
	 *  this Options method--if this Options method has been implemented in the 
	 *  API by the Development side
	 *  And before really testing the particular API-to chk what all diff methods
	 *  are allowed --can use this OPTIONs call
	 *  ---options should be implemented in the form of coding from the dev side
	 *  
	 *  IQ]What is the difference between HEAD and GET / are they both same??
	 *  --------------
	 *  HEAD:
	 *  Head is identical with Get BUT without response Body
	 *  Head and Get both are exactly same
	 *  With Head --no response body
	 *  With Get -- there is response body
	 *  ---Head says we have res body/data content is available BUT will not give 
	 *  it to you
	 *  HEAD IS A SUBSET OF GET CALL/will not give any data But will get header info
	 *  --will also get the imp headers in the response body
	 *  IQ]what is the used case for HEAD??-used for Smoke Testing
	 *  -----Before we actually hit the api-used to chk all the headers in the response
	 *  To chk --if the data is there OR not--with the response code
	 *  --before fetching the actual data-really want to chk the headers -- to
	 *  chk the content-type etc...
	 *  if after hitting the GET call--if the status code is 200 and the response
	 *  headers are available--like application/json or content-type is json
	 *  Then only i will start testing the api further
	 *  
	 *  very imp feature with HEAD--to get the confidential data--just chk with the
	 *  HEAD call
	 *  ---7 HTTP methods
	 *  get, post, put, delete, patch,OPtion, Head
	 *  
	 *  VAULT:
	 *  tool for secret management implemented in Post man as well
	 *  the tokens are maintained in the masking form
	 *  for imp tokenkey,api key etc...
	 *  
	 *  Go to the Collection level --- Variables tab to store the common vars for
	 *  all the tcs
	 *  in case if the var is sensitive and should not be exposed then store it in
	 *  VAULT
	 *  
	 *  Vault is a 3rd party api
	 *  
	 *  LOCAL VARIABLE:
	 *  Create the local var using the script in post response section of a request
	 *  
	 *  const response = pm.response.json();
	 *  
	 *  const userId = response.id();
	 *  console.log("user id is: "+userId);
	 *  
	 *  //C,G,E,L
	 *  pm.variables.set("user_id", userId);
	 *  
	 *  And use the created local variable in the next request-correlation
	 *  
	 *  BUT this local var gets instantiated only when the entire collection is run
	 *  
	 *  TC: is incomplete without proper validations
	 *  TC: navigationsONui/requestSpec + Validations
	 *  
	 *  In order to write the validations on PM -- Go to in the SCripts TAB and only
	 *  in POST RESPONSE
	 *  -----------the pm AI generates auto scripts as well
	 *  
	 *  Go to the snippets section -- and select the validation for the particular
	 *  response codes 
	 *  
	 *  SCOPE: of all variables
	 *  L D E C G
	 *  
	 *  The scope of local variables is always on top and gets instantiated at the
	 *  collection level
	 *  Once the collection execution is done -- the local variables get deleted 
	 *  also
	 *  
	 *  Life Span: of local var
	 *  starts at the collection exec and ends at the halt of the collection exec
	 *  
	 *  
	 *  
	 *  
	 */

}
