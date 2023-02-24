package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Printing StudentName from Student Class");
	}
	public void studentDept() {
		System.out.println("Printing StudentDept from Student Class");
	}
	public void studentId() {
		System.out.println("Printing StudentId from Student Class");
	}
	
	public static void main(String args[]) {
		Student s= new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
		
	}
}
