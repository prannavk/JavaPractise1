package lectureprgz;

import java.io.*;

public class Part14 {

	public static void main(String[] args) throws IOException {
		FileWriter fwi = new FileWriter("LBLfile.txt", true);
		PrintWriter pw = new PrintWriter(fwi);
		BufferedReader br1 = new BufferedReader(new FileReader("AB.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("NOS.txt"));
		String f1l1 = br1.readLine();
		String f2l2 = br2.readLine();
		while((f1l1 != null) || (f2l2 != null)) {
			if(f1l1 != null) {
				pw.println(f1l1);
				f1l1 = br1.readLine();
			}
			if(f2l2 != null) {
				pw.println(f2l2);
				f2l2 = br2.readLine();
			}
		}
		br1.close();
		br2.close();
		pw.close();

	}

}
