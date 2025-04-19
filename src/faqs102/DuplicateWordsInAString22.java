package faqs102;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInAString22 {
	//Hey java is java best language is java
	//java:3
	//is: 2
	public static void main(String[] args) {
//		findDuplicateWords("Hey java is java best language is java");	
		findDuplicateWords("bin bin binka Auto Group is not the best still is");

	}
	
	//generic util fn to do this task:
	public static void findDuplicateWords(String inputStr) {
		//split:
		String words[] = inputStr.split(" ");
		
		//create one hashmap:
	HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
	
	//to chk each word in given array:
	for(String e : words) {
		
		//if word is present:
		if(wordCount.containsKey(e)) {
			wordCount.put(e.toLowerCase(), wordCount.get(e)+1);
		}
		else {
			wordCount.put(e, 1);
		}
	}
	//extracting all the keys of map - wordCount:
		Set<String> wordsInString = wordCount.keySet();
		
		//loop thru all the words in string:
		for(String e: wordsInString) {
			if(wordCount.get(e)>1) {
	System.out.println(e + " : "+wordCount.get(e));
			}
		}

	
}
	
}
