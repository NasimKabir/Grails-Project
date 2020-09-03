package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PracticeList {
	public static void main(String args[]){ 
// ArrayList
	List<String>array=Collections.synchronizedList(new ArrayList<>());
	array.add("Jannat");
	array.add("Shahadat");
	array.add("Maidul");
	System.out.println("Array size "+array.size());
	for(String st:array) {
		System.out.println(st);
	}
	
	System.out.println("=============================");
	synchronized (array) {
		Iterator<String>st=array.iterator();
		while(st.hasNext()) {
			System.out.println("Synchronized "+st.next());
		}
	}
	
	//array.add(1, "gjhf");
	//array.clear();
	//Collections.sort(array);
	for(String st:array) {
		System.out.println(st);
	}
	
//LinkedList
	
	System.out.println("---------LinkedList---------");
	LinkedList<String>ll=new LinkedList<>();
	ll.add("Nasim");
	ll.add("kabir");
	ll.add("Md");
	
	System.out.println("Last "+ ll.getLast()+" First Element "+ll.getFirst());
	
	ll.remove(1);
	for(String st:ll) {
		System.out.println(st);
	}
	
	
	 LinkedList<Integer> stack = new LinkedList<>(); 
	 stack.push(10);
	 stack.push(20);
	 Integer it=stack.pop();
	 System.out.println(it);
	 
	 it=stack.pop();
	 System.out.println(it);
	 
	 System.out.println("*************vector********************");
	 Vector<Integer>vt=new Vector<>();
	 vt.add(1);
	 vt.add(3);
	 vt.add(10);
	 for(Integer in:vt) {
		 System.out.println(in);
	 }
	 
	 Iterator<Integer> in=vt.iterator();
	 while(in.hasNext()) {
		 System.out.println(in.next());
	 }
}
}
