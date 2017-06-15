/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.Scanner;

/**
 *
 * @author olyjosh
 */
public class _13AdjacentGreatestProduct {
    
    static Scanner sc;
    public static void main(String[] args) {
        int index=0;
        int prod=1,pro=1;
        short len=13, is13=0;;
        char[] num = s.toCharArray();
        
        String k = "";
        for (int j = 0; j < num.length; j++) {
            int next = Integer.parseInt(String.valueOf(num[j]));
            if(next==0) {
                //j++; 
                is13=0;
                pro=1;
                
            }else {
                
                if (is13 < len) {
                    pro *= next;
                    is13++;
                    k+=next;
                    //System.out.println(k);
                } else {
                    int l = Integer.valueOf(String.valueOf(num[j - len]));
                    pro = (pro / l) * next;
                    if (pro > prod) {
                        prod = pro;
                        index = j - len;
                    }
                }
            }
        }
        System.out.println(prod);
        System.out.println("at index "+index);
        System.out.println(s.substring(index, index+13));
        
//        char[] toC = s.substring(index, index+13).toCharArray();
//        int kk=1;
//        for (int j = 0; j < toC.length; j++) {
//            char u = toC[j];
//            kk*=Integer.parseInt(String.valueOf(u));
//        }
//        System.out.println(kk);
    }
    
    
    static String s="73167176531330624919225119674426574742355349194934" +
"96983520312774506326239578318016984801869478851843" +
"85861560789112949495459501737958331952853208805511" +
"12540698747158523863050715693290963295227443043557" +
"66896648950445244523161731856403098711121722383113" +
"62229893423380308135336276614282806444486645238749" +
"30358907296290491560440772390713810515859307960866" +
"70172427121883998797908792274921901699720888093776" +
"65727333001053367881220235421809751254540594752243" +
"52584907711670556013604839586446706324415722155397" +
"53697817977846174064955149290862569321978468622482" +
"83972241375657056057490261407972968652414535100474" +
"82166370484403199890008895243450658541227588666881" +
"16427171479924442928230863465674813919123162824586" +
"17866458359124566529476545682848912883142607690042" +
"24219022671055626321111109370544217506941658960408" +
"07198403850962455444362981230987879927244284909188" +
"84580156166097919133875499200524063689912560717606" +
"05886116467109405077541002256983155200055935729725" +
"71636269561882670428252483600823257530420752963450";
}
