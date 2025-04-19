package builderpattern17;

//caller class
public class AppTest {

	//called method/user method
	public static void main(String[] args) {
		EcommApplication app = new EcommApplication();
		
		//builder pattern: method chaining
		app.login("simsim", "jujube@25")
		    .search("Apple macbook pro")
		     .addToCart("Apple macbook pro")
		      .payment("7171 8787 8888")
		       .getOrderId()
		        .logout();
		
		System.out.println("--------endfirstworkflow---------");
		
		//major advantage:can login with same un,pwd And search with diff params
		/**
		 * scenario: user does not like the search results
		 * can log out without doing other things - payment, addToCart ....
		 * 
		 */
		app.login("simsim", "jujube@25")
		    .search("tshirt", "black")
		      .logout();
		
		System.out.println("--------endsecondworkflow---------");
		/**
		 * Scenario: login and then log out
		 */
		app.login("simsim", "jujube@25")
		     .logout();
		System.out.println("--------endthirdworkflow---------");
		/**
		 * Scenario: user logged in and forgot to log out
		 */
         app.login("simsim", "jujube@25");
         System.out.println("--------endfourthworkflow---------");
         /**
          * Scenario: after sometime user realizes and tries to log out
          */
         app.logout();
         System.out.println("--------endfifthworkflow---------");
         /**
          * Scenario: user logs in, does several searches and logs
          * out without proceeding to the shopping cart
          */
         app.login("simsim", "jujube@25")
             .search("Apple macbook pro")
              .search("Iphone 14")
               .search("HP laptop", "white")
                .logout();
         System.out.println("--------endsixthworkflow---------");
         
	}

}
