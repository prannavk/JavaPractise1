package lectureprgz;

import java.io.*;

//Program to print number of lines in each file
public class Part17b {

	public static void main(String[] args) throws IOException {
		File parentDir = new File(
				"C:\\Users\\Administrator\\Desktop\\DMC-022\\COREJAVALAB\\JavaIODurgaSir\\BunchOfFiles");
		String fileName[] = parentDir.list();
//		FileWriter fww = new FileWriter(new File(parentDir, "AllFileInfo"));
//		BufferedWriter bwf = new BufferedWriter(fww);
//		bwf.write("Information on files in this folder");
//		bwf.newLine();
//		bwf.write("File names and Number of Lines\n");
//		bwf.newLine();
		for (String name : fileName) {
			int lineCount = 0;
			BufferedReader bro = new BufferedReader(new FileReader(name));
			String iLine = bro.readLine();
			while (iLine != null) {
				lineCount++;
				iLine = bro.readLine();
			}
			bro.close();
			System.out.println(fileName + " has " + lineCount + " lines.");
//			StringBuffer outputLine = new StringBuffer();
//			outputLine.append(fileName + " has " + lineCount + " lines.");
//			bwf.write(outputLine.toString());
		}
//		bwf.close();

	}

}
