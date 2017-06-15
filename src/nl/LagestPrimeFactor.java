/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.HashSet;
import java.util.Vector;

/**
 *
 * @author olyjosh
 */
public class LagestPrimeFactor {
    
    static void sievedPrime(){
        int N = 13195;

        // initially assume all integers are prime this case I use false as true to avoid looping through to change values
       boolean[] isPrime = new boolean[N + 1];
       
       for (int i = 2; i*i <= N; i++) {
            if (!isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = true;
                }
            }
        }

        int largestPrime = 0;
        for (int i = N; i >= 2; i--) {
            if (!isPrime[i] && N%i==0) {
                System.out.println("largest prime factor is: " + i);
                break;
            }
        }
        
       
    }
    
    public static void main(String[] args) { 
        
        sievedPrime();
    }
    
    
}
