package java8StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplititeratorExample {
	
	public static void main(String args[]) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("abhishek");
		ls.add("ridhima");
		ls.add("Rakesh");
		ls.add("shankar");
		
		Spliterator<String> it = ls.spliterator();
		
		System.out.println(it.characteristics());
		System.out.println(it.tryAdvance((name)->System.out.println(name)));
		System.out.println(it.trySplit().estimateSize());
	}

}
