package com.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException {
		
		Student student = new Student(101, "Rameshwar");
		
		externalization(student);

	}

	private static void externalization(Student student) throws IOException {
		System.out.println("Externalization method called..");
		FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		System.out.println("Object going to convert");
		objectOutputStream.writeObject(student);
		
		fileOutputStream.close();
		objectOutputStream.close();
		System.out.println("externlization completed....");
		
	}

}

class Student implements Externalizable {

	Integer id;
	String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.id);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		Object readObject = in.readObject();
		Integer id = (Integer) readObject;

	}

}