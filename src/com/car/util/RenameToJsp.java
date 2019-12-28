package com.car.util;


import java.io.File;

public class RenameToJsp {

	public static void main(String[] args) {
		File  dir=new File("D:\\JavaeeProjects\\Car2\\WebContent");
		
		File[] files=dir.listFiles();
		for(File f:files) {
			if(f.isFile()) {
			String lastname=f.getName().substring(0,f.getName().lastIndexOf("."));
			f.renameTo(new File(dir,lastname+".jsp"));
			
			
			}
		}

	}

}
