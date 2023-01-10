import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class employee
{
	public static void main(String[] args)
	{
		try {
			FileReader fr = new FileReader("file:///Users/brundha/Downloads/employees.txt");
			int i;
			while ((i = fr.read()) == "DEV" && i!=-1) { 
        FileWriter fw = new FileWriter("file:///Users/brundha/Downloads/DEV.txt");
        String NAME=FIRST_NAME.concat(LAST_NAME); 
				// Storing every character in the string
        String str = "";
				str += (char)i;
			}                         
      fw.write(str);
      fw.close();
      while ((i = fr.read()) == "QA" && i!=-1) {
        FileWriter fw1 = new FileWriter("file:///Users/brundha/Downloads/QA.txt");
        //concatenation
        String NAME=FIRST_NAME.concat(LAST_NAME);
				// Storing every character in the string
        String str1 = "";
				str1 += (char)i;
			} 
			// Writing above string data to
			// FileWriter object
      fw1.write(str);
      fw1.close();
      fr.close();
			System.out.println("File reading and writing both done");
		}

		catch (IOException e) {
			System.out.println("There are some IOException");
      e.printStackTrace();
		}
	}
}




