package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
	System.out.println("Student Name is Janakipriya");
	}
	public void studentDept(){
		System.out.println("Department is Mathematics");
	}
    public void studentId() {
    	System.out.println("Student id is 83370");
    }
    public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
