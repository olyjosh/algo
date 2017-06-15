package Contest;


import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class Palindrome {
    static StringBuilder sbu;
    
    private static String reverse(String a){
        sbu = new StringBuilder(a);
        return sbu.reverse().toString();
    }
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       //Scanner sc = new Scanner(new File(""));
        
        String a = "Are we not drawn onward, we few, drawn onward to new era?";
        String aNew = a.replaceAll("[^a-zA-Z]", "");
        String b = null;
        System.out.println(aNew);
        
//        if(aNew.equalsIgnoreCase(reverse(aNew))){
//        StringBuilder sb = new StringBuilder("");
//        for (int i = aNew.length()-1; i> -1 ; i--) {
//            b = sb.append(aNew.charAt(i)).toString();
//        }
//        if(aNew.equalsIgnoreCase(b)){
//            System.out.println("It is a palidrome if case sensitivity is Ignored\n\n"+aNew.length());
//        }
        
        if(aNew.equalsIgnoreCase(reverse(aNew))){
            System.out.println("It is a palidrome if case sensitivity is Ignored\n\n"+aNew.length());
        }
    }
}
