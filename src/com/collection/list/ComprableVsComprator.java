package com.collection.list;

import java.util.Arrays;
import java.util.List;

public class ComprableVsComprator {

	

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(101, "Sivangi", 345292, "Maths"),
				new Student(102, "Ajit", 54321, "Science"), new Student(105, "Manish", 56789, "Bio"),
				new Student(104, "Rana", 98765, "Computer"), new Student(106, "Sradha", 67890, "Art"),
				new Student(103, "Babbu", 45678, "Maths"));

		// Students list
		students.forEach(System.out::println);
	}

}
  class Student {

	int studentId;
	String studentName;
	double studentFee;
	String corse;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}

	public String getCorse() {
		return corse;
	}

	public void setCorse(String corse) {
		this.corse = corse;
	}

	public Student(int studentId, String studentName, double studentFee, String corse) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.corse = corse;
	}

	@Override
	public String toString() {
		return studentId + "\t" + studentName + "\t" + studentFee + "\t" + corse;
	}

}