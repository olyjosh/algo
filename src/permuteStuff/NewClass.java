/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permuteStuff;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class NewClass {
 
	public static void main(String[] args) {
		String s = "ABCD";
//		String s1 = "EBAY";
//		String s2 = "Yahoo";
		System.out.println("\nString " + s + ":\nPermutations: " + crunchifyPermutation(s));
//		System.out.println("\nString " + s1 + ":\nPermutations: " + crunchifyPermutation(s1));
//		System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));
	}
 
	public static Set<String> crunchifyPermutation(String str) {
		Set<String> crunchifyResult = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			crunchifyResult.add("");
			return crunchifyResult;
		}
 
		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = crunchifyPermutation(rem);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
                            crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
			}
		}
		return crunchifyResult;
	}
 
	public static String crunchifyCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
 
        
        public ArrayList<ArrayList<Integer>> permute(int[] num) {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
 
	//start from an empty list
	result.add(new ArrayList<Integer>());
 
	for (int i = 0; i < num.length; i++) {
		//list of list in current iteration of the array num
		ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
 
		for (ArrayList<Integer> l : result) {
			// # of locations to insert is largest index + 1
			for (int j = 0; j < l.size()+1; j++) {
				// + add num[i] to different locations
				l.add(j, num[i]);
 
				ArrayList<Integer> temp = new ArrayList<Integer>(l);
				current.add(temp);
 
				//System.out.println(temp);
 
				// - remove num[i] add
				l.remove(j);
			}
		}
 
		result = new ArrayList<ArrayList<Integer>>(current);
	}
 
	return result;
}
         
        
}