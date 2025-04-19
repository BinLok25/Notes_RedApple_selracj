package selenium;

public class WebDrWaitsAlertsTitleWinElesPollingTime23 {
	/**
	 * how to apply explicitly wait for non-webelements as well??
	 * 
	 * until(): method will change its behaviour asper the expected conditions
	 * 
	 * alerts, title, windows-wait can be handled only with explicit wait
	 * 
	 * Polling/Interval time concept:
	 * ---------
	 * for e.g launch any appln, create webDriver wait-give the timeout, sleeping time as well
	 *  if no sleep time is supplied-default time of 500ms will be supplied -i.e
	 *  called as interval time
	 *  
	 *  explicitly if user supplies sleep time -then it is sleep time
	 *  
	 *  never use thread.sleep()--only when implicit/explicit not working and in 
	 *  an emergency
	 * 
	 * 
	 * 
	 * 
	 * document.ready: state
	 * --3 states
	 * loading, interactive, complete
	 * 
	 * interact with the app -- only when document.ready == 'complete'
	 * 
	 * rt click inspect: search is gone
	 * ---------------->>>>
	 * i)open EventListener -- remove blur property
	 * 
	 * if blur is not there -- ii) soln put a debugger==>go to source
	 * and write below code
	 * setTimeout(()=>{
	 *    debugger ;
	 *    }
	 *    .5000)
	 *    
	 *    go to source -- new snippet-give a name and paste the above code, then rt click RUN
	 *    
	 *    and now when u interact with the ele -- inspect pop up will not disappear
	 * 
	 * 
	 *  desiredcapabilities -- deprecated
	 */

}
