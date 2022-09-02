package com.shristi.objbasics;
public class Student {
	String name;
	int studentId;	
	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}


	void getDetails(){
		System.out.println("name is "+name);
		System.out.println("id no "+studentId);
	}
	
	
	void getGrades(int[]marks){
		int sum=0,avg=0;
		String grade;
		for (int i = 0; i < marks.length; i++) {
			sum=sum+marks[i];
		}
		avg=sum/marks.length;
		System.out.println("sum is "+sum+"\navg is "+avg);
		if(avg>75) 
			grade="A";
		else if(avg>40)
			grade="B";
		else
			grade="C";
		System.out.println("grade is "+grade+"");
		
		
	}
	

	public static void main(String[] args) {
		Student student1=new Student("Raju",10);
		Student student2=new Student("Raju",10);
		int []marks=new int[] {80,95,20};
		int []marks1=new int[] {80,95,80};
		
		
		
		student1.getDetails();
		student1.getGrades(marks);
		System.out.println();
		
		student2.getDetails();
		student2.getGrades(marks1);

		
		

		
		
	}
}
