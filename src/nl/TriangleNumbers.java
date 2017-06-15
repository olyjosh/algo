/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.ArrayList;

/**
 *
 * @author olyjosh
 */
public class TriangleNumbers {
    static ArrayList<Integer> e;
    
    static ArrayList<Integer> factors(int n){
        e= new ArrayList<>();
        e.add(1);
        if(n==1)return e;
        int f2 = 0,add,i;
        //String s="1,";
        boolean even = n%2 ==0; // I check factors base on even and odd. Note: odd number always have odd factors;
        add = even ? 1 : 2;
        for (i = even ? 2:3; i < n; i+=add) {
            if(n%i==0){
                if(i==f2)break;
                f2=n/i;
                e.add(i);  //add pair of any factor gotten So i no go fit do them again. That is I wont even check upto half
                e.add(f2);
            }
        }
        e.add(n);
        return e;
    }
    
    public static void main(String[] args) {
        int n=0;int i=1;
        while (true) {
            n+=i++;
            ArrayList<Integer> factors = factors(n);
            if(factors.size()>500){
                System.out.println("First triangle number to have over five hundred divisors: "+n);
                break;
            }
        }
        

//        System.out.println(factors(48024900).size());
    }
    
}



//48024900 and 76576500