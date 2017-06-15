package ACPM_ICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author olyjosh
 */
public class Median {

    static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException {
        sc = new Scanner(new File("C:\\Users\\olyjosh\\Documents\\NetBeansProjects\\Algo\\src\\ACPM_ICPC\\testcases\\median.txt"));
        int freq;int data[];
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n==-1)break;
            data=new int[n];
            for (int i = 0; i < n; i++)data[i]=sc.nextInt();
            Arrays.sort(data);
            int x = (int)n/2;
            if(n%2==0)x=(data[x-1]+data[x])/2;
            else x=data[x];
            System.out.println(x);
        }
    }
}
