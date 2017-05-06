package com.dhiva.ArraysAndStrings;

public class CountAndSay {
	public String count(int n){
		StringBuilder curr = new StringBuilder("1");
		StringBuilder prev;
		int count;
		char say;
		for(int i=0;i<n;i++){
			prev = curr;
			say = prev.charAt(0);
			count =1;
			for(int j = 1; j<prev.length();j++){
				if(prev.charAt(j)!=say){
					curr.append(count).append(say);
					count = 1;
					say = prev.charAt(j);
				}
				count++;
			}
			curr.append(count).append(say);
		}
		return curr.toString();
	}
}
