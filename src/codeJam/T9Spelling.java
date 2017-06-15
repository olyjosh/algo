package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class T9Spelling {

    public static Hashtable<String, String> t9 = new Hashtable<String, String>();
    
    
    private static String t9(String a){
        return t9.get(a);
    }
    
    private static void populateT9(){
        t9.put(" ", "0");
        t9.put("a", "2");
        t9.put("b", "22");
        t9.put("c", "222");
        t9.put("d", "3");
        t9.put("e", "33");
        t9.put("f", "333");
        t9.put("g", "4");
        t9.put("h", "44");
        t9.put("i", "444");
        t9.put("j", "5");
        t9.put("k", "55");
        t9.put("l", "555");
        t9.put("m", "6");
        t9.put("n", "66");
        t9.put("o", "666");
        t9.put("p", "7");
        t9.put("q", "77");
        t9.put("r", "777");
        t9.put("s", "7777");
        t9.put("t", "8");
        t9.put("u", "88");
        t9.put("v", "888");
        t9.put("w", "9");
        t9.put("x", "99");
        t9.put("y", "999");
        t9.put("z", "9999");
    }
    
    private static void doo() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\T9 Spelling\\C-large-practice.in"));
        int count=0;
        int x = Integer.valueOf(sc.nextLine());
        char[] inp;
        StringBuilder sb; 
        while(sc.hasNextLine()){
            sb = new StringBuilder("");
            inp = sc.nextLine().toCharArray();
            
            for (int i = 0; i < inp.length; i++) {
                String t9Out = t9(String.valueOf(inp[i]));
                if(sb.toString().endsWith(String.valueOf(t9Out.charAt(0)))){
                    sb.append(" ");
                }
                sb.append(t9Out);
            }
            count++;
            System.out.println("Case #"+count+": "+sb.toString());
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        populateT9();
        doo();
    }
}
