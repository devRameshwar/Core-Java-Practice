package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student student = new Student(101, "Rameshwar");

		// externalization(student);

		deExternalization();

	}

	private static void deExternalization() throws IOException, ClassNotFoundException {

		System.out.println("File goning to read..");

		FileInputStream fileInputStream = new FileInputStream("student.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Student student = new Student();
		student.readExternal(objectInputStream);
		
		fileInputStream.close();
		objectInputStream.close();
		
		System.out.println("student id: "+student.id+" student Name: "+student.id);

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

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {
		System.out.println("default constructor is called...");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal method is called....");
		out.writeObject(this.id);
		out.writeObject(this.name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		System.out.println("readExternal method is called....");
		name = (String) in.readObject();
        id = in.readInt();
        // Manually handling password, if needed

	}

}