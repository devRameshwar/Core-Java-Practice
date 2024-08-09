package com.collection.map;

import java.util.HashMap;
 

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<Employee1,Address> map = new HashMap<>();
		
		map.put(new Employee1(101, "Ram"), new Address("Varanasi"));
		map.put(new Employee1(102, "sima"), new Address("Delhi"));
		System.out.println(map);
		System.out.println(map.size());
			
	}

}
class Employee1{
	
	int id;
	String name;
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return 123000;
	}
	@Override
	public boolean equals(Object obj) {
		 
		return true;
	}
	
	
	
	
}
class Address{
	
	String address;

	public Address(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	
	
}
