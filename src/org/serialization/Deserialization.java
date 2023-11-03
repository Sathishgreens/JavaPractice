package org.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace"
				+ "\\JavaAdvanced\\Resources\\obj.txt");
		
		FileInputStream stream = new FileInputStream(file);
		ObjectInputStream inputStream = new ObjectInputStream(stream);
		
		Sample readObject = (Sample) inputStream.readObject();
		
		System.out.println(readObject.a);
		
	}

}
