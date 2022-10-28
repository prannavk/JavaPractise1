package lectureprgz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Part11 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println();
		pw.write(100);
		pw.print(100);
		pw.println(100);
		pw.print(pw);
		pw.append((char) 120);
		pw.flush();
		pw.close();

	}

}
