package com.jsp.treeset;

import java.util.TreeSet;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.id - s.id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
//	Student st = new Student(101, "Aslam");
	
	TreeSet<Student> students = new TreeSet<Student>();
	students.add(new Student(101, "Aslam"));
	students.add(new Student(102, "Aslam"));
	students.add(new Student(103, "Aslam"));
	students.add(new Student(104, "Aslam"));
	
	for(Student s:students) {
		System.out.println(s);
	}



	}
	
	
}
	
	