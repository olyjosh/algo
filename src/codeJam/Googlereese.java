package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class Googlereese {
    
    public static Hashtable<String, String> t9 = new Hashtable<String, String>();
    static StringBuilder sb;    
    
    private static String t9(String a){
        t9.put(" ", " ");
        t9.put("a", "y");
        t9.put("b", "h");
        t9.put("c", "e");
        t9.put("d", "s");
        t9.put("e", "o");
        t9.put("f", "c");
        t9.put("g", "v");
        t9.put("h", "x");
        t9.put("i", "d");
        t9.put("j", "u");
        t9.put("k", "i");
        t9.put("l", "g");
        t9.put("m", "l");
        t9.put("n", "b");
        t9.put("o", "k");
        t9.put("p", "r");
        t9.put("q", "z");
        t9.put("r", "t");
        t9.put("s", "n");
        t9.put("t", "w");
        t9.put("u", "j");
        t9.put("v", "p");
        t9.put("w", "f");
        t9.put("x", "m");
        t9.put("y", "a");
        t9.put("z", "q");
        
        return t9.get(a);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\Googlereese\\A-small-practice.in"));
        int count=0;
        int x = Integer.valueOf(sc.nextLine());
        
//        String x = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
//        x+=" rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        //        if (x.contains("a"))
        //            System.out.println("yes");
        //        else
        //            System.out.println("No
        int counter = 0;
        while(sc.hasNextLine()){
            sb = new StringBuilder();
            char[] CharArray = sc.nextLine().toCharArray();
            for (int i = 0; i < CharArray.length; i++) {
                sb.append(t9(String.valueOf(CharArray[i])));
            }
            counter++;
            System.out.println("Case #"+counter+": "+sb.toString().trim());
        }
    }
}
