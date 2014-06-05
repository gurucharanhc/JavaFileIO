package com.filesexamples;

import java.io.File;

public class ConstructFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath= File.separator+"guru"+File.separator+"charan";
		File f = new File(filePath);
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		//System.out.println(f.getCanonicalPath());
		System.out.println(f.getTotalSpace());
	}

}
