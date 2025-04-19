package seleniumframeworknotes;

public class POM_11_GIT_SetUp {
	
	/**
	 * To Show case the work: Git URL is easy and convenient
	 * 4 components: Need to be understood to understand Git Architecture
	 * src code/working directory/IDE--LOcal
	 * stage/index
	 * localRepoArea
	 * _______________________________________________division
	 * RemoteRepoOnGitHub.com--Remote
	 * 
	 * 
	 * on remote sides -branch master/main available-can be called either
	 * 
	 * 
	 * 
	 * 
	 * Push/Pull: comes into picture because of local(3components) vs remote(onlyone)
	 * 
	 * To push code from local to remote:
	 * 
	 * to make it known that Git is being used for a particular prj--Git needs to be 
	 * initialized at the prj level on IDE-1. git init
	 * make the connection between local and remote
	 * 2.git remote add origin <url>
	 * 3.git add .
	 * 4.git commit -m "reason"
	 * 
	 * Git: is a version control system to keep track of changes
	 * GitHub: is a website where in we can host our repositories
	 * 5.git push origin master
	 * 
	 * To get the code from remote to local: fetch
	 * 
	 * binduk@binduks-Air ~ % git --version
git version 2.15.0
binduk@binduks-Air ~ % git config --global user.name Belabai@24
binduk@binduks-Air ~ % git config --global user.email bkarnam18@gmail.com
binduk@binduks-Air ~ % git config --get user.name
Belabai@24
binduk@binduks-Air ~ % git config --get user.email
bkarnam18@gmail.com
	 * 
	 * .gitignore file: is added to the prj- rt click-new ->create normal file
	 * and add the template contents and save
	 * --it restricts from adding unnecessary files to the prj on remote(gitHub)
	 * 
	 * git status: green color->indicates added to the staging area
	 * red--> indicates not yet added
	 * 
	 * commit: means moving the code from staging area to the local repo
	 * push: means moving the code from local to the remote repo on github
	 * 
	 * ACCT: after the creation of acct for first time on github-user needs to authenticate
	 * with username=>email id used
	 * to create auth token--go to ur profile on ur github acct--under ur settings-->go to
	 * developers settings--->then personal access token-->token classic->generate the 
	 * token--select never expire and give all checkboxes for permissions
	 * SSH --> not anymore since deprecated
	 * 
	 * create an account and then create some repository-which is public=>
	 * everyone can access it
	 * private repo => only creator/user can use it not outsiders
	 * ls -alt on bash will show .git hidden file
	 * .git ===> hidden file
	 * 
	 * only first time cmds after creating repo: on remote side
	 * 1. git init
	 * => creates one .git folder-ls -alt will show it in the list
	 * ==>in the local machine ==> creates a master repo on the local side on the system as well
	 * 
	 * 2. git remote add origin <url>
	 * ==> creates connection of the local(master) with the remote master
	 * 
	 * to not add unnecessary folders req for local execution - allure, target, screenshots ..etc
	 * add .gitignore file on the local project-GOOD PRACTICE
	 * --right on ur project add a file and give the name .gitignore N add
	 * the template file
	 * not seen normally- to view this file ctrl/cmd + shift + R and write
	 * .gitignore in the popup search
	 * 
	 * 3. git add .
	 *    to chk the mesge on bash about what happened currently - git status
	 *    ==> staging/index area
	 *    
	 * 4. git commit -m "reason for the commit"
	 *    to chk the mesge - git status => gives current state of files
	 *    -m => option to give reason
	 *    
	 *    => commits the code to the local repository(master) of the machine
	 *    ==> local repo also has a master and code is pointing to it
	 * 
	 * 5. git push origin master
	 *  ==> to do this for first time it will ask for authentication 
	 *  ===> enter username and password/token(PAT)
	 *  
	 *     best practice always provide PAT instead of password
	 *     how to create PAT
	 *     ----->>>got to the remote github profile -- dev settings--Pats
	 *     personal access token -- select classic -- no expiry--select ALL
	 *     chk boxes for permissions and GENERATE and save it safely
	 *    
	 * 
	 * CLONE: getting code from remote repo into the local repository on to 
	 * the users system
	 * 
	 * 
	 */

}
