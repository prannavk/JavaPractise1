package lectureprgz;

import java.io.File;

/*
 * A program to display all the names of all the files and sub-directories
 * in a given file directory along with the count of all of the names.
 * */

public class Part3Prg {

	public static void main(String[] args) throws Exception {
		int count = 0;
		int filecount = 0, dircount = 0;
		File f = new File("C:\\Users\\Administrator\\Desktop\\DMC-022\\COREJAVALAB\\JavaGUIpractise");
		String flist[] = f.list();
		System.out.println();
		for(String s : flist) {
			System.out.println(s);
			count++;
			File f1 = new File(f, s);
			if(f1.isFile())
				filecount++;
			else if(f1.isDirectory())
				dircount++;
			else
				System.out.println();
		}
		System.out.println("The Total Number of Files and Subdirectories Here: " + count);
		System.out.println("Total Number of files: " + filecount);
		System.out.println("Total Number of directories: " + dircount);

	}

}
