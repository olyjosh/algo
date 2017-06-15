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
public class Primes
{
    static boolean isPrime(long n)
    {
        if ( n % 2 == 0 )return false;
        long sqrt = (long) Math.sqrt(n);
        sqrt= sqrt%2 == 0 ? sqrt-1 : sqrt; 
        for ( int i = 3; i < sqrt; i += 2 ) 
        {
            if ( n % i == 0 )return false;
        }
        return true;
    }
    
    public static void main(String[] args)
{

    long t = 600851475143L;
    long d = 2;
    while (true)
    {
        long tmp = 600851475143L / d;
        if ( t % tmp == 0 &&  isPrime(tmp) )
        {
            System.out.println("= " + tmp);
            break;
        }
        d++;
    }
}
}

