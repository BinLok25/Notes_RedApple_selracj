package exceptionhandling24;

public class ThrowKW25 {

	public static void main(String[] args) {
		
		String data = null;
		
		try {
		if(data == null) {
			throw new Exception("DATA NOT FOUND");
		}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
