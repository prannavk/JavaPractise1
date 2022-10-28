package lectureprgz;

import java.io.*;

public class Part17 {

	public static void main(String[] args) throws IOException {
		File parentDir = new File(
				"C:\\Users\\Administrator\\Desktop\\DMC-022\\COREJAVALAB\\JavaIODurgaSir\\BunchOfFiles");
		File opFile = new File(parentDir, "OUTPUT.txt");
		FileWriter outputFile = new FileWriter(opFile);
		File inputFile = new File(parentDir, "INPUT.txt");
		PrintWriter pw = new PrintWriter(outputFile);
		BufferedReader brm = new BufferedReader(new FileReader(inputFile));
		String aLine = brm.readLine();
		while (aLine != null) {
			boolean available = false;
			BufferedReader bro = new BufferedReader(new FileReader(opFile));
			String bLine = bro.readLine();
			while (bLine != null) {
				if (aLine.equals(bLine)) {
					available = true;
					break;
				}
				bLine = bro.readLine();
			}
			bro.close();

			if (available == false) {
				//pw.write(aLine);
				pw.println(aLine);
				pw.println(" ");
				pw.flush();
			}

			aLine = brm.readLine();
		}

		pw.close();
		brm.close();
	}

}
