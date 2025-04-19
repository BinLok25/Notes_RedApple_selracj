package july2024api_restassured_notes;

public class RA10_Session {
	
	/*
	 * 10_JWT
	 * ========================
	 * 
	 * Seen previously how exactly oauth1.0 and oauth2.0 works??
	 * how exactly is the mechanism happening
	 * oauth1.0 -- IS DESIGNED ONLY AND ONLY FOR WEB APPLICATIONS**************IMP PT
	 * --is almost deprecated
	 * --is used for workflow based appns like hackerrank where exactly the
	 * login happens thru social media accts-3rd partty login where we have to exchange
	 * the token
	 * it is a very powerful mechanism But slightly difficult to implement than oauth2.0
	 * ---since it gets a temporary grant in between and then exchanges it for a 
	 * permanent grant. 
	 * To AVOID THIS COMPLICATION: 
	 * we have oauth2.0 where we just get the token and then we exchange the token to
	 * send the request
	 * --protocol upgraded for browser app, non-browser app, windows app, mobile app APIs.
	 * --is applicable for any kind of appn like Desktop, mobile, web as well and is
	 * easy to implement than oauth1.0
	 * FEW TERMINOLOGY: 
	 * O==>open authorization
	 * then same 3 parties--Entity/User/resource owner, ClientAppn, SocialWebsite/Identity
	 * Provider(IDP) are involved
	 * 
	 * Reviewing amadeus Api code from previous class--with oauth2.0
	 * 
	 * Can we automate oauth1.o with RA?? Yes
	 * -----------------
	 * create a class Oauth1API_test
	 * @Test
	 * public void flickApiTest(){}
	 * -----
	 * start writing the code
	 * for oauth they have already given the methods
	 * oauth("consumerkey","consumersecret","accesstoken","secrettoken")  ==> oauth1.0
	 * 
	 * consumerkey and consumersecret -we already generated from the client app login
	 * --then we got the access token from the TC1 output on console
	 * --then manually we authorize it
	 * --then we got one verifier when we exchanged the token
	 * --then we copied the verifier
	 * 
	 * ====then we got the access token and the token secret
	 * IN OAUTH1.0 --THE verifier is the most imp token and we got it from manual step
	 * 
	 * ----sometimes the dev will give all the 4 tokens
	 * ---if they give only consumer key and consumer secret As the flickr app did
	 * --then there is no scope for automation as there is one manual step involved
	 * 
	 * Oauth1.0 Automation:--------->POSSIBLE
	 * ---can create the oauth1.0 flow TCs on postman, gather all tokens from there
	 * from the TC4 url --get all query params and can automate the oauth1.0 flow using
	 * Restassured lib
	 * 
	 * IMP NOTE:
	 *Oauth1.0 --you need to add one extra dependency in your pom.xml
	 * name: scribejava-core
	 * version: 2.5.3  since old version will only work
	 * 
	 * JWT: json web token
	 * ==============is a type of token,which is very light weight, having a diff mechanism to generate a jwt token
	 * it has 3 parts--has 3 dots as well
	 * p1.p2.p3
	 * 
	 * JWT can be integrated with oauth1 and also with oauth2
	 * jwt -- is a type of token
	 * 
	 * 0auth1 + JWT
	 * Oauth2 + JWT
	 * 
	 * dummy token:
	 * 
	 * p1 -- is called header
	 * p2 -- is called payload(claims)
	 * p3 -- is called signature
	 * 
	 * how exactly jwt token gets generated
	 * ---------------->>>>>
	 * first of all
	 * it uses some hashing algorithm--with a base64 encoded method
	 * so first it will encode the header
	 * header looks like this, in the form of json
	 * ["alg": "HS256","typ": "JWT"]
	 * ---it generates p1 string
	 * p1={"alg": "HS256","typ": "JWT"}
	 * 
	 * the client will pass only 2 things -the header and the payload
	 * the server adds its flavor==> the secret
	 * --every time a request is sent to the server-a new JWT token is generated
	 * and this jwt will add one extra flavor which is the secret--and only server knows
	 * about the secret==> server only has the secret key and no one else
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
