package com.acc.lkm.MapDemo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		NavigableMap<String,Integer>treeMap=new TreeMap<>();
		treeMap.put("Soham", 87);
		treeMap.put("Preeti", 91);
		treeMap.put("Abhishek", 96);
		//treeMap.put("Aakash", 98);
		treeMap.put("John", 88);
		/*for(Map.Entry m1:treeMap.entrySet() ) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}*/
		/*System.out.println(treeMap);
		treeMap.remove("John");
		System.out.println(treeMap);*/
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap.headMap("Abhishek",false));
		System.out.println(treeMap.tailMap("John",true));
		System.out.println(treeMap.subMap("Abhishek",false,"Preeti",true));

	}

}
