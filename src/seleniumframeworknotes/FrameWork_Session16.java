package seleniumframeworknotes;

public class FrameWork_Session16 {
	
	/*
	 * How to create a pipeline prj on Jenkins dashboard??
	 * ==========================================>>>
	 * Add--select pipeline-give a name then OK
	 * -------give Description,give info in Pipeline section-in script field
	 * 
	 * SCRIPT: jenkins has its own scripting lang called Declarative syntax
	 * ===>that declarative script is written here, which will be used to
	 * create the PL
	 * ---Generally it is a template-that would be provided and we just need to
	 * update some fields in it accordingly
	 * 
	 * copy paste the script here in the script section
	 * 
	 * Apply N Save
	 * ------------now the PL prj is created --now click on Build Now
	 * 
	 * if we want to add more stages in the template we can add as well
	 * RUN the PL prj
	 * ---will see build#1 gotten created, open the build--whatever is written in
	 * the script, it will keep printing on the console-the shell script cmd echo
	 * part will be seen printed on the CONSOLE
	 * 
	 * Again click on the completed PL prj after the success mesge seen on console
	 * -----------will see the complete prj PL stages 
	 * --if in green it is a success
	 * THIS IS HOW U CAN CREATE A PL, AND THIS IS HOW U SEE DIFF STAGES OF ENVS EXEC
	 * ------------------------------------
	 * 
	 * Can chk the logs of each and every stage
	 * Can see the full view of the PL as well
	 * How much time it took for the exec of PL can be checked as well
	 * to add more stage--go to that particular PL name-hit configure tab -ADD SOME
	 * MORE STAGES in the script part
	 * 
	 * -----------------
	 * 
	 * DO YOU REALLY PREFER THE PL SYNTAX WRITTEN IN JENKINS??
	 * -------what if i cannot edit on the jenkins, to add more stages to the PL
	 * --it should be part of the source code
	 * ----copy that entire part from the script section of the PL from jenkins
	 * ====>come back to eclipse-->go to the relevant prj-->Go to root of the prj
	 * right click and create a file-->the filename should be given exact like this
	 * Jenkinsfile
	 * no extensions with dot for this file
	 * ----then paste the copied script on this file
	 * ---now if you want to add more stages--can add it here
	 * SAVE
	 * Then push the prj to master Branch on GiTHub
	 * =============>git push origin master
	 * 
	 * Now on Jenkins Dashboard-->go to the PL and in PipeLine-Pipeline Script section
	 * ----select the option
	 * 'Pipeline script from SCM'
	 * --select SCM name as Git
	 * --give the repository Url
	 * --give the jenkins file path in the Script Path section--it is directly available
	 * under the root of prj LIKE the pom.xml -- so do not need to give
	 * Just leave the name Jenkinsfile
	 * APPLY N CLOSE
	 * ---------------->>>build the prj one more time, now the pipeline syntaxx will
	 * come from the jenkins file from the root of prj-that is pushed onto Github
	 * 
	 * Whatever stages there in this file --will be executed
	 * 
	 * 
	 * WHAT IS CLASSIC PIPELINE??
	 * ----------Some old version of pipeline although this PL is getting created with
	 * the Jenkinsfile only
	 * 
	 * NOW JENKINS HAS INTRODUCED ONE MORE PL CALLED BO - blue ocean PipeLine
	 * -----a separate dashboard, new look and feel of it is created, from that Dash
	 * board, we can directly execute the PL also
	 * HOW TO ENABLE THAT BO DASHBOARD??
	 * ===========>>>go to Jenkins dashboard -->click on Manage Jenkins-click on Plugins
	 * section--click on Available Plugins and search for 'blue ocean'
	 *  when seen on the list of search --chk the chk box for it-->>>click install
	 *  ----will start downloading
	 *  
	 *  after it gets downloaded--go to any PL prj and click on it--in the Menu Tabs
	 *  ===>>>will see one more new Tab entry 
	 *  Open Blue Ocean
	 *  -------NOW U WILL SEE THE BO DASHBOARD FOR THE PL PRJ
	 *  
	 *  HOW TO CONFIGURE NGROK PROXY WITH PL FROM JENKINS DASHBOARD??
	 *  ==========>>>goto configure--chk the chk box for 
	 *  Github hook trigger for GIT SCm polling
	 *  APPLY N SAVE
	 *  --------------->>>the moment dev is pushing the code-automatically the Pl
	 *  gets triggered--can also configure to run the PL every 5mts whatever
	 *  
	 *  we have created the job, Pl and we are running the tc's on Jenkins machine only
	 *  ------------>>>>in that case we have to create a separate server since at org
	 *  level every one has access of jenkins --so running the tc's will launch the 
	 *  browser on the jenkins and will be also has to be seen by other people across
	 *  the Teams--so the best practice is to have a separate machine/server for QA
	 *  automations --since do not want the browser getting launched and all the 
	 *  navigations happening on the app by other members across diff teams at Org
	 *  ----SO CREATING A BROWSER LAB IS A GOOD IDEA--with the help of Selenium GRID
	 *  ---will create a custom Grid/Dockerized GRid--will create on hub server-which
	 *  will be connected to multiple browsers/all the diff browser servers of diff versions as well
	 *  --and will connect the hubserver with chrome nodes, edge nodes and ff nodes
	 * 
	 *  the topcasting option we have to use is
	 *  
	 *  WebDriver driver = new RemoteWebDriver()
	 *  and have to supply the desired capabilities....
	 *  
	 *  for local exec
	 *  WebDriver driver = new ChromeDriver()
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
