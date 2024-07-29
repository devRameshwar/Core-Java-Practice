package com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo {

	public static void main(String[] args) {
		 
		
	}

}
class Student implements Externalizable{
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		 
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 
		
	}
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
	
}