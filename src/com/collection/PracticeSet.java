package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PracticeSet {

	public static void main(String[] args) {
		// hashSet
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		// add duplicate elements
		hs.add(2);

		System.out.println("HashSet size is " + hs.size());
		// hs.remove(2);
		hs.clone();
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		// add duplicate elements
		lhs.add(2);

		System.out.println("LinkedHashSet size is " + lhs.size());
		// hs.remove(2);
		hs.clone();
		Iterator<Integer> lit = hs.iterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		// treeSet
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ss");
		ts.add("sx");
		ts.add("c");
		ts.add("ghf");
		
		for(String s:ts) {
			System.out.println(s);
		}

	}

}
