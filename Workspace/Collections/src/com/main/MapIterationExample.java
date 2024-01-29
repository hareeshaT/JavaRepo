package com.main;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class MapIterationExample {

	public static void main(String[] args) {
	        Map<Integer, String> map = new HashMap<>();
	        map.put(25,"Alice");
	        map.put(30,"Bob");
	        map.put(22,"Charlie");
	        
	        for (Map.Entry<Integer,String> entry : map.entrySet()) {
	        	Integer key = entry.getKey();
	        	String value = entry.getValue();
	            System.out.println(key + ": " + value);
	        }
	}

}
