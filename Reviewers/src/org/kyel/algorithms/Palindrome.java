package org.kyel.algorithms;

public class Palindrome {
	
	/*
	 * @param Word - The word to be reversed
	 * @return - return the reversed word
	 */
	private static String reverseWord(String word){
		char[] original = word.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for(int i = original.length - 1; i >= 0; i--){
			reverse.append(original[i]);
		}	
		return reverse.toString();
	}
	
	/*
	 * @param word - The word to be checked if it is a palindrome
	 * @return - returns either true or false, true if palindrome, otherwise false
	 */
	public static boolean isWordAPalindrome(String word){
		return (word.equals(reverseWord(word)));
	}
	
	/*
	 * Another Approach
	 * Iterate through the word forward and backward
	 */
	public static boolean isPalindome(char[] word){
		int forward = 0;
		int backward = word.length - 1;
		
		while(forward<backward){
			if(word[forward] != word[backward]){
				System.out.println(word.toString());
				return false;
			}
			
			forward++;
			backward--;
		}
		return true;
	}
	
	public static boolean isPalindrome(String word){
		return (isPalindome(word.toCharArray()));
	}
	
	/*
	 * A Simple Test Class
	 */
	public static void main(String[] args){
		System.out.println("Is The Word Stressed  A Palindrome: "+Palindrome.isPalindome("dad".toCharArray()));
		//System.out.println("Is The Word Sex A Palindrome: "+Palindrome.isPalindrome("Sex"));
	}
}
