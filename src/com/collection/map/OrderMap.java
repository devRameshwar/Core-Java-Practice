package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class OrderMap {

	public static void main(String[] args) {

		hashMapStoringObjectTest();

	}

	private static void hashMapStoringObjectTest() {

		HashMap<User, Order> hashMap = new HashMap<>();

		hashMap.put(new User(101, "Raju"), new Order(1000, "I-Phone"));
		hashMap.put(new User(102, "Arun"), new Order(1001, "Mac-Book"));
		hashMap.put(new User(103, "Radha"), new Order(1002, "Tata-Safari"));
		System.out.println(hashMap);
		System.out.println(hashMap.size());

		/*Set<Entry<User, Order>> entrySet = hashMap.entrySet();
		Iterator<Entry<User, Order>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<User, Order> next = iterator.next();
			System.out.println(next.getKey());
			System.out.println(next.getValue());}*/

		
	}

}

class Order {

	public Integer oderId;
	public String orderName;

	public Order(Integer oderId, String orderName) {
		this.oderId = oderId;
		this.orderName = orderName;
	}

	public Integer getOderId() {
		return oderId;
	}

	public void setOderId(Integer oderId) {
		this.oderId = oderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public String toString() {
		return "Order [oderId=" + oderId + ", orderName=" + orderName + "]";
	}

}

class User {
	Integer userId;
	String userName;

	public User(Integer userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public int hashCode() {
		return 1010;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}

}
