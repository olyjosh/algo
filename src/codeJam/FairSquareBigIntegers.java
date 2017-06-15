package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class FairSquareBigIntegers {

    static StringBuilder sb;
    static int fairSqArr[] = new int[15];
    
    
    private static void fillArrayWitSomeFairSquare(){
    int fairSq=0;
    for (int i=1; i <= 10000000; i++) {
            double sqrt = Math.sqrt(i);
            if(sqrt%1==0){
            //if(String.valueOf(sqrt).endsWith(".0")){
                
                String aString = String.valueOf(i);
                sb = new StringBuilder(aString);
                    if(sb.reverse().toString().equals(aString)){
                        int sqroot=(int)sqrt;
                        sb=new StringBuilder(String.valueOf(sqroot));
                        if(sb.reverse().toString().equals(String.valueOf(sqroot))){
                            fairSqArr[fairSq]=i;
                            fairSq++;
                        }
                    }
                }
            }
    }
    
    static int indexToStart(int[] arr, int f){
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if(f==arr[i]){ind=i;break;}
            else if(arr[i]>f){ind=i-1;break;}
        }
        return ind;
    }
    
    static int indexToEnd(int[] arr, int f){
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
            int lower =(int) Math.sqrt(a1); int upper = (int) Math.sqrt(a2);
            int i =indexToStart(fairSqArr, lower); int j =indexToEnd(fairSqArr, upper);
            for (int k = i; k <=j; k++) {
                int pow = (int)Math.pow(fairSqArr[k], 2);
                String power = String.valueOf(pow);
                sb = new StringBuilder(power);
                if(sb.reverse().toString().equals(power)){
                    fairSq++;
                    System.out.println(fairSqArr[k] + " "+ power);
                }
            }
            counter++;
            System.out.println("Case #"+counter+": "+fairSq);
        }

    }
}
