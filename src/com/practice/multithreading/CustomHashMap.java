package com.practice.multithreading;

public class CustomHashMap<K,V> {
	
	//put , get methods from Map
	
	private int initialCapacity =16;
	private Entry<K,V> [] entryTable;
	
			
	public static void main(String args[]) {
		
		
	}
	
	private static class Entry<K,V>{
		
		private K k;
		private V v;
		
		private Entry<K,V> next;
		
		public Entry (K k , V v, Entry<K,V> next) {
			
			this.k=k;
			this.v=v;
			this.next= next;
		}
	}

}
