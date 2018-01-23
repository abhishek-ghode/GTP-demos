import java.io.FileOutputStream;
import java.io.IOException;

import comc.g.IOUtils;

public class Entry3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fOut = new FileOutputStream("test.ser");
		
		IOUtils.writeAPersonIntoStream(fOut);
		
		System.out.println("end of main()...");
	}
}
