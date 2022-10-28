package lectureprgz;

import java.io.*;

//Program to merge data from 2 Files into a 3rd File
public class Part13 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("ax.txt");
		FileReader fr1 = new FileReader(new File("abc.txt"));
		FileReader fr2 = new FileReader(new File("xyz.txt"));
		BufferedReader bw1 = new BufferedReader(fr1);
		String s1 = bw1.readLine();
		while (s1 != null) {
			pw.println(s1);
			s1 = bw1.readLine();
		}
		pw.flush();
		bw1.close();
		BufferedReader bw2 = new BufferedReader(fr2);
		String s2 = bw2.readLine();
		while (s2 != null) {
			pw.println(s2);
			s2 = bw2.readLine();
		}
		pw.flush();
		pw.close();
		bw2.close();
	}

}
