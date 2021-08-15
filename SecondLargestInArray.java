package week1.day2;

import java.util.Arrays;


public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {230,890,750,420,329,170};
		Arrays.sort(arr);
		System.out.println("Largest Element in the Array is : "+ arr[arr.length-1]);
		System.out.println("Second larrgest element is : "+arr[arr.length-2]);
	
			
	}

}
