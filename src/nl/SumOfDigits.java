/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author olyjosh
 */
public class SumOfDigits {
    
    public static void main(String[] args) {
        char[] n = new BigInteger("2").pow(1000).toString().toCharArray();
        int ans=0;
        for (int i = 0; i <n.length ; i++) {
            ans+=Integer.parseInt(String.valueOf(n[i]));
        }
        System.out.println("Sum of digit of number 2^1000 is "+ans);
    }
}
