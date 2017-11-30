package com.vmware.lambda;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<15;i++){
			numbers.add(i);
		}
		System.out.println(numbers);
		int higher=numbers.size()-1;
		System.out.println(numbers.size());
		int total=0;
		numbers.add(122);
		for(Integer it:numbers){
			total+=it;
		}
		System.out.println(total);
		
		System.out.println(numbers.size());
		System.out.println(higher);
		int sum = (higher*(higher+1)/2);
		System.out.println(total - sum);
	}

}
