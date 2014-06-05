package com.filesexamples;

import java.io.File;
import java.io.IOException;

public class DeleteFileOrDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("f:\\sampleFile.txt");
		boolean flag= file.delete();
		if(flag){
			System.out.println("file is deleted");
		}
		else {
			System.out.println("file is not deleted");
		}
		
		
		try{
			System.out.println(" creating a file "+file.createNewFile());	
		}catch(IOException e){
			e.printStackTrace();
		}
		//deleting a file on JVM exists
		file.deleteOnExit();
		
		
	}

}
