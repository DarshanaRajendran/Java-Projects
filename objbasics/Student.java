package com.lumen.objbasics;

public class Student {

	String name;
	String department;
	public Student(String name, String department) {
		this.name=name;
		this.department=department;
	}
	
	void printDetails(){
		System.out.println("Name is "+this.name);
		System.out.println("Department Name is "+this.department);
	}
	String getGrades(int...marks) {
		int sum=0;
		double avg;
		String grade;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println("Sum:"+sum);
		avg=sum/marks.length;
		System.out.println("Average:"+avg);
		if(avg>90 && avg<=100) {
			grade="A";
		}
		else if(avg>80 && avg<=90) {
			grade="B";
		}
		else if(avg>70 && avg<=80) {
			grade="C";
		}
		else if(avg>60 && avg<=70) {
			grade="D";
		}
		else if(avg>50 && avg<=59) {
			grade="E";
		}
		else {
			grade="fail";
		}
		return grade;
		
	}
}
