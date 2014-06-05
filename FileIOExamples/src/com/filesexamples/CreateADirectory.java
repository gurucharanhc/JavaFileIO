package com.filesexamples;

import java.io.File;

public class CreateADirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("c://guru");
		//boolean idDirCreated = file.mkdir();
		System.out.println(" Dir crated at the path c://guru :"+ file.mkdir());
		// Note here charan dir is not present and also abc
		// we are trying to create both charan and abc
		File file1= new File("c://charan1//abc");
		//This will return false because parent dir of abc i.e charan is not existence
		//System.out.println("dir create at the path c://charan//abc : "+file.mkdir()); 
		// to create chain of dir 
		boolean idDirCreated = file1.mkdirs();
		System.out.println("dir create at the path f:\\charan\\abc : "+ idDirCreated);
		
	}

}
