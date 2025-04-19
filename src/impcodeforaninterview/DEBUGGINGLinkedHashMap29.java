package impcodeforaninterview;

import java.util.LinkedHashMap;

public class DEBUGGINGLinkedHashMap29 {

	public static void main(String[] args) {
		//it maintains the insertion order
		LinkedHashMap<String, String> newEmpdata = new LinkedHashMap<String, String>();
		
		newEmpdata.put("Geetha", "Manager");
		newEmpdata.put("Peetha", "QA");
		newEmpdata.put("Seetha", "Lead");
		newEmpdata.put("Rita", "LeadAutomation");
		newEmpdata.put("Anitha", "ProjectManager");
		newEmpdata.put("Kavitha", "Tester");
		
		System.out.println(newEmpdata);//proof to say it maintains insertion order
		//{Geetha=Manager, Peetha=QA, Seetha=Lead, Rita=LeadAutomation, Anitha=ProjectManager, Kavitha=Tester}
	}

}
