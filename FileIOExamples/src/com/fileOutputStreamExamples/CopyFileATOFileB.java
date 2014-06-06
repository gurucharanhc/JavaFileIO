package com.fileOutputStreamExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileATOFileB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcPath="f:\\guruSample.txt";
		String descPath="f:\\guruDest.txt";
		FileInputStream fin=null;
		FileOutputStream fos= null;
		int ch;
		try {
			fin= new FileInputStream(srcPath);
			fos= new FileOutputStream(descPath);
			while((ch=fin.read())!=-1){
				fos.write(ch);
			}
			System.out.println("successfully copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
