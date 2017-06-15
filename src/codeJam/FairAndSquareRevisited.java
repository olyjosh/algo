/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class FairAndSquareRevisited {
    static BigInteger b1,b2;
    static StringBuilder sb;
    long l =999999999999999999L;
    public static void main(String[] args) throws FileNotFoundException {
        long currentTimeMillis = System.currentTimeMillis();
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\FairAndSquare\\try.txt"));
        int count=0;
        int x = Integer.valueOf(sc.nextLine());
        int counter = 0;
        int fairSq = 0;
        String sqrt;
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            int sp = line.indexOf(" ");
            String first  = line.substring(0, sp).trim();
            String second = line.substring(sp, line.length()).trim();
            b1=new BigInteger(first);
            b2=new BigInteger(second);
            
           fairSq=0;
            for (long a=b1.longValue(); a <= b2.longValue(); a++) {
                String aString = String.valueOf(a);
                sb = new StringBuilder(aString);
                sqrt=String.valueOf(Math.sqrt(a));
                if(sqrt.endsWith(".0")){    
                if(sb.reverse().toString().equals(aString)){
                        sqrt=String.valueOf((long)Math.sqrt(a));
                        sb=new StringBuilder(sqrt);
                        if(sb.reverse().toString().equals(sqrt)){fairSq++;}
                    }
                }
            }
            counter++;
            System.out.println("Case #"+counter+": "+fairSq);
        }
        //System.out.println();
        //System.out.println(System.currentTimeMillis()-currentTimeMillis);
    }
}
