package lectureprgz;

import java.io.*;
import java.io.IOException;

public class Part6Prgb {
	
	@SuppressWarnings("unused")
	private boolean b;
	
	public Part6Prgb(boolean b) {
		this.b = b;
	}
	
	public Part6Prgb() {
		this(false);
		//default public zero arguments constructor
	}
	public static void main(String[] args) throws IOException {
		System.out.println("The file contents:\n.....................\n");
		File f = new File("xyz.txt");
		FileReader fr = new FileReader(f);
		char[] cha = new char[(int)f.length()];
		fr.read(cha);
		for(char che : cha)
			System.out.print(che);
		fr.close();
		//System.out.println("\n\n.......................\nFile has: " + ic + " characters");
		Part6Prgb b = new Part6Prgb();
		b.giveMe1();
		b.givebyte();
		b.giveWrd();
	}
	
	public int giveMe1(){
		return 1;
	}
	
	public String giveWrd() {
		return "Word";
	}
	
	public byte givebyte() {
		return 0;
	}
}
