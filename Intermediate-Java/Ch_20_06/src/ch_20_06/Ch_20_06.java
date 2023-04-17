package ch_20_06;

import java.util.*;

public class Ch_20_06 {

	public static void main(String[] args) {
		//store 5 million integers in a linked list
		List<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < 5000000; i++)
		{
			arrayList.add(i);
		}
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
		
		//time for traversing the list using an iterator
		long iteratorTimerStart = System.currentTimeMillis();
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		long iteratorTimerEnd = System.currentTimeMillis();

		//display time for iterator
		System.out.print("Time to traverse the list using an iterator : " + (iteratorTimerEnd - iteratorTimerStart) + " milliseconds");
		
		//time to traverse list using the get method
		long getTimerStart = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			linkedList.get(i);
		}
		long getTimerEnd = System.currentTimeMillis();
		
		//display time for get method
		System.out.print("\nTime to traverse the list using the get method : " + (getTimerEnd - getTimerStart) + " milliseconds");

	}

}
