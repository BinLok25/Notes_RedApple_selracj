package seleniumframeworknotes;

public class FrameWork_Session15 {
	
	/*
	 * ReCap: set up jenkins in the previous session, and created the job, seen the
	 * parameterization
	 * --chk the checkbox -Build periodically and then to schedule the job RUN
	 * --create cronjob set up-the cronjob syntax has 5 different setups
	 * --copy the relative syntax as below 
	 *  *5/* * * *
	 *  and paste in the BuildPeriodically Schedule box on jenkins Build Triggers
	 *  
	 *  Save To Trigger the build
	 *  
	 * JENKINS:
	 *  used a cron expression and the diff fields are:
	 *  
	 *  1. MINUTES Minutes in one hour(0-59)
	 *  2. HOURS Hours in one day(0-23)
	 *  3. DAYMONTH Day in a month(1-31)
	 *  4. MONTH Month in a year(1-12)
	 *  5. DAYWEEK Day of the week(0-7) where 0 and 7 are sundays
	 *  
	 *  If you want to schedule your build every 5 minutes, this will do the job
	 *  *5/* * * *
	 *  
	 *  if you want to schedule your build everyday at 8h00, this will do the job:
	 *  0 8 * * * 
	 * 
	 * --------Instead of MANUALLY TRIGGERING/SCHEDULING THE JOBS TO RUN
	 * =====if i want to do it automatically ---Then NGROK Proxy is the Option
	 * 
	 * NGROK Proxy:
	 * ================>>>>Acts as a mediator between the GitHub and JENKINS
	 * ==>the moment there is a PUSH into GitHub --NGROK --senses this PUsh
	 * and triggers the JENKINS to start the Job
	 * 
	 * --WebHook Concept:
	 * ============> a webhook is configured on the Github
	 * ---is another kind of api which will internally use the CRUd operations
	 * ---will keep monitoring what is happening to the master branch
	 * ---will read the PUSh/ event and send a note/mesge to the NGRok proxy
	 * that there is a push event
	 * --NGRok proxy is also configured in the webhook
	 * ---NGRok proxy is integrated/connected with the Jenkins Server and so will
	 * trigger the job on jenkins SERVER
	 * 
	 * =========What we need to do from our side--just
	 * need to write the code on our local workspace of eclipse--and then push
	 * our code on to the Github--and that's it
	 * EVery thing else is taken care of
	 * 
	 * ==> the moment i write
	 * git push origin master
	 * 
	 * webhook will read the event and send a mesge to NGRok proxy and NGRok proxy
	 * will trigger the job on jenkins SERVER
	 * ------The TC's execution will automatically start
	 * =========>THIS IS THE BASIC DESIGN
	 * 
	 * In order for all the above things to happen
	 * i) we need to download the NGRok proxy
	 *   google search for 'ngrok download'
	 *   
	 *   and download from this link 
	 *   ngrok.com/download
	 *   
	 *   select the respective OS download
	 *   --will give one .exe file inside a zip file, unzip and execute
	 *   
	 *   Sign up for the web url and take a token for authentication
	 *   --which needs to be used on the cmd prompt--before go to the ngrok.exe file
	 *   using cd and run the cmd given below from ngrok.com
	 *   ----
	 *   ngrok authtoken 1bMdGGghiIKKmlopSQ_78kGjqMSNOWERT
	 *   
	 *   for macos append ./ in the above cmd in the begining
	 *   
	 *   ----after the cmd is Run NGrok proxy will create a yml file
	 *   ====> the token is authenticated
	 *   now the next cmd is that
	 *    ngrok http 8080
	 *    
	 *    the moment u execute the above a black screen appears => proxy started
	 *    and is connected to the jenkins port 8080
	 *    
	 *    FORWARDING URL: is there on the black screen
	 *    ==> Url forwarding ===> this is the proxy url before the arrow
	 *    which is connected to the local host 8080
	 *    
	 *    COPY: the url before the arrow sign and go to the github repo --And
	 *    configure the webhook which is part of the github
	 *    ---where will be the webhook
	 *    Go to the projects repo on github-settings -- u will see webhooks option
	 *    on the left menu click on it to see the below written
	 *    -------
	 *    Webhooks allow external services to be notified when certain events happen
	 *    When the specified events happen we will send a POST request to each of the
	 *    urls you provide.
	 *    
	 *    ---what is the external service here? NGRok proxy
	 *    So we have to provide our NGrok proxy url here
	 *    --add webhook
	 *    --add authentication
	 *    give the pay load url--which is from the black screen before arrow-PASTE
	 *    DO NOT CLOSE THE BLACK SCREEN: otherwise proxy will be down
	 *    
	 *    after pasting the url append with--in the Payload Url field
	 *    
	 *    /github-webhook/
	 *   
	 *   content type would be
	 *   
	 *   application/x-www-form-urlencoded
	 *   
	 *   no secret we have
	 *   
	 *   turn on the radio btns for SSL verification and Just the push even
	 *   -----Click on ADD WEBHOOK
	 *   
	 *   then on jenkins DASH board
	 *   select chk box for github for SCM polling
	 *   
	 *   
	 *   HOW TO CREATE A PIPELINE ON JENKINS?
	 *   ===============>>>
	 *   Goto dashboard, click on Add, New item, select PIPE line option
	 *   give a name-give meaningful name append with PL
	 *   --in configuration tab
	 *   Description --write
	 *   Pipeline --write some script in the form of Declarative pipeline syntax
	 *   
	 *   
	 *   
	 *   DTO: data transfer object == POJO
	 *   What is Canary release??
	 *   ------only part of the appn is released OR only part of the appn is released
	 *   ===> region wise release to check the feed back, stability of the appn etc
	 *   What is AB testing?
	 *   ----we make some assumption and we test 
	 *   --Two different user journeys for the same appn--to decide which user flow
	 *   to select finally to be implemented in the appn
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
