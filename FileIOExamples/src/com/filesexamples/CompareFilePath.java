package com.filesexamples;

import java.io.File;

public class CompareFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("c://guru.txt");
		File file2 = new File("c://abc.txt");
		File file3 = new File("c://guru.txt");
		if(file1.compareTo(file2) == 0){
			System.out.println("file1 and file 2 paths are same");
		}
		else{
			System.out.println("file2 and file3 paths are different");
		}
		
		
		if(file1.compareTo(file3)==0){
			System.out.println("file1 and file2 paths are same");
		}
		else{
			System.out.println("file1 and file3 paths are different");
		}
		

	}

}
