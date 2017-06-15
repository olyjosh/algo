/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

/**
 *
 * @author olyjosh
 */
public class LargestPalindrome2_3 {
    static boolean isPalindrome(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }
    
    public static void main(String[] args) {
        int max = 999;
        int min =100;
        int prod=0;
        boolean isTrue = false;
        for (int i = max; i >=min ; i--) {
            for (int j = max; j >= min; j--) {
                prod=i*j;
                if(isPalindrome(String.valueOf(prod))){
                    isTrue=true;
                    break;
                }
            }
            if(isTrue)break;
        }
        System.out.println("largest palindrome made from the product of two 3-digit numbers :"+prod);
    }
}
