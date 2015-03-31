package com.coby.g4g;

public class SortedPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-8, 1, 4, 6, 10, 45};
		sortedSum(arr,16);
	}
	public static void sortedSum(int[] arr, int sum) {
		int j = arr.length - 1;
		int i = 0;
		while (i != j) {
			if (arr[i] + arr[j] > sum) {
				j = (j + arr.length - 1) % arr.length;
			} else if (arr[i] + arr[j] < sum) {
				i = (i + 1) % arr.length;
			} else if (arr[i] + arr[j] == sum) {
				System.out.println("The pair ("+arr[i]+","+arr[j] + ") matches the sum " + sum);
				return;
			}
		}
		System.out.println("No pair matches the sum");
	}

}
