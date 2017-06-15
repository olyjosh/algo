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
public class FibonacciEven {
      
    public static void main(String[] args) {
        int num=4000000;
        int fib=0;
        int t2=2;
        int t1=1;
        int sum=2;
        while (fib<num) {  
            fib=t1+t2;
            t1=t2;t2=fib;
            if(fib<num)if(fib%2==0)sum+=fib;
        }
        System.out.println(sum);
    }
    
}
