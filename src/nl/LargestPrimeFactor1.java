/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author olyjosh
 */
public class LargestPrimeFactor1 {
    static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2)return true;
        if(n%2==0) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0)return false;
        }
        return true;
    }
    
    static Queue<BigInteger> factors(BigInteger n){
        Queue fac = new ArrayDeque();
        //ArrayList<Integer> factors = new ArrayList<>();
        BigInteger h=n.divide(new BigInteger("2"));
//        for (int i = 2; i <= h; i++) {
//            if(n%i==0){fac.add(i);}
//        }
        BigInteger i =new BigInteger("2"),
                zero =new BigInteger("0"),
                one =new BigInteger("1");
        while (i.compareTo(h)!=1) { 
            if(n.mod(i).compareTo(zero)==0){fac.add(i);}
            i.add(one);
        }
        return fac;
    }
    
    public static void main(String[] args) {
        String lastPrime=null;
        Queue<BigInteger> factors = factors(new BigInteger("5"));
        for (Iterator<BigInteger> iterator = factors.iterator(); iterator.hasNext();) {
            BigInteger next = iterator.next();
            if(next.isProbablePrime(1))lastPrime=next.toString();
        }
        System.out.println("largest prime factor is: "+lastPrime);
    }
}
