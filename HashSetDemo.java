package com.code;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//insertion order is not maintained
		HashSet hs =  new HashSet();
		hs.add(50);
		hs.add(100);
		hs.add(25);
		hs.add(10);
		System.out.println(hs);
		
		//insertion order is maintained
		LinkedHashSet lhs =  new LinkedHashSet();
		
		lhs.add(50);
		lhs.add(100);
		lhs.add(25);
		lhs.add(10);
		System.out.println(lhs);

	}

}
