package com.custome;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
 
public class CustomeMapOparation {

	public static void main(String[] args) {

		CustomeMap<Integer, String> customeMap = new CustomeMap<Integer, String>();
		customeMap.put(10, "Ramu");
		customeMap.put(11, "Arun");
		customeMap.put(12, "Saroj");
		customeMap.put(13, "Vinay");
		System.out.println(customeMap);
	}

}

class CustomeMap<K, V> implements Map<K, V> {

	protected K key;
	protected V value;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
