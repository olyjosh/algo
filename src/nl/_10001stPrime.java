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
public class _10001stPrime {
    
    static boolean isPrime(long n)
    {
        if ( n % 2 == 0 )return false;
        long sqrt = (long) Math.sqrt(n);
        sqrt= sqrt%2 == 0 ? sqrt-1 : sqrt; 
        for ( int i = 3; i < sqrt; i += 2 ) 
            if ( n%i == 0 )return false;
        return true;
    }
    
    public static void main(String[] args) {
        int i =1;int n=1;int max=4;
        while(true){
            n+=2;
            if(isPrime(n))i++;
            if(i==max)break;
            
        }
        System.out.println("10001st prime number: "+n);
    }
}
