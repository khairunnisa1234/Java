package day09Assignmnet;
import  java.util.*;

public class RemoveDuplicates {
	
	

	public static void main(String[] args) {
		
		int arr [] = new int[] {1,3,4,1,5,5,6};
		Set <Integer> duplicates = new HashSet<Integer>();
		
		for(int i = 0; i<arr.length; i++){
			duplicates.add(arr[i]);
			
		}
		

		System.out.println(duplicates);

	}

}
