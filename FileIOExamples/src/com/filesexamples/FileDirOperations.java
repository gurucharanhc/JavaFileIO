package com.filesexamples;
/**
 * @author Gurucharan
 */
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDirOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//check whether file exists
		File f1= new File("c:\\guru.txt");
		
		if(f1.isFile()){
			System.out.println("File exist at path"+f1.getAbsolutePath());
		}
		else{
			System.out.println("File not exist at path"+f1.getAbsolutePath());
		}
		
		File f2=new File("f:\\CSULB");
		if(f2.isDirectory()){
			System.out.println(" It is directory");
		}
		else{
			System.out.println("It is not a directory");
		}
		
		//To check whether file or directory denoted by File object is hidden,
		System.out.println("Is dir hidden : "+f2.isHidden());
		System.out.println("Is file hidden : "+f1.isHidden());
		
		// to check whether file can be read / write
		System.out.println("Is file can be read : "+f1.canRead());
		System.out.println("Is file can be write : "+f1.canWrite());
		
		// to check whether the application allow to execute the file
		System.out.println("Is file can be executed : "+f1.canExecute());
		
		//file or dir exists
		System.out.println("Is file exists : "+f1.exists());
		System.out.println("Is dir exists : "+f2.exists());
		
		//get absoulte path of a file
		System.out.println(" absolute path of a file : "+f1.getAbsolutePath());
		
		//get relative path of a file
		System.out.println("relative path of a file : "+f1.getPath());
		
		//file size in bytes
		System.out.println("File size in bytes : "+f1.length());
		System.out.println("File size in KB : "+ (double)(f1.length()/(1024)));
		System.out.println("File size in MB : "+ (double)(f1.length()/(1024*1024)));
		
		// last modified file or dir
		long lastmodified=f1.lastModified();
		long lastmodifiedDir=f2.lastModified();
		System.out.println("File last modified on "+ new Date(lastmodified));
		System.out.println("Dir last modified on "+ new Date(lastmodifiedDir));
		
		//get name of the parent dir
		System.out.println("parent dir : "+f1.getParent());
		System.out.println("parent dir : "+f2.getParent());
		
		//get the specified name of dir or file
		System.out.println("file name : "+f1.getName());
		System.out.println("dir name : "+f2.getName());
		
		//Get parent directory/path of a File object
		File fileParent = f1.getParentFile();
		System.out.println(" parent dir :"+fileParent.getPath());
		
		//to list root dir
		// to list the root dir available in the system
		File[] fileRoot= File.listRoots();
		for(File f : fileRoot){
			System.out.println(f);
		}
		
		// to list contents if a dir
		System.out.println("------------------------");
		String[] str=f2.list();
		System.out.println("files and dir at path : "+f2.getPath());
		for(String s:str){
			System.out.println(s);
		}
		
		// make file or dir read only
		File f3=new File("f:\\guruSample.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean readOnlyFlag=f3.setReadOnly();
		System.out.println(" Is file readonly ? : "+readOnlyFlag);
		System.out.println(" is file writeable ? : "+f3.canWrite());
		
		//file or dir renamed
		File oldFile= new File("f:\\abc.txt");
		try {
			oldFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File renameFile= new File("f:\\guru10.txt");
		boolean isFileRenamed = oldFile.renameTo(renameFile);
		System.out.println("File was renamed : "+ isFileRenamed);
		
		//setting last modified time of a file or dir
		long lastmodified1= oldFile.lastModified();
		Date d= new Date(lastmodified1);
		System.out.println("last modified : "+d);
		
		d= new Date();
		boolean modifiedFlag= oldFile.setLastModified(d.getTime());
		System.out.println("Is modified the lastmodifed : "+modifiedFlag);
		System.out.println("now last modified is : "+new Date(oldFile.lastModified()));
	}

}
