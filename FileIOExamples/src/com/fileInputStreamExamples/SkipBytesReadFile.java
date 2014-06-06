package com.fileInputStreamExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Gurucharan
 *Skip n bytes while reading the file using FileInputStream
 */
public class SkipBytesReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\guru.txt");
		int ch;
		FileInputStream fin= null;
		try {
			fin= new FileInputStream(f);
			fin.skip(4);
			//read remaining bytes
			while((ch=fin.read())!=-1){
				System.out.println((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
