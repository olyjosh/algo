package ACPM_ICPC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author olyjosh
 */
public class Werewolves {
    
    
    static long N,s,t,p;
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("C:\\Users\\olyjosh\\Documents\\NetBeansProjects\\Algo\\src\\ACPM_ICPC\\testcases\\werewolves.txt"));
        while (sc.hasNextLong()) {
            N = sc.nextLong();
            if(N==-1)break;
            s = sc.nextLong();
            t = sc.nextLong();
            p = sc.nextLong();
            int D = 0;
            long i=0;
            while(true){
                i = i%N;
                if (i >= s && i <= t) {
                    System.out.println(D);
                    break;
                }else if (i == 0 && D != 0) {
                    System.out.println("NEVER");
                    break;
                }
                i += p;
                D++;
            }
        }
    }
}
