package com.filesexamples;

import java.io.File;
import java.io.IOException;

public class CreatATempFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= null;
		File f2= null;
		File f3= null;
		File file = new File("F:\\");
		try{
			// it will create file like javatemp.temp uses temp by default coz we specified null 
			f1= File.createTempFile("javatemp", null);
			//it will create file like javatemp1.abc . Uses abc coz we specified that as a parameter
			f2= File.createTempFile("javatemp1", ".abc");
			f3= File.createTempFile("tempFile", ".txt",file);
			System.out.println(f1.getPath());
			System.out.println(f2.getPath());
			System.out.println(f3.getPath());
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
