package lectureprgz;

import java.io.*;

public class Part7 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("xyz.txt");
		System.out.println("Printing file contents \nusing 1st method:\n..........................\n");
		FileReader fr1 = new FileReader(f1);
		int c = fr1.read();
		while(c != -1) {
			System.out.print((char)c);
			c = fr1.read();
		}
		fr1.close();
		System.out.println("\n.....................\nusing 2nd method:\n");
		FileReader fr2 = new FileReader(f1);
		char ch[] = new char[(int)f1.length()];
		int co = fr2.read(ch);
		for(char chi : ch) {
			System.out.print(chi);
		}
		System.out.println("\nNumber of characters in this file: " + co);
		fr2.close();

	}

}
