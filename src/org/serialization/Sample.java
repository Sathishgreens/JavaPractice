package org.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sample implements Serializable{
	
	int a ;
	String s;
	
	private void ssd(int a, String s) {
		this.a=a;
		this.s=s;
	}
	public static void main(String[] args) throws IOException {
		
		Sample sample = new Sample();
		sample.ssd(9, "ssss");
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace"
				+ "\\JavaAdvanced\\Resources\\obj.txt");
		FileOutputStream stream = new FileOutputStream(file);
		ObjectOutputStream outputStream = new ObjectOutputStream(stream);
		outputStream.writeObject(sample);
	
	}

}
