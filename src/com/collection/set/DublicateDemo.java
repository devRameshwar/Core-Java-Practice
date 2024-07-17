package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class DublicateDemo {

	public static void main(String[] args) {

		System.out.println("Main method calls...");
		Data data = new Data(23);
		System.out.println(data.id);

		// System.out.println(data.equals(new Data(1)));

		Set set = new HashSet();

		set.add(new Data(1));
		set.add(new Data(2));
		set.add(new Data(1));
		set.add(new Data(3));
		set.add(new Data(3));
		set.add(new Data(3));

		System.out.println(set.size());
	}

}

class Data {

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Data(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashCode");
		return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		Data e = null;
		if (obj instanceof Data) {
			e = (Data) obj;
		}
		System.out.println("In equals");
		if (this.getId() == e.getId()) {
			return true;
		} else {
			return false;
		}
	}

}
