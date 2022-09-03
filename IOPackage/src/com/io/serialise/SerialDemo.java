package com.io.serialise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ram");
		student.setDepartment("CSE");
		student.setHobby("Sports");
		student.setId(10);
		System.out.println("Serializing");
		System.out.println(student);
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try {
			fs = new FileOutputStream("stud.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * finally { try { if (fs != null) fs.close(); if (os != null) os.close(); }
			 * catch (IOException e) { e.printStackTrace(); }
			 */
	}

}
