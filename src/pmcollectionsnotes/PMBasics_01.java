package pmcollectionsnotes;

public class PMBasics_01 {
	
	/**
	 * API introduction:
	 * 
	 * simple code for calculating
	 * ------------>>
	 * Class Calculator{
	 *   int add(int a, int b){
	 *   		int sum = a + b;
	 *   		return sum;
	 *   }
	 *   }
	 *   
	 *   add(10, 20) --> 30
	 *   add(3, 4) --> 7
	 *   ----------------------------
	 *   
	 *   AWS - server
	 *   https://192.145.22.11:8080/add/10,20
	 *   
	 *   API -> network(http) -> WebService
	 *   ------------------------------
	 *   
	 *   Explanation:
	 *   ============>
	 *   what do u mean by APIs/WebServices??
	 *    if a simple java code is written - a method to add two ints which takes
	 *    two ints a and b and returns the output of the sum of the two params
	 *    --in this particular class - which call this method - which inturn adds
	 *    the two params and returns the result
	 *    ===> can also be called an API on a system
	 *    if this same API is hosted on a AWS/ or any server with ip: 192.145.22.11:8080
	 *    by using https protocol -- then it is called a WEBSERVICE
	 *    
	 *    if the method is called on the local system from inside the code -- is a simple
	 *    API
	 *    
	 *    if the same method is hosted on a network with the https protocol - which has
	 *    a port no and also the end point then it is WEB SERVICE
	 *    
	 *    -------------------
	 *    Whenever two complete diff systems -- some java code + oracle DB - is the first
	 *    system
	 *    and the second system is some python code + Mongo DB is the second sytem
	 *     
	 *     if the above two needs to communicate -- then it should be thru some mediator
	 *     which is light weight => medium 
	 *     
	 *     CLIENT: could be a UI/Browser/app/postman
	 *     
	 *     CONTRACT: signed between the client and the server parties
	 *              about the attributes to be passed when exchanging the messages
	 *              in the form of a json file, the type of data should also be as
	 *              mentioned in the contract
	 *              it shud always be a 1-1 mapping => no mismatch 
	 *              as per the API documentation
	 *              
	 *              on the server side - the business logic is written - the main method
	 *              will be the client which would be called by the server
	 *              
	 *     the sequence of data also shud be the same N not breached - if mentioned in the 
	 *     API documentation(where contract, schema, urls, json, error codes,
	 *     authentications mentioned) 
	 *     
	 *     Contract testing/schema testing
	 *     
	 *     who is the producer?? Air line companies - individual websites
	 *     to chk the prices of ten diff air line individual websites is a tiresome
	 *     headoc - so the brokers(Make my trip.com) makes the search easier for the
	 *     customer
	 *     
	 *     Broker: converts the data all jsons - parse all jsons it into some form and display the
	 *     information beautifully on the UI for the end customer
	 *     
	 *     the client is makeMyTrip and the consumer is also the MakeMyTrip
	 *     The mMT server is calling the diff airline servers
	 *     the producers are the different Airlines
	 *    
	 * API DOC:
	 *  1. contract/schema
	 *  2. EndPoint urls
	 *  3. headers/params/query
	 *  4. json/xml
	 *  5. Authentication: API key
	 *  
	 *  SLA:s defined at the business level
	 *  
	 *  
	 *  when communicating between two diff systems - consumer and producer
	 *  CRUD operations happen
	 *  
	 *  create(POST), Retrieve(Get/Head), Update(Put/Patch), Delete(delete)
	 *  
	 *  CACHING CONCEPT: 
	 *  m calling one API( a get call ) which fetches 1000 products- if the back
	 *  end dev created a caching mechanism(defined at the server side) - which 
	 *  stores the temp memory
	 *  ---first time server gets the data first time and sends it to consumer
	 *   the temp data server(CACHING SERVER) is extremely useful so as not to 
	 *   hit the server again for such enormous data - in case another consumer/
	 *   or the same consumer asks for such enormous data again thru the same API
	 *   Get call
	 *   --the caching server 
	 *   ===========has TTL(total time limit)
	 *   the caching mechanism at the server side should be maintained for better
	 *   performance with configured TTL
	 *   it is only temporary - after TTL limit will be flushed
	 *   
	 *   egs of caching servers: Load Balancer
	 *   
	 *   what is the MAJOR problem with the CACHe??
	 *   ---------------->
	 *   1. the data can be staled
	 *   2. some new data could be there updated - then in that case stale data
	 *   is served to the customer
	 *   BUT there are some mechanisms-webhooks which sniffs the updates as they
	 *   happen and immediately update the temp/CAChe memory as well
	 * 
	 * 
	 * BROWSER: also has some cache mechanism - the accept cookies popup does it
	 * --------->>
	 * 
	 * GET - cached, POST - non cached, PATCH - non cached, DELETE - non cached
	 * ----------------->> it is not kind of a rule - depends on DEV how he
	 * created it - can raise a bug and Question the DEV if logical sense is
	 * missed
	 * 
	 * POST: requests can be cached if they meet specific criteria defined by the
	 * server, though this is not common practice
	 * 
	 * SAFE: An HTTP method is considered as safe it it does not modify any
	 * resources on the server. Safe methods are intended only for retrieving data
	 * 
	 * GET - is always safe, POST unsafe, PUT unsafe, Patch unsafe, 
	 * Option yes, Head yes
	 * 
	 * Cacheable: An HTTP method is considered cacheable if the responsed to 
	 * requests using that method can be stored and reused
	 * 
	 * IDEMPOTENT: An HTTP method is idempotent if multiple requests have the same
	 * effect as a single request
	 *   EX: an update call is idempotent since the record(id) it updates every
	 *   time is the same one
	 *   
	 *   IQ] why POST call is not idempotent whereas PUT is??
	 *   
	 *   IQ] just like w3c is standard for designing the web apps do we have any
	 *   standard for the API CRUD calls to be followed??
	 *   ==========>>IETF is the standard
	 *   Internet Engineering TAsk Force
	 *   
	 *   go to their documentation - constitutional documentation for the APIs
	 *   and read to learn about the standards for apis
	 *   
	 *   rfc-editor.org/rfc/rfc7231#section-4.3.1  
	 *   
	 *   book mark the above url
	 * 
	 * CACHING : shud be implemented properly at the server side
	 * 
	 * *The best way to remember http status codes.*

✅ *Join Telegram:* https://telegram.me/qaidea

➡️100-series → Think of "progress updates."

➡️200-series → Think of "successful transactions."

➡️300-series → Think of "changes in direction."

➡️400-series → Think of "client mistakes."

➡️500-series → Think of "server problems."

🔶️1xx – Informational Responses
• 100 Continue
• 101 Switching Protocols
• 102 Processing (WebDAV)
• 103 Early Hints

🔶️2xx – Success Responses
• 200 OK
• 201 Created
• 202 Accepted
• 203 Non-Authoritative Information
• 204 No Content
• 205 Reset Content
• 206 Partial Content
• 207 Multi-Status (WebDAV)
• 208 Already Reported (WebDAV)
• 226 IM Used

🔶️3xx – Redirection Responses
• 300 Multiple Choices
• 301 Moved Permanently
• 302 Found
• 303 See Other
• 304 Not Modified
• 305 Use Proxy (Deprecated)
• 306 (Unused)
• 307 Temporary Redirect
• 308 Permanent Redirect

🔶️4xx – Client Error Responses
• 400 Bad Request
• 401 Unauthorized
• 402 Payment Required
• 403 Forbidden
• 404 Not Found
• 405 Method Not Allowed
• 406 Not Acceptable
• 407 Proxy Authentication Required
• 408 Request Timeout
• 409 Conflict
• 410 Gone
• 411 Length Required
• 412 Precondition Failed
• 413 Payload Too Large
• 414 URI Too Long
• 415 Unsupported Media Type
• 416 Range Not Satisfiable
• 417 Expectation Failed
• 418 I'm a Teapot (April Fools' joke from RFC 2324)
• 421 Misdirected Request
• 422 Unprocessable Entity (WebDAV)
• 423 Locked (WebDAV)
• 424 Failed Dependency (WebDAV)
• 425 Too Early
• 426 Upgrade Required
• 428 Precondition Required
• 429 Too Many Requests
• 431 Request Header Fields Too Large
• 451 Unavailable For Legal Reasons

🔶️5xx – Server Error Responses
• 500 Internal Server Error
• 501 Not Implemented
• 502 Bad Gateway
• 503 Service Unavailable
• 504 Gateway Timeout
• 505 HTTP Version Not Supported
• 506 Variant Also Negotiates
• 507 Insufficient Storage (WebDAV)
• 508 Loop Detected (WebDAV)

	 * 
	 * 
	 */

}
