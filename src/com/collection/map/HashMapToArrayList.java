package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
 

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("eBay", 12345);
		map.put("google", 19871);
		map.put("Facebook", 45678);
		map.put("Amazon", 67890);
		map.put("Flipkart", 10987);

		System.out.println("==> size of of companyDetails Map: " + map.size());

		// Normal IteratorentrySet().iterator(); getting key And Value

		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			String key = next.getKey();
			Integer value = next.getValue();
			System.out.println("[key] " + key + " [value] " + value);
		}
		// converting HashMap key value into list using keySet() method
		ArrayList<String> keyList = new ArrayList<>(map.keySet());
		System.out.println("==> KeyList Size : " + keyList.size());
		for (Object key : keyList) {
			System.out.println(key);
		}
		// converting HashMap value into list using values() method
		ArrayList<Integer> valueList = new ArrayList<>(map.values());
		System.out.println("==> Value list Size: " + valueList.size());
		for (Integer value : valueList) {
			System.out.println(value);
		}
		
		//Entry set list
		ArrayList<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
		System.out.println("==> Size of Entry list  "+list);
		for(Entry<String, Integer> temp :list) {
			System.out.println(temp);
		}
	}

}
