package lectureprgz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Part9 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("abc.txt"), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(120);
		bw.newLine();
		bw.write(new char[] { 66, 67, 68, 69, 90 });
		bw.newLine();
		bw.write(new char[] { 'Q', 'I', 'O', 'P' });
		bw.newLine();
		bw.write("A word");
		bw.flush();
		bw.close();
		// Whenever we close the bufferedwriter, it will automatically close the
		// underlying 'FileWriter' and it isn't required to
		// close it explicitly
	}

}
