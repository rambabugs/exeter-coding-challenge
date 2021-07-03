import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class CSVReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File Inputfile = new File("C:\\Users\\ELCOT\\Downloads\\TranslateWordsChallenge\\t8.shakespeare.txt");
		File DictionarFile = new File("C:\\Users\\ELCOT\\Downloads\\TranslateWordsChallenge\\french_dictionary.csv");
		
		FileInputStream fis =  new FileInputStream(DictionarFile);
		FileInputStream InputFis =  new FileInputStream(Inputfile);
		
		byte [] data = new byte [(int) DictionarFile.length()];
		byte [] InputData = new byte [(int) Inputfile.length()];
		
		fis.read(data);
		
		InputFis.read(InputData);
		
		fis.close();
		
		String str = new String(data, "UTF-8");
		String InputString = new String(InputData, "UTF-8");
		
		String serchText;
		
		String [] splStr = str.split("\n"); 
		
		for(int i = 0; i< splStr.length;i++)
		{
			try
			{
				serchText = splStr[i];
				int start = str.indexOf(serchText) + serchText.length() + 1;
				
				
				
				int last = str.indexOf("\n", start);
				
				if (last < 0)
				{
					start = str.indexOf(serchText);
					last = start + serchText.length() + 1;
				}
				
				String FreshWoard = str.substring(start,last);
				
				InputString = InputString.replaceAll(serchText, FreshWoard);

			}
			
			catch(Exception e)
			{
					String ex = splStr[i];
			}
				

		}
		
				System.out.println(InputString);
		
	}

}