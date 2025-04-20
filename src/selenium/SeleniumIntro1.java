package selenium;

public class SeleniumIntro1 {
	
	/*

	* we cannot write a single line of code without sel

	* how exactly sel works??

	* The timeLine that we see with sel

	*

	*

	* SELENIUM: is for automating browsers-web browser automation

	* -----just simulates user actions on the browser

	* ----it cannot validate any thing, so has to be used along with 3 rd pary libs like
	* testng + maven ....

	* ---is completely open source and free

	* ----the source code of sel is completely visible to everyone--so they can download

	* and customize it for their own purpose

	* ----it supports multiple browsers-egs: chrome, firefox, edge, brave, Tore, safari

	* ----it supports diff programming languages-java, python, Ruby, JS, Php, Perl, Go

	* ----sel is having its own Grid-it supports parallel run on the cloud,remote, AWS

	* server
	* COMPONENTS
	* 1. IDE: record n play
	* 2. Sel RC(sel 1): deprecated
	* 3. webdriver + selenium 1(RC): Selenium WebDriver(sel 2)
	* --sel 2(browser binary exe) --> sel 3(w3c + browser binary management) --> sel 4z(w3c) + sel manager
	* ---->> sel 5(w3c + webdriver Bidi)

	* 4.selGrid: fourth component --> RemoteWEbDRiver
	* to run ur script(wd 4) on remote machine: cloud, laptop/hw/machine, server,VM
	* 
	* local: developing: chrome
	* remote: grid + parallel run(chrome/firefox/edge)

	*

	*

	* SEL + Testng: can do validations plus user action simulation on browsers

	*

	* TESTERS: should use other external tools for validation==>

	* sel + testng---to test and do validations of user actions on browsers

	*

	* PROS:Advantages of Selenium

	* nav notes:Sel is======================>>>>>>IMP

	* 1.opensource + free

	* tools can be opensource and free--eg:selenium

	* some tools can just be free but not open source

	* eg: eclipse ==> eclipse source code not visible to every one

	* 2. supports multiple browsers:chrome, firefox, edge, brave, Tore, safari

	* 3. supports diff prog languages: Java, Python, Ruby, JS, Perl, Php, Go,C#

	* 4. Selenium is having its own GRID: supports parallel run on cloud, remote, AWS SErver

	* 5. W3CwebDriver protocols/standards
	* webApp(w3c) + Browser(w3c) + automationToolSelenium(sel WDriver - w3cwebdriver)
	* ========>is a deadly combination because of its compatibility
	* 99 percent of user action is simulated

	* 6. it supports various locators to find the eles on the page:xpath, css, linktext,

	* 7. wait mechanism: it is proven that sel wait is the best wait(no AutoWait mechanism)

	* appn(slow) -- script(wd) is not going to wait and throw exception

	* -custom wait: imp/exp wait /fluent wait

	* so we have to add the waits so sel waits for the appn to load

	* ==> we have to sink the appn with the script

	* 8. cross platform OR cross operating system:windows/macos/Linux

	* BUT sel doesnot support unix os

	* 9. it supports headless/headed mode

	* headless ==> no visualization

	*10. it is completely RAW library: u can customize as per ur reqment

	* u can create wrappers/generic fns on top of sel apis

	* u design according to ur own requirement==> create ur own utilities using generic fns

	*11. supports major unit testing frameworks:

	* Java: testng/Junit

	* C#: Nunit

	* Python: Pytest/unittest

	* Php: Phpunit

	*12. BDD: QA/Dev/PO -- plain eng/common lang requirement/features: Cucumber, RSspec, Jbehave

	* Cucumber is not a framework, it is a simple lib that supports BDD.

	*13.SELENIUM: it is super easy to integrate sel with the tools available in the market

	* integration with external tools/libs: other external lib

	*tomorrow if the user wants to generate logs -- can integrate with log4j

	*to write TC's --can integrate with testng

	*to achieve some Devops activities: some infrastructure set up --can use sel with jenkins to design

	*  Jenkins, CICD pipelines

	* to run the jobs on AWS cloud

	* to integrate with Maven-so i can generate the jar, fat jar files, so to do the deployment on Nexus

	* server

	* easy to integrate with GitLab, GitHub, etc..

	* you want to run the TC's from one machine to another machine--u can do it

	*to generate some fancy report --can integrate with reporting tools/libs like extent report etc...

	*14. only for functional testing - sel not made for non-functional testing(performance,
	* security...)

	*15. cross origin policy/cross domain navigation

	*sel supports cross origin policy/cross domain navigation-social links

	* ==> on one domain appn ---u will have links so as to go to some other domain appns

	* egs: from one appn:--u can go to other social websites like facebook, linkedin, youtube, instagram

	* 16.CDP: Chrome Dev protocols --with these we can do some testing

	* 17.shadow DOM/frames/svg/pseudo elements/ajax: yes

	*

	* CONS: Disadvantages of SEl:

	* what we cannot do with sel

	* 1. cannot automate windows/desktop/OS appns

	* 2. mobile apps: ios/android/ms --we need to use appium-appium internally uses sel

	* 3. performance testing: not recommended

	* 4. security testing: no

	* 5. hardware testing: bluetooth devices, raspberry devices, py devices cannot be automated

	* 6. captcha/bar code: no

	* you should never automate a captcha--since it is a violation

	* captchas are meant to block automation being done

	* you should ask the devs to remove the captcha so you can test the application

	* 7. OTP: no

	* 8.AI testing: no

	* 9.Accessibility testing: no

	* there are 90 % of the people who are physically impaired, they have to feel the appn and use it

	* eg: after 5 tabs on amazon appn, user reaches the search bar

	* need to integrate with external libs like DQ and then we can do it

	* 10. email/mail reader

	* 11. API testing: no

	* 12. read files: word/PDF: no

	* 100% automation is a myth

	* 13.images testing:no
	* ------>>there are always some scenarios which cannot be automated with the
	* particular automation tool- sel, python, ruby...etc and we have to bear with
	* that pain and automateNvalidate those manually

	* most of the time we do images testing -thru manual testing only

	* 14.UI testing: look and feel:limitations:alignments-no, spaces between two eles...

	* so avoid alignment related TC's

	* yes: fontsize, width, height, color

	* 15.integrate with DB: no --but can be done with lang(java)

	* 16.salesforce sf/ERP/:limitations

	* 17.Canvas: HTML 5: no...delphi: silverlight:no
	* sometimes there is a calculator-that is inside a canvas

	*

	* Web appn(23c) --chrome(w3c) --testing tool(selenium WD - w3cwebdriver)

	* Major ADvantage: browser is w3c standard, the tool(sel)=>WebDriver is w3c certified

	* and also the appn is w3c standard, WebDriver is w3c standard

	* ---the major advantage of this deadly combination is the COMPATIBILITY

	* --the user simulation--99 percent of it is exactly w3c standard
	* 
	* Jason Huggins: 2004 created sel at Thoughtworks
	* Shinya Kasatani:2006 created sel ide -sel RC - sel1
	* Simon Stewart: 2007 created webDriver
	* Patrick Lightbody: 2007 created selenium Grid
	* 
	* 4 components of sel: IDE, sel RC(sel 1)- totally deprecated,webDriver+sel 1(RC)->sel2
	* sel Grid(for remote execution)
	* sel 2 ---> started with sel 2 ---> sel 3(w3c+browserBinManagement)---> sel 4 --> sel 5(w3c+WD bidi)

	*

	* Introduction-to-Selenium-13.png

	* the opponent to sel is QTP(Mercury)

	* selenium RC --deprecated

	* 1.sel IDE --record n play tool

	* 2.sel RC --also called sel 1. deprecated

	* 3.webdriver + selenium 1(some features of RC):Selenium WebDriver(selenium 2)

	* --selenium 2-->selenium 3(w3c+browser binary management) ---> selenium 4(w3c) ---> selenium 5(w3c+webdriver Bidi)

	* 4.Selenium GRID (for remote execution of tc's)

	*

	*

	* what is the diff in sel 2 and sel 3??

	* From sel 3 - it became w3c standard + browser binary management)

	* until sel 2-the browser executable file need to be managed by the user

	* downloading it on to the local file system and then writing the path of the .exe

	* in the System.setProperty(webdriver.chrome.driver, "path to the exe file");

	*

	* can the script written interact with the browser without any intermediate server?? no

	* the intermediate component used until sel 2 JSON server/json wire protocol

	* the no.of intermediate browser servers needed were - 4(cd server,GDserver,edge,IE server)

	* for every browser--there is a separate browser server

	*

	* JSON wire protocol: means whenever any interaction to be done with the browser, i have to write

	* the code which gets converted to JSON form and is given to the server and then to the browser

	* upto sel 3.7 they were using json wire protocol

	*

	* from sel 3- the browser driver management was given to vendors(browser companies)

	* the browser companies also become w3c compatible

	* sel is not taking care of the browser management--given to vendors

	* sel 3(json wire protocol) became w3c from sel 3.8(w3c webdriver protocol)

	*

	* sel 4: sel 2 + sel 3 features + more new features

	* sel 4.6 onwards--they released SM => sel manager
	* --says u do not need to download browser binaries individually--the browser
	* vendors take care of this

	*

	* Google Search w3c and read about it

	* w3c: is a kind of platform,it is a kind of standar, it is a kind of protocol--which

	* is having all the guidelines

	*

	* GRID: what is Grid??

	* run ur script(written with sel wd 4.x) run it on the remote machine: cloud, laptop/hw/machine, server,

	* VM

	*

	* 2 types of executions: local, remote

	* remote exec: grid will come into pic along with the parallel run(diff browsers)

	*

	* local: developing: chrome

	* remote: grid + parallel run(chrome/firefox/edge)

	*

	* security testing: security means leakage of data, from payment history logs

	* is done from the backend : so backend is imp and not the UI

	* Proof of Concept (POC) is a broad technical term used in various industries. 
	* Teams and companies use a POC to prove that their idea works in real-world 
	* environments. A POC is crucial in the decision-making process because its 
	* results can be informative enough to point out potential issues before they
	* happen.

	* POC: 
	* design some basic frame work-with diff tc's of diff basic business work flows
	* design some basic TC's with diff work flows-on diff pages
	* after login, search, add to cart, reach to the payment page and then see that
	* is it navigating properly or not,is it really able to identify all the elements
	* properly or not
	* then integrate with basic frame work, create few classes, create page object
	* model for one page or two pages and finally generate the report
	* --PRESENT this poc to the customer/client
	* client is not technical-he doesnot care about the code
	* at the end of day-he will be interested in how many tc's and how many have been
	* passed/failed, how will u provide screen shot for the failure tc's
	* how will the customer know about the coverage==> the report plays a very imp
	* role in the POC
	* in POC cover some simple to complex lengthy tc's as well
	* 
	* proof of ROI is also very important-return of investment
	* 
	* custom grids: selenoid, docker grid, browser lab on AWS
	* 
	* problem with safari - does not allow docker images
	* home page, login page, add to cart, 

	* and then integrate with basic frame work and then generate the report

	* show it to the client

	* mention the limitations of the tool:

	* what cannot be automated, in scope and out of scope

	* 60% coverage is also kind of good automation

	*

	* ROI:return of investment

	*

	* the code is really testing the appn and finding the bugs or not

	*

	* custom grids: selenoid, docker grid, browser lab on AWS

	* In the context of testing, "POC" usually refers to **Proof of Concept**. Here’s a detailed explanation of what it entails:

### Proof of Concept (POC) in Testing

1. **Purpose**: A Proof of Concept in testing is primarily used to validate the feasibility of a particular approach, idea, or technology before committing to a full-scale development or testing process. It helps to demonstrate that a concept or theory can be realized in practice.

2. **Scope**:
   - A POC is often a small project or prototype that helps to confirm whether certain functionalities can be implemented as intended.
   - It typically focuses on specific aspects of a project rather than the entire system.

3. **Benefits**:
   - **Risk Reduction**: By identifying potential challenges at an early stage, teams can mitigate risks associated with the main project.
   - **Cost Efficiency**: Investing time and resources in a POC can save significant costs later by preventing commitment to an approach that may not work.
   - **Informed Decision-Making**: Stakeholders can see tangible results from the POC, leading to more informed decisions regarding resource allocation and project direction.

4. **Testing Context**:
   - In software development, a POC might involve testing a new framework, library, or tool to ensure it meets the project’s needs. For example, a development team might create a simple application using a new cloud service to validate its performance, security, and integration capabilities.
   - In QA (Quality Assurance) testing, a POC could also be about testing a specific test automation tool to evaluate whether it can effectively integrate with existing systems or work within the desired parameters.

5. **Key Components**:
   - **Clear Objectives**: Establish specific goals for what you want to demonstrate with the POC.
   - **Resource Allocation**: Determine the resources needed (time, personnel, technology) to carry out the POC.
   - **Evaluation Criteria**: Define metrics or criteria for success to evaluate the results of the POC.

### Example in Software Testing:
Suppose a company wants to incorporate artificial intelligence (AI) into its software testing process. Before fully integrating an AI testing tool, the team might create a POC where they apply the tool to a small portion of their codebase to evaluate its ability to identify bugs and improve testing efficiency. The outcomes would help them decide whether to adopt the AI tool across their entire testing process.

In summary, a POC in testing is a critical step that allows teams to validate concepts, technology, or methodologies before scaling up efforts, ensuring that they are on the right path towards achieving their goals. If you need more specific details or examples, feel free to ask!
	*
	*
	*	WHAT IS KPI in testing context??
	*
	*	In the context of testing, **KPI** stands for **Key Performance Indicator**. KPIs are measurable values that demonstrate how effectively a team, project, or organization is achieving key objectives. In the realm of testing (particularly software testing), KPIs are used to evaluate the success of the testing process and overall software quality. 

### Common KPIs in Testing:

1. **Defect Density**:
   - Measures the number of defects identified in a software component relative to its size (usually per KLOC - thousand lines of code). A lower defect density indicates higher quality.

2. **Test Coverage**:
   - Indicates the percentage of requirements, code, or functionality that has been tested. Higher test coverage suggests a more thorough testing process.

3. **Test Execution Progress**:
   - Tracks the percentage of test cases that have been executed compared to the total number of planned test cases. This helps gauge how much of the testing effort has been completed.

4. **Defect Resolution Time**:
   - Measures the average time taken to resolve reported defects. Shorter resolution times can signify an efficient development and testing process.

5. **Test Pass Rate**:
   - The percentage of test cases that pass during testing. This KPI helps assess overall product quality and readiness for release.

6. **Automated Test Coverage**:
   - Indicates the proportion of tests that are automated compared to the total number of tests. Increased automation can enhance testing efficiency and speed.

7. **Production Defects**:
   - The number of defects reported by users after the software is released. A lower number of production defects typically reflects a more effective testing process.

8. **Cost of Defect**:
   - Measures the cost associated with identifying and fixing defects. This includes the cost of development, testing, and any impact on user satisfaction.

### Importance of KPIs in Testing:

- **Performance Measurement**: KPIs facilitate the measurement of the testing team's effectiveness and efficiency.
- **Decision Making**: By analyzing KPIs, stakeholders can make informed decisions about resource allocation, project timelines, and potential improvements.
- **Continuous Improvement**: Monitoring KPIs helps identify areas for improvement in the testing process, leading to enhanced quality and productivity over time.
- **Stakeholder Communication**: KPIs provide quantifiable data that can be communicated to stakeholders, ensuring transparency and alignment with project goals.

### Conclusion:

Using KPIs in testing helps teams not only assess their current performance but also set targets for improvement, ensuring that the testing process is aligned with overall business objectives. By selecting the right KPIs for their specific context, teams can enhance the quality of their software products and the efficiency of their testing processes. If you have specific interests or need examples related to certain KPIs in a particular testing context, feel free to ask!
	*
	*
	*

	*/

}
