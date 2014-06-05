package com.filesexamples;

import java.io.File;
import java.io.IOException;

public class CreateAEmptyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("f:\\sampleFile.txt");
		boolean flag=false;
		try{
			flag=file.createNewFile();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		if(flag){
			System.out.println("file is created successfully");
		}
		

	}

}
