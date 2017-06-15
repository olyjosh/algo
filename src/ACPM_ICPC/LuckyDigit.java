/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACPM_ICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author olyjosh
 */
public class LuckyDigit {
    
    static String baseCon(int base10, int base){
        String s="";
        while (base10>0) {            
            s+=base10%base;
            base10/=base;
        }
        return new StringBuilder(s).reverse().toString();
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\olyjosh\\Documents\\NetBeansProjects\\Algo\\src\\ACPM_ICPC\\testcases\\luckydigit.txt"));
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n==-1)break;
            int i = sc.nextInt();
            int count,lastCount=0;
            String lucky = String.valueOf(n);
            String curr;
            int j;
            for (j = 2; j < 10; j++) {
                curr=baseCon(n, j);
                count = curr.length() - curr.replace(String.valueOf(i), "").length();
                if(count>lastCount){
                    lastCount=count;
                    lucky=curr;
                }
            }
            System.out.println(lucky);
        }
    }
    
}
