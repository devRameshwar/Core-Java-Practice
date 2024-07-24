package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Amazone implements Comparable<Amazone> {

	@Override
	public int compareTo(Amazone o) {

		return o.getOrderName().compareTo(this.getOrderName());
	}

	Integer orderId;
	String orderName;
	Double price;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Amazone(Integer orderId, String orderName, Double price) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Amazone [orderId=" + orderId + ", orderName=" + orderName + ", price=" + price + "]";
	}

	public static void main(String[] args) {

		List<Amazone> list = Arrays.asList(new Amazone(101, "China-mobile", 70000.0),
				new Amazone(102, "MI-mobile", 20000.0), new Amazone(103, "Asus-mobile", 40000.0),
				new Amazone(104, "Apple-mobile", 50000.0), new Amazone(105, "Oppo-mobile", 90000.0));
		list.sort(Comparator.naturalOrder());

		list.forEach(System.out::println);

	}

}
