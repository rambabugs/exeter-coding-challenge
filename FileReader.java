import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ELCOT\\Downloads\\TranslateWordsChallenge\\t8.shakespeare.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		
	}

}
