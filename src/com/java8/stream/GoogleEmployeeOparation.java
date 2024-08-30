package com.java8.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GoogleEmployeeOparation {

	public static void findingWithState(List<GoogleEmployee1> list) {
			
		List<GoogleEmployee1> list2 = list.stream().filter(e->e.addresses.stream().anyMatch(a->a.state.equalsIgnoreCase("Utter-Pradesh"))).toList();
		
	 list2.forEach(System.err::println);;
	}

	public static void main(String[] args) {

		List<GoogleEmployee1> employeeList = Arrays.asList(new GoogleEmployee1(1010, "Rameshwar Singh",
				Arrays.asList(new EmployeeAddress("Varanasi", 221101, "Utter-Pradesh")), LocalDate.of(2015, 9, 15)),
				new GoogleEmployee1(1010, "Anubhav Singh",
						Arrays.asList(new EmployeeAddress("Gorakhpur", 221105, "Utter-Pradesh")),
						LocalDate.of(2014, 8, 15)),
				new GoogleEmployee1(1010, "Disha",
						Arrays.asList(new EmployeeAddress("Jaunpur", 221104, "Utter-Pradesh")),
						LocalDate.of(2016, 9, 15)),
				new GoogleEmployee1(1010, "Sima Kumari",
						Arrays.asList(new EmployeeAddress("Nagpur", 221134, "Maharastra")), LocalDate.of(2015, 9, 15)),
				new GoogleEmployee1(1010, "divya Misra", Arrays.asList(new EmployeeAddress("Sikoha", 221223, "Delhi")),
						LocalDate.of(2016, 8, 15)));

		findingWithState(employeeList);
	}

}

class GoogleEmployee1 {

	Integer employeeId;

	String employeeName;

	List<EmployeeAddress> addresses;

	LocalDate JoiningDate;

	public GoogleEmployee1(Integer employeeId, String employeeName, List<EmployeeAddress> addresses,
			LocalDate joiningDate) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addresses = addresses;
		JoiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "GoogleEmployee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", addresses="
				+ addresses + ", JoiningDate=" + JoiningDate + "]";
	}

}

class EmployeeAddress {

	String city;

	Integer pincode;

	String state;

	public EmployeeAddress(String city, Integer pincode, String state) {
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}

}
