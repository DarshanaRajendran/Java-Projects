package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student("Ram","EEE");
		student.printDetails();
		String grade=student.getGrades(90,80,70,83,98,87);
		System.out.println("Grade:"+grade);
	}

}
