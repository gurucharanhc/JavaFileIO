package com.fileInputStreamExamples;
/**
 * @author Gurucharan
 * Read file in byte array using FileInputStream
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\guru.txt");
		FileInputStream fin= null;
		
		
		try {
			fin = new FileInputStream(f); //FIle not found
			byte[] fileContent= new byte[(int)f.length()];
			fin.read(fileContent); //IOException
			String str= new String(fileContent);
			System.out.println(" File operation using fileinput stream " + str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

