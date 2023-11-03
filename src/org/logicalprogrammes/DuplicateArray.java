package org.logicalprogrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateArray {
	
	private void usingSort() {
		int arr[] = new int[] {10,86,37,98,123,10,37,123};
		Arrays.sort(arr);
		// 10,10,37,37,86,98,123,123
		int temp[] = new int[arr.length];
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j] = arr[arr.length-1];
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
	
	private static void usingSet() {
		int arr[] = new int[] {10,86,37,98,123,10,37,123};
		
		List<int[]> asList = Arrays.asList(arr);
		Set set = new TreeSet(asList);
		Object[] array = set.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		usingSet();
		
	}

}
