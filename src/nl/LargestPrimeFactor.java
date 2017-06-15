/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author olyjosh
 */
public class LargestPrimeFactor {
    static boolean isPrime(long n){
        if(n==1)return false;
        if(n==2)return true;
        if(n%2==0) return false;
        int max = (int)Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if(n%i==0)return false;
        }
        return true;
    }
    
    static Queue<Long> factors(long n){
        Queue fac = new ArrayDeque();
        //ArrayList<Long> factors = new ArrayList<>();
        long h=Math.round(n/2);
        for (long i = 2; i <= h; i++) {
            if(n%i==0){fac.add(i);}
        }
        return fac;
    }
    
    public static void main(String[] args) {
        long lastPrime=0;
        long n =600851475143L;
        Queue<Long> factors = factors(n);
        for (Iterator<Long> iterator = factors.iterator(); iterator.hasNext();) {
            long next = iterator.next();
            if(isPrime(next))lastPrime=next;
        }
        System.out.println("largest prime factor is: "+lastPrime);
    }
}
