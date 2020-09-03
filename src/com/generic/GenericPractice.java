package com.generic;

class A<t>{
	t object;
	void add(t object) {
		this.object=object;
	}
	t get() {
		return object;
	}
}
public class GenericPractice {
	public static void main(String[] args) {
 A<Integer>a=new A();
 a.add(2);
System.out.println( a.get());
	}
}
