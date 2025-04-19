package learnmaven_buildtool5;

public class AllAboutMvn {
	
	/*
	 * SESSION:1
	 * What is Maven?
	 * Maven Set up
	 * Maven life cycle
	 * Maven Dependencies
	 * Maven Plugins
	 * Maven Commands:
	 * ----i)Run from Eclipse
	 * ---ii)Run from Command Line
	 * =================================
	 * 
	 * What is Maven?
	 * --is a build automation tool which generates a build
	 * --Mvn interacts with the centralized repo which is GLOBAL
	 * --which has a pom.xml file-which gets all tech dependencies taken from MvnRepo
	 * Dependency: has 3 tagnames: artifactid, groupid and version no;
	 * --Mvn Repo: is a centralized repo/lib--wherein all diff versions required for all
	 * types of technologies like Sel, Tesng, Cucumber, ...is stored
	 * so it is flexible to change the versions direct in the pom.xml file which takes
	 * care of getting those dependencies uploaded from Mvn repo
	 * ====All you have to do is update the project, after changing the version no of
	 * dependency OR you add new dependency
	 * Sometime you have to do Maven-clean as well to clean the removed prj dependencies
	 * ---all the dependencies get stored in the hidden repository on your local: .m2
	 * --from .m2 it is given to your prj on eclipse
	 * 
	 * SESSION:2
	 * ===========
	 * how to set up Maven?
	 * follow the website mkyong.com
	 * --------------
	 * i)Download jdk and set its path in Environment variables
	 * ii)then download Maven
	 * iii) create the M2_home
	 * iv)restart the laptop -open cmd and type maven version
	 * 
	 * v) maven plugin for eclipse--by default already available in new versions of 
	 * eclipse ide
	 * 
	 * IQ] WHAT IS MAVEN LIFE CYCLE? other egs: Ant, Gradle
	 * --is a complete build tool
	 * --is build automation tool, has 3 life cycles
	 * i] compile
	 * ==> whatever java classes are available--compile in single shot
	 * done by Maven compiler plugin
	 * ii] maven test
	 * whatever test classes are written whether Unit test cases, Integration test cases
	 * Functional test cases--happening with the help of Maven Sure Fire plugin
	 * iii]maven resources or generate jar files
	 * Once compilation of test cases/classes, now to compile the resources-jar files
	 * (3 types, JAR/WAR/EAR)
	 * java archive files, Web archival files, Enterprise archival files
	 * ---happens with the help of maven resources plugin
	 * 
	 * HOW TO SET UP MAVEN PROJECT IN ECLIPSE??
	 * File-->Maven prj--next--next--give artifact id, groupid, 
	 * src/main/java
	 * src/test/java--scope should be compile for testng dependency
	 * --delete the default pkgs created and create ur own
	 * pom.xml --->>>is the heart of maven project since all interactions happen thru
	 * this file
	 * 
	 * pom.xml ==>project object model
	 * 
	 * rightclick-->mavenbuild--clean install
	 * testng kind of tc's written in src/test/java
	 * 
	 * TC's inside the maven prj can be executed in 3 ways
	 * =============
	 * i) from testng class--right click run as testng
	 * ii) to run the prj from cmd prompt--navigate to the dir where the prj is there
	 * ---open cmd
	 * mvn clean install==========1
	 * ===>will create the build/jar files
	 * iii) to execute tc's without clean install
	 * mvn test
	 * ===========2
	 * iv) to just generate the build without exec tc's
	 * mvn package -DskipTests
	 * ====================3
	 * --to do the same there is another cmd BUT should be appended with this property
	 * in the pom.xml file
	 * 
	 * <properties>
	 *    <project.build.sourcecoding-UTF-8></project.build.sourcecoding>
	 *    <maven.test.skip=true></maven.test.skip>
	 * </properties>
	 * 
	 * and then write cmd
	 * 
	 * mvn package -Dmaven.skip.test=true
	 * ==========================4
	 * 
	 * used case: for above command
	 * the dev's have written many-500 unit tc's and they do not want to execute
	 * the tc's but chk the build is stable or not 
	 * ---but not a good idea to skip unit level tc's
	 * 
	 * v)to select the particular tc's to be executed
	 * ------>>>>>we need to create testng.xml file==>TESTNG.xml should be configured
	 * in src/test/resources
	 * in the testng.xml file -- you will write all packages
	 * BUT FOR THIS 3 PLUGINS MUST BE ADDED INSIDE THE PLUGIN TAG
	 * ------maven compiler plugin, maven surefire, maven source plugin
	 * 
	 * IQ]WHAT IS THE ROLE OF COMPILER PLUGIN, SUREFIRE PLUGIN AND RESOURCES PLUGIN?
	 * 
	 * maven compiler plugin: to compile the tc's
	 * maven surefire plugin: to run the tc's which has the path to the testng.xml
	 * maven resources plugin: to package the jar files
	 * 
	 * GOOD PRACTICE: to execute the tc's from cmd prompt
	 * 
	 * SESSION:3
	 * ==========
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
