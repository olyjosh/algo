package Contest;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class Cheating {
   
    static Scanner sc;
    private static void caller() throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        sc = new Scanner(new java.io.File("C:\\Users\\Oljursh\\Documents\\All\\Test Cases\\Cheating.txt"));
        
        while(sc.hasNextLine()){
        String inp = sc.nextLine();
            if(inp.length()>2){
            int sp = inp.indexOf(" ");
            String first  = inp.substring(0, sp).trim();
            String second = inp.substring(sp, inp.length()).trim();
            System.out.println(lcs(first, second));
            }
        }
    }
    
    
    
    public static String lcs(String a, String b) throws FileNotFoundException{
   
    int aLen = a.length();
    int bLen = b.length();
    if(aLen == 0 || bLen == 0){
        return "";
    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
            + a.charAt(aLen-1);
    }else{
        String x = lcs(a, b.substring(0,bLen-1));
        String y = lcs(a.substring(0,aLen-1), b);
        return (x.length() > y.length()) ? x : y;
    }
   
}
    
    private static void doLCS() throws FileNotFoundException{
        //Scanner sc = new Scanner(System.in);
        sc = new Scanner(new java.io.File("C:\\Users\\Oljursh\\Documents\\All\\Test Cases\\Cheating.txt"));
        
        while(sc.hasNext()){
        
        String inp = sc.nextLine();
        
        int sp = inp.indexOf(" ");
        String x  = inp.substring(0, sp).trim();
        String y = inp.substring(sp, inp.length()).trim();
        
        int M = x.length();
        int N = y.length();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                    opt[i][j] = opt[i+1][j+1] + 1;
                else 
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            }
        }

        // recover LCS itself and print it to standard output
        int i = 0, j = 0;
        while(i < M && j < N) {
            if (x.charAt(i) == y.charAt(j)) {
                System.out.print(x.charAt(i));
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) i++;
            else                                 j++;
        }
        System.out.println();
        }
        
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        doLCS();
        //System.out.println(lcs("FISHERMAN"," FARMER"));
        //caller();
    }
}
