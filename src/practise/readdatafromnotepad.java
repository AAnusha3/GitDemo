package practise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readdatafromnotepad {
	public class ReadFile {

		public static void main(String[] args) throws IOException {

			// http://textfiles.com/100/captmidn.txt

			File file = new File("C:\\Users\\pavan\\Documents\\selenium.txt");
			Scanner scan = new Scanner(file);

			String fileContent = "";
			while (scan.hasNextLine()) {

				fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
			System.out.println(fileContent);
		}
	}
}
