package com.code;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l1 =  new LinkedList();
		l1.add(10);
		l1.add("String");
		l1.add(19.0);
		l1.addFirst("Java");  //add at First position
		l1.addLast("Python");  //add at Last position
		l1.add(3, "Hyd");
		l1.offerFirst(78);  //adds at First position
		l1.offerLast(90);    //adds at last position
		
		
		System.out.println(l1);
		System.out.println(l1.get(4));
		System.out.println(l1.peekFirst());  //fetching first record
		System.out.println(l1.pollLast());  //removes last record
		System.out.println(l1);
		System.out.println("using descending Iterator");
		Iterator itr = l1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}

		System.out.println("using descending Iterator");
		ListIterator itr1 =  l1.ListIterator(l1.size());
		while(itr1.hasPrevious())
		{
		System.out.println(itr1.previous())
		}

	}

}
