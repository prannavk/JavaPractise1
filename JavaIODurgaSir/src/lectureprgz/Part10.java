package lectureprgz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Part10 {

	public static void main(String[] args) throws IOException {
		System.out.println("File contents: \n.........................\n");
		FileReader fr = new FileReader(new File("abc.txt"));
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		System.out.println("\n.........................");
		br.close();

	}

}
