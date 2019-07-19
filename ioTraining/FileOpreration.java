package ioTraining;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOpreration {
	public static void main(String[] args) throws IOException {
		File f = new File("Hello World.txt");
		
		if(f.exists()) {
			System.out.println("found");
		}else {
			f.createNewFile();
			System.out.println("Created");
		}
		
		
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.canRead());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
	}
}
