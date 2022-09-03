package com.io.serialise;
import java.io.*;
public class DeserialDemo {
	public static void main(String[] args) {
		FileInputStream fs = null;
		ObjectInputStream os = null;
		try {
			fs = new FileInputStream("stud.ser");
			os = new ObjectInputStream(fs);
			Student student = (Student)os.readObject();
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fs != null)
					fs.close();
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

	

}
