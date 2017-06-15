package Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class RootFinder {

    static String words;
   
    public static String lcs(String a, String b){
    int aLen = a.length();
    int bLen = b.length();
    if(aLen == 0 || bLen == 0){
        return "";
    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))+ a.charAt(aLen-1);
    }else{
        String x = lcs(a, b.substring(0,bLen-1));
        String y = lcs(a.substring(0,aLen-1), b);
        return (x.length() > y.length()) ? x : y;
    }
}
    
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\NetBeansProjects\\Algo\\src\\Contest\\created\\rootfind.txt"));
        while(sc.hasNextLine()){
            words=sc.nextLine();
            if(lcs("ktb", words).length()==3)System.out.println(lcs("ktb", words));
            if(lcs("fal", words).length()==3)System.out.println(lcs("fal", words));
            if(lcs("rqs", words).length()==3)System.out.println(lcs("rqs", words));
            
        }
    }
}
