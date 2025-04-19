package seleniumframeworknotes;

public class LastSessionPaginationWebTableNCalendar {
	/**
	 * 
	 * How to handle Pagination-single selection??
	 * casei)used case scenario:
	 * element is there on first page
	 * no need to click on next btn
	 * while(true){} --creating infinite loop
	 * if u click on disable btn-nothing will happen and no exception thrown
	 * 
	 * 
	 * caseii) element is there on some page
	 * if ele is not there keep clicking on next btn
	 * if clicked next 2 times==>ele is there on 3rd page
	 * if not sure where the ele is-keep clicking next btn
	 * Use while loop since not sure of how many iterations
	 * 
	 * 
	 * 
	 * caseiii) element is not there at all==>not available
	 * keep clicking on next btn until pagination is over--then confirm that
	 * element not available
	 * 
	 * 
	 * 
	 * 
	 * 
	 * How to handle Pagination-multi selection??
	 * 
	 * 
	 * 
	 */

}
