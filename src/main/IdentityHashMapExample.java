package main;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {
	
	public static void main(String args[]) {
		
		IdentityHashMap< Student, String> ihm = new IdentityHashMap<Student, String>();
		
		HashMap<Student, String> hm = new HashMap<>();
		Student s = new Student("Abhishek",100);
		Student s1 = new Student("Kartik",99);
		
		ihm.put(s, "Singhal");
		ihm.put(s1, "kartik");
		
		System.out.println(ihm.get(s));
		System.out.println(ihm.containsKey(s));
		
		//Modifying the behaviour of Student object .
		
		s.setName("Abhi");
		
		System.out.println(ihm.containsKey(s));
		
		hm.put(s, "value");
		hm.put(s1, "value1");
		
		hm.entrySet().forEach((i)-> {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		});
		
		
	}

}
