package main;

public class Poker {
	
	public static void main(String args[]) {
		String s = "++--++"; // balance = 4(+) -2(-) => 2
		func(s,3);
	}
	//This scenario function should return 1 ( minimul tweak required , removal of - from string) 
	static int func( String s , int n) {
		
		int removals_required;
		char chars[]= s.toCharArray();
		int count =0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='+') {
				count++;
			}
			else {
				count--;
			}
		}
		
 		return -1;
	}

}
