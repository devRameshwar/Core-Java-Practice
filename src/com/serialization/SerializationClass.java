package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee employee = new Employee(101, "Ramu");

		//serialization(employee);

		desialization();
	}

	private static void desialization() throws IOException, FileNotFoundException, ClassNotFoundException {

		System.out.println("File going to read..");

		FileInputStream fileInputStream = new FileInputStream("employee.txt");

		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Object readObject = objectInputStream.readObject();

		Employee employee = (Employee) readObject;

		System.out.println(employee);

		objectInputStream.close();
		fileInputStream.close();

	}

	private static void serialization(Employee employee) throws IOException, ClassNotFoundException {
		// serialization
		FileOutputStream fileOutputStream = new FileOutputStream("employee.txt");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		System.out.println("object going to Serialization..");
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
		fileOutputStream.close();

		System.out.println("Seriazation is completed..");

	}

}

class Employee implements Serializable {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "\t" + name;

	}

}