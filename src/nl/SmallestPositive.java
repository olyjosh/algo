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
public class SmallestPositive {
    
    public static void main(String[] arg){
        int num, x = 20;
        boolean isTrue=false;
        for (num = x; !isTrue; num+=x) {
            int i=0;
            for (i = 2; i <x; i++) {
                if(num%i!=0)break;
                else if(i==x-1)isTrue=true;
            }
            if(isTrue)break;
        }
        System.out.println("smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+num);
    }
    
}
