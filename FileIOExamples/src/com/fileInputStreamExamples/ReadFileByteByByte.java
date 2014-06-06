package com.fileInputStreamExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileByteByByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:\\guru.txt");
		int ch;
		StringBuffer strBuff= new StringBuffer();
		FileInputStream fin;
		try {
			fin = new FileInputStream(f);
			//read byte from file and append that to string buffer
			while((ch=fin.read())!=-1){
				strBuff.append((char)ch);
			}
			fin.close();
			System.out.println(" File content : "+strBuff.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
