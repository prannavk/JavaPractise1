package lectureprgz;

import java.io.FileWriter;
import java.io.IOException;

public class Part5Prgb {

	public static void main(String[] args) throws IOException {
		FileWriter fw1 = new FileWriter("xyz.txt", true);
		fw1.write("\n");
		fw1.write(108);
		fw1.write("\nHello, How are you?\n");
		char[] arr = {71,72,73,74,75};
		fw1.write(arr);
		fw1.close();
		System.out.println("Changes added!");

	}

}
