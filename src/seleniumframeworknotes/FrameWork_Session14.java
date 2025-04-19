package seleniumframeworknotes;

public class FrameWork_Session14 {
	
	/*
	 * 
	 * So far we had designed the framework-added code and pushed the frame work to github
	 * --localmerge, remote merge, conflict, feature branch, master branch, PR...etc we have
	 * seen. Now the stable code is available in the master branch
	 * 
	 * Now it is time to set up the Jenkins Server, and create some jobs, pipelines on it that
	 * would pick the framework code from the Github using github url--so that we can run the
	 * testcases on jenkins
	 * 
	 * WHAT IS THE NEED OF THIS??
	 * -----------------------we cannot always run the tc's from local-like right clicking on
	 * testng.xml to execute
	 * 
	 * WHAT IS JENKINS??
	 * -----------------is a CICD(continuous integration and continuous delivery process) 
	 * tool, a kind of server which needs to be setup now
	 * with the JENKINS we can do multiple things, create the jobs, configuration, PL's
	 * BASIC SYSTEM ARCHITECTURE FOR JENKINS:==============in my blue folder-the diagram
	 * -----has several components
	 * src code, Master branch(githubRepo), Jenkins server which would be running on my 
	 * local host-port no 8080(my machines local host)
	 * ---to set it up you have to use the local machine n the port no: 8080
	 * --At the Org level --there is only one jenkins set up
	 * --in jenkins what will happen--it takes the code from github's master branch and it 
	 * will create its own work space and store the code taken from github url
	 * --NOW JENKINS CAN DO 2 THINGS=======>>>>>>>>>
	 * first: it will create/configure a job on jenkins server--which has info about
	 * second: we can create PL -which has build, development prj, automation prj or a
	 * separate automation PL can also be created-can be CICD/BO(Blue Ocean)
	 * ----couple of things we can do here like create a project-then can parameterize it,
	 * Schedule some polling to run the tc's every 10mts, or everyday at 5 am etc...timings
	 * ---can do some reporting also here by integrating either will extent/allure type of
	 * reporting/html-so jenkins can generate some automatic reports
	 * --- there are some features also available in jenkins which we will see
	 * WHEN YOU RUN THE TC'S AFTER CREATING A JOB ON JENKINS SERVER--Where exactly will be
	 * the BROWSER LAUNCH happening???
	 * =================>>>>>the browser will be launched on the same machine where jenkins
	 * server is installed--WILL THIS BE A PROBLEM AT ORG LEVEL
	 * SINCE JENKINS WILL BE A COMMON SERVER AT THE ORG LEVEL
	 * ----there will be many teams at the org level===>devops team, product management team,
	 * automation team, dev team--EVERY ONE IS USING THE SAME JENKINS SERVER AND SUDDENLY YOU
	 * RUN THE JOB AND IT WILL BE SEEN BY EVERY OTHER TEAMS MEMBERS---even if you are running
	 * the tc's in headless mode as well, you will be occupying some of the memory of jenkins
	 * server machine--so LAUNCHING THE BROWSER ON JENKINS SERVER --is not a good practice since
	 * it is common at organization level for all teams
	 * WHERE SHOULD THE BROWSER LAUNCH HAPPEN??--So it should happen on a different server LIKe
	 * a DOCKER/or may be on CLOUD/may be they will set up a diff server. 
	 * -------------------------------------------------------------how to set up a jenkins server
	 * and set it up to pick the tc's from github --we are going to see today====>>>>
	 * How to set up the AUTOTRIGGER feature on jenkins???===> the moment the code is checked in
	 * on to the GitHub--it will trigger the tc's automatically without any manual intervention
	 * 
	 * HOW DO YOU SET UP JENKINS??
	 * ------------------is absolutely open source, simply goto google and search the keyword
	 * 'download jenkins war file'
	 * go to the link https://get.jenkins.io/war-stable/
	 * 
	 *   download the version 2.440.3
	 *   ------------------------click on that to see jenkins.war file which is 89m
	 *   
	 *   once it is downloaded we will set it up using jenkins.war
	 *   WAR: Web Archival file
	 *   which is based on java technology 
	 *   JAR: is the bundle of multiple java files, WAR: is the bundle of multiple war files
	 *   
	 *   Since java is platform independent--same war file could be downloaded for any machine
	 *   whether windows/mac/linux
	 *   
	 *   JENKINS SET UP: Couple of things to take care of before this set up:
	 *   1.setup java 11 or 17 chk if JAVA_HOME is properly configured
	 *   2.maven
	 *   3.other config--LIKe for maven--chk MAVEN_HOME is properly configured
	 *   ---allure plugin,--html publisher:extent report, --testNG
	 *   SO WE HAVE TO DOWNLOAD PLUGINS FOR THESE SEPARATE CONFIGS
	 *   --choice parameter plugin => to parameterize the job, on which env to run the tcs,
	 *   on which browser to run the tc's,--will see about this feature directly on jenkins
	 *   -- which helps to decide which tc's we want to run
	 *   ---still other plugins are there
	 *   
	 *   =========Once the above set up is done we have to create a USER also
	 *   JENKINS: provides a proper user management also to create a USER
	 *   
	 *   go to the folder where jenkins download file is and RUN the cmd
	 *   java -jar jenkins.war
	 *   will get a temp pwd which need to be copied, and do not close the cmd prompt
	 *   
	 *   now open the google chrome and hit the port no:BY WRITing
	 *   local host: 8080
	 *   and paste the pwd copied when there is a prompt for it
	 *   
	 *   then proceed for further set up
	 * 
	 *   when you join any company-the company guy will create a username for you--BUT you
	 *   will not be given the Admin access-will get permissions for ur prj, u can configure for
	 *   ur pr j, u can access ur jenkins job for ur prj
	 *   
	 *   chk the status of JENKINS --still u plugins are downloading and running
	 *   ---------------once the set up is done--u have to create a user with some permissions
	 *   
	 *   ON JENKINS --Getting Started PAGE
	 *   -------Create First Admin User
	 *   --give the credentials on this page
	 *   --click save and continue, click start using jenkins
	 *   ===Now u get to see the Dashboard of JENKINS
	 *   Now we have to Manage Jenkins==> we have to download some other things
	 *   FIRST:
	 *   ----click on Tools Section,-JDK installations --click on ADd jdk
	 *   ---whatever JAVA_HOME path u have given in the system variable-here u have to write
	 *   the JAVA_HOME Value not up to the bin--paste it here
	 *   --Git Installation-we do not need
	 *   --Ant, Gradle we are not using
	 *   --Click on Add Maven-give any name
	 *   --Install Automatically ==> u can ask Jenkins to install automatically-it will not take
	 *   ur default or system MAVEN--whatever latest maven available in the market-it will down
	 *   load that
	 *   ---Click on install Automatically-Then Apply N Save
	 *   SECOND:
	 *   -----is that we have to click on Plugins, Available Plugins
	 *   where u see these are the default plugins/some plugins we have already downloaded when we
	 *   set up jenkins
	 *   --see installed plugins--these are the plugins already there when u downloaded JENKINS
	 *   
	 *   ==========Click on Available Plugins--the plugins we need now for Automation--we will
	 *   download that
	 *   i)maven integration plugin-click on install
	 *   one by one will see many chk marks -- can see the same on cmd prompt logs also
	 *   GO BACK TO AVAILABLE PLUGINS TO DOWN LOAD THE NEXT PLUGIN which would be testng
	 *   
	 *   ii)testng
	 *   click on results plugin also, install
	 *   GO BACK TO AVAILABLE PLUGINS TO DOWN LOAD THE NEXT PLUGIN which would be HTML Publisher
	 *   
	 *   iii)HTML Publisher
	 *   click on chk box, then click on install
	 *   
	 *   iv) next plugin to install is Allure
	 *   
	 *   NOW GO TO DASHBOARD AND CLICK ON NEW ITEM
	 *   ---------------------------------item means job/Pipeline
	 *   Give a name--then click on Maven project--then OK
	 *   then can write a Description
	 *   for Src Code Management--select Git
	 *   ---then give the github Repo Url
	 *   --Build
	 *   -------
	 *  Root POM is pom.xml
	 *  Goals n options: clean install
	 *  
	 * Post Build Actions:
	 * --------publish testng results, publish HTML reports-add-give dir name AS reports
	 * write Testng-results.xml 
	 * copy paste the html file name from the folder structure on eclipse
	 * 
	 *  click on publishing options-chk the chkBox for keep post HTML reports
	 *  
	 *  --now click on Allure report as well
	 *  it says
	 *  jenkins needs to know where your Allure CommandLine is installed
	 *  ------------->>>>for this we have to go to Tools config and 
	 *  
	 *  so right click on Global Tool Configuration Link that appears in blue font
	 *  ----open it in new tab
	 *  ---will see Allure Command Line installations--click on Add Allure command line
	 *  ---give a name as allure--click on save and continue--give path as allure-results
	 *  as seen in the folder tree on eclipse
	 *  
	 *  APPLY AND SAVE
	 *  -------------------to see the added configuration - click on configure--go thru
	 *  
	 *  NOW JUST NEED TO TRIGGER THE TEST CASES:
	 *  -------------------NOw jenkins will read the code from master branch as per seen in
	 *  the configure tab--creates it s own work space on JENKINS
	 *  --will download the files from github
	 *  --set up its own workspace
	 *  --and start interacting with the test cases, page classes etc
	 *  All you have to do is============>>>>>>>
	 *  
	 *  JUST CLICK ON JOB AND CLICK ON Build Now
	 *  =======================================>>>>when u hit build now
	 *  jenkins will read the pom.xml file-then download all the dependencies,u will see
	 *  on dashboard of the job-that maven life cycle has started, compiling the jobs,
	 *  with the help of sure fire plugin, running the tcs --browser will be launched 
	 *  Build is done -- now tries to generate the allure report
	 *  -------Overall build successfully executed
	 *  
	 *  TO MAKE THE REPORTS PROPER--colorful
	 *  -----------------------
	 *   open google and write
	 *   content security
	 *   --disable-content-security-policy
	 *   ====this is the plugin to display the css content
	 *   
	 * clean-install
	 * ------------makes jenkins go to Pom.xml--searches for the runner file=>testng.xml file
	 * from where the path to the tc's gets picked up
	 * 
	 * AND NOT FROM ECLIPSE ANY MORE
	 * 
	 * if u make some changes--need to push the code again into github master --from where the
	 * code gets picked up by jenkins again
	 * 
	 * BOTH ARE ALWAYS TOGETHER IN SINK: jenkins and Git work together
	 * 
	 * ---------in the job configuration--to give the env specification>>>>>>>>IMP>>>>>>>>>
	 * Build 
	 * =====
	 * in Goals and options---can give the cmds as
	 * 
	 * clean install -Denv="stage"
	 * clean install -Denv="prod"
	 * 
	 * instead of coming back every time and changing the env names--CAN WE PARAMETERIZE??????
	 * --------------------------there is one more option of downloading another plugin for this
	 * 
	 * Click on Manage jenkins
	 * click on plugins section
	 * Available plugins
	 * ------then search for choice parameter--click on extended choice parameter-install
	 * 
	 * Go to dashboard-click on configure-then u see option This prj is parameterized-click on
	 * that check box--then add whatever parameters--again select choice parameters--N GIVE the
	 * ENV names
	 * ---now remove hardcoded env name in the cmd
	 * 
	 * clean install -Denv="envName"
	 * 
	 * and instead write ***************************IMP IMP IMP******************
	 * clean install -Denv=${envName}
	 * 
	 * then click on Apply N Save
	 * ========NOW WHEN YOU TRIGGER UR JON--instead of Build now--Build with Parameters
	 * text seen on the Dashboard Menu
	 * 
	 * Again can configure for diff browser names as well
	 * then give the cmd
	 * clean install -Denv=${envName} -Dbrowser=${browserName}
	 * 
	 * n no of choice parameters can be done
	 * ----do not do for testng.xml file--can be done in the pipelines
	 * 
	 * to change the portno for jenkins to run:
	 * ==============cmd
	 * java -jar jenkins.war --httpPort=9090
	 * 
	 * by default port is 8080
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
