package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class FairAndSquare {
static BigInteger b1,b2;
   


    static StringBuilder sb;
    static long fairSqArr[] = new long[249999];
    
    static boolean isPalind(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s))return true;
        return false;
    }
    
    private static void fillArrayWitSomeFairSquare(){
    int fairSq=0;
    for (long i=1; i <= 3037000500L; i++) {
            double sqrt = Math.sqrt(i);
            if(sqrt%1==0){
                fairSqArr[fairSq]=i;
                fairSq++;
                }
            }
    }
    
    static int indexToStart(long[] arr, long f){
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(f==arr[i]){ind=i;break;}
            else if(arr[i]>f){ind=i-1;break;}
        }
        return ind;
    }
    
    static int indexToEnd(long[] arr, long f){
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(f==arr[i]){ind=i;break;}
            else if(f>arr[i]){ind=i+1;break;}
        }
        return ind;
    }
    

    public static void main(String[] args) throws FileNotFoundException {
         fillArrayWitSomeFairSquare();
       
         
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\FairAndSquare\\try.txt"));
        int count=0;
        int x = Integer.valueOf(sc.nextLine());
        int counter = 0;
        int fairSq = 0;
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            int sp = line.indexOf(" ");
            String first  = line.substring(0, sp).trim();
            String second = line.substring(sp, line.length()).trim();
            long a1 = Long.valueOf(first); long a2 = Long.valueOf(second);
            //int lower =(int) Math.sqrt(a1); int upper = (int) Math.sqrt(a2);
            int i =indexToStart(fairSqArr, a1); int j =indexToEnd(fairSqArr, a2);
            for (int k = i; k <=j; k++) {
                if(isPalind(String.valueOf(fairSqArr[k]))){
                    long pow = (long)Math.pow(fairSqArr[k], 2);
                String power = String.valueOf(pow);
                if(isPalind(power)){
                    fairSq++;
                }
                }
            }
            counter++;
            System.out.println("Case #"+counter+": "+fairSq);
        }
    }
}