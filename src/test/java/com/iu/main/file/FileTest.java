package com.iu.main.file;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.iu.main.Mytest;

public class FileTest extends Mytest {

	@Test
	public void test() {
		//file
		File file = new File("C:\\study\\study.txt");//위치의 파일 객체 생성
		System.out.println(file.exists()); // 존재하냐?
		System.out.println(file.isFile()); // 파일이냐?
		
		file = new File("C:\\study", "study.txt");
		
		file = new File("C:\\study");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory()); // 디렉토리냐?
		System.out.println("===========================");
		
		file = new File(file, "ex");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		
		file.delete(); // 해당경로 삭제
		file = new File("C:\\study\\study.txt");
		file.delete();
		
		file = new File("C:\\study");
//		file.delete();
		
		String [] list = file.list();
		//향상된 for 문
		//for(collection에모은타입 변수명:collection변수명)
		
		for(String str:list) {
			System.out.println(str);
		
		file = new File(file, "t1");
		file.mkdir();
		
		file = new File(file, "sub1\\sub2");
		file.mkdirs();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}