package java8StreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8 {
	
	public static void main(String args[]) {
		
		List<String> words = Arrays.asList("abhis","abhishek","singhal");
		
		List<String> list2 = Arrays.asList("abhis", "nnjnj","zzzzz");
		
		//finding the common word from the two lists 
		
		
		
		List<Integer> list = Arrays.asList(1,-2,3,4);
		
		
		//Finding the longest lenth word .
		
		Optional<Integer> result = list.stream().reduce((num1,num2)-> num1+num2);
		
		System.out.println(result.get());
		
		Optional<String> word =words.stream().reduce((word1, word2)-> word1.length()>word2.length()?word1:word2);
		
		//Concatenate using reduce 
		Optional<String> concatWord = words.stream().reduce((word1,word2)->word1+word2);
		
		Optional<String> res =words.stream().filter((word3)->word3.length()==5).findAny();
		
		System.out.println(res.get());
		
		
		if(concatWord.isPresent()) {
			System.out.println(concatWord.get());
		}
		
		if(word.isPresent()) {
			System.out.println(word.get());
		}
		
		
		
		
		
	}

}
