package com.coby.g4g;

public class RansomNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ransomNote("This is a magazine with a note", "note");
		ransomNote("This is a magazine with a note", "xxx");
	}
	
	public static void ransomNote(String magazine, String note) {
		int[] letters = new int[26];
		for(int i = 0; i < magazine.length(); i++) {
			letters[magazine.charAt(i) % 26]++;
		}
		for(int i = 0; i < note.length(); i++) {
			letters[note.charAt(i) % 26]--;
		}
		for (int i: letters) {
			if (i < 0) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
	}
}
