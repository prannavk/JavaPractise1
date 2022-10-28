package lectureprgz;

import java.io.*;

public class Part15 {

	public static void main(String[] args) throws IOException {
		File parentDir = new File(
				"C:\\Users\\Administrator\\Desktop\\DMC-022\\COREJAVALAB\\JavaIODurgaSir\\BunchOfFiles");
		File tgtFile = new File(parentDir, "ALLFILESCONTENT.txt");
		PrintWriter pw = new PrintWriter(tgtFile);
		String[] listNames = parentDir.list();
		for (String s1 : listNames) {
			FileReader fr = new FileReader(new File(parentDir, s1));
			BufferedReader br = new BufferedReader(fr);
			String aLine = br.readLine();
			while (aLine != null) {
				pw.println(aLine);
				aLine = br.readLine();
			}
			pw.write("----------------------------------------------------------");
			br.close();
		}
		pw.close();
	}

}
