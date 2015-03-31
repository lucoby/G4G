package com.coby.g4g;

public class RotatedSortedPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 45, -8, 1, 4, 6};
		sortedSum(arr,16);
	}
	public static void sortedSum(int[] arr, int sum) {
		int j = 0;
		while(j + 1 < arr.length && arr[j] < arr[j+1]) {
			j++;
		}
		int i = (j + 1) % arr.length;
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
