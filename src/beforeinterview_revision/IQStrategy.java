package beforeinterview_revision;

public class IQStrategy {
	
	/**
	 * 
	 * 1) How does your code run as part of CI and what is your CI strategy?

We have two different automated suits we run as part of the CI process.

First is a smoke suit. We maintain a small set of critical tests which we run for every release in the
 Dev environment (for every change) to make sure new changes will not break core features and have 
 quick feedback. This Jenkins job is part of the development pipeline and triggered after the Dev 
 environment deployment.

Second, is the regression suit with all our automated tests. We run this suit in Jenkins manually 
against the Test environment before each release as part of the regression test execution.

2) What’s a singleton pattern and why do you need to use it in your framework?

Singleton is a creational design pattern that lets you ensure that a class has only one instance while 
providing a global access point to this instance.
We need a singleton to have one instance of Driver during the execution.

Read more about SingleTon Pattern here: https://lnkd.in/gm_yXwgF


3) How do you calculate ROI for Test Automation?
To calculate Automation ROI first you need to calculate the Manual Execution time of your test case. 
This value can be updated in your Test Management Tool.

You can use the formula to calculate ROI:
Time Saved by Automation = Manual Execution Time - Automation Execution Time

Automation ROI = Time Saved by Automation / Investment
Investment = time required to build frameworks + maintenance cost + (time to code one tests X number 
of tests)

4) Explain the challenges you faced while designing Framework?

Trying to share a scenario while you were automating stuff, would add value here, but if you still want
 a reference use below:

You are working on some service API testing and you are unable to perform the automation as you don't 
have access to some component, in that you can come up with an idea to create a mocking service 
integrated to your framework

OR

There is a banking application which is session based, after it detects inactivity the user is 
logged out or within a fixed session time. But we have certain number of scenarios which we needed 
to test before the application is logged out.


Pro-Tip: Use these questions to evaluate your projects or experience and prepare some cross-questioning
 as well for better performance.
	 * 
	 * 
	 */

}
