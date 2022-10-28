package lectureprgz;

import java.io.*;

public class Part14b {

	public static void main(String[] args) throws IOException {
		File f = new File("Hew.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		if (br.readLine() == null)
			System.out.println("File is Empty");
		br.close();
		// Note: This program when run, throws java.io.FileNotFoundException: Hew.txt
		// i.e. (The system cannot find the file specified)

	}

}
