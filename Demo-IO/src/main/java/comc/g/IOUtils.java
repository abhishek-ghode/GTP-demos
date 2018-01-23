package comc.g;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;

public class IOUtils {
	public static void writePrimitives(OutputStream oStream) throws IOException{
		
//		try-finally block
		
		DataOutputStream dOut = new DataOutputStream(oStream);
		
		try{
			if(dOut != null){
				dOut.writeDouble(3.14f);
				dOut.writeBoolean(false);
				dOut.writeLong(1L);
				dOut.writeInt(1);
			}
		}finally{
			if(dOut != null)
				dOut.close();
		}
		
	}
	
	public static void readPrimitives(InputStream in){
		
//		try with resources		
		
		
	}

	public static void readChars() throws IOException{
		
		String fileName = "test.txt";
		FileReader in = new FileReader(fileName);
		
		do{
			
			int ch = in.read();
			
			if(ch == -1)
				break;
			
			System.out.print((char)ch);
			
		}while(true);
		
		
	}
	
	static public void writeAPersonIntoStream(OutputStream oStream) throws IOException{
		
		ObjectOutputStream out = new ObjectOutputStream(oStream);
		
		Person person = new Person();
		person.setAge(28);
		person.setName("Vicky");
		
		try {
			if(out != null)
				out.writeObject(person);
		} finally {
			// TODO: handle finally clause
			if(out != null)
				out.close();
		}
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
