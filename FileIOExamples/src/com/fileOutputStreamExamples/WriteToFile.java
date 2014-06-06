package com.fileOutputStreamExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:\\guruSample.txt");
		String str="writing to file";
		FileOutputStream fos=null;
		FileInputStream fis= null;
		try {
			//false indicates we are writing to file not appending 
			//It will going to overwrite the file
			//Instead of FIle f ref var ,,, we can also pass a string which point to the file path
			//Ex: String filePath="f:\\gurusample.txt"
			//fos= new FileOutputStream(filePath);
			System.out.println("can read "+f.canRead());
			System.out.println(" can write "+f.canWrite());
			f.setWritable(true);
			
			fos= new FileOutputStream(f,false);
			fos.write(str.getBytes());
			fos.close();
			
			fis= new FileInputStream(f);
			byte[] fileContent=new byte[(int)f.length()];
			fis.read(fileContent);
			String strFile= new String(fileContent);
			System.out.println("file content "+ strFile);
			fis.close();
			
			// append the string to the existing file
			fos= new FileOutputStream(f,true);
			String strApnd= " Append string";
			fos.write(strApnd.getBytes());
			fos.close();
			
			//reding the same file and displaying it
			fis= new FileInputStream(f);
			fileContent=new byte[(int)f.length()];
			fis.read(fileContent);
			strFile= new String(fileContent);
			System.out.println("file content "+ strFile);
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
