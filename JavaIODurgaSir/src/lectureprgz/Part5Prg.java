package lectureprgz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Part5Prg {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Administrator\\Desktop\\DMC-022\\COREJAVALAB\\JavaIODurgaSir",
				"xyz.txt");	//If not present, will not create a physical file, will just represent name
		//f.createNewFile();
		FileWriter fw = new FileWriter(f);
		//If file not present, WILL CREATE a physical file
		fw.write("Hey, Big Man!");
		fw.flush();
		fw.close();
		System.out.println("number of characters in the file are: " + f.length());
		
	}

}
