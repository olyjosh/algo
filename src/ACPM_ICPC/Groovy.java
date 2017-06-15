package ACPM_ICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author olyjosh
 */
public class Groovy {
 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\olyjosh\\Documents\\NetBeansProjects\\Algo\\src\\ACPM_ICPC\\testcases\\groovy.txt"));
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n==-1)break;
            int half=n/2;
            boolean is = true;
            for (int i = 2; i < half; i++) {
                int sq=i*i;
                if(sq>half){
                    break;
                }
                if(n%sq==0){
                    is=false;
                    System.out.println(n+" is not square-free");
                    break;
                }
            }
            if(is)System.out.println(n+" is square-free");
        }
    }
}