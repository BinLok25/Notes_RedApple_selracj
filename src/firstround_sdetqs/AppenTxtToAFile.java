package firstround_sdetqs;

import java.io.FileWriter;
import java.io.IOException;

public class AppenTxtToAFile {
	//a java program to append text to a file
	public static void main(String[] args) {
        String path = "./src/file.txt";
        String text = "Append new text";
        try (
        		
        		FileWriter fw = new FileWriter(path, true); ){
            fw.write(text);
        }
        catch(IOException e) {
          e.printStackTrace();
}
        }

}
