package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PracticeMap {
	public static void main(String args[]) {
		// HashSet
		HashMap<Integer, Integer> hmap = new HashMap<>();
		hmap.put(1, 10);
		hmap.put(2, 20);
		hmap.put(3, 30);

		System.out.println("Get one value " + hmap.get(1));

		System.out.println("Remove one item " + hmap.remove(1));
		System.out.println("Foreach loop");
		for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		System.out.println("Iterator loop");
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> m = (Entry<Integer, Integer>) it.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// LinkedHashMap
		System.out.println("LinkedHashMap");
		LinkedHashMap<Integer, Integer> lhmap = new LinkedHashMap<>();
		lhmap.put(1, 10);
		lhmap.put(2, 20);
		lhmap.put(3, 30);

		System.out.println("Get one value " + lhmap.get(1));

		System.out.println("Remove one item " + lhmap.remove(1));
		System.out.println("Foreach loop");
		for (Map.Entry<Integer, Integer> e : lhmap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		System.out.println("Iterator loop");
		Set lset = hmap.entrySet();
		Iterator<?> lit = set.iterator();
		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<Integer, Integer> m = (Entry<Integer, Integer>) lit.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		System.out.println("TreeMap");
		TreeMap<Integer, String>tmap=new TreeMap<>();
		tmap.put(1, "Naim");
		tmap.put(2, "Nasim");
		tmap.put(3, "Shahadat");
		tmap.put(4, "Jannat");
		
		System.out.println(tmap);
		for(Map.Entry<Integer, String>tm:tmap.entrySet()) {
			System.out.println(tm.getKey()+" "+tm.getValue());
		}
		
		System.out.println(tmap.containsKey(1));

	}
}
