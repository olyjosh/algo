package Contest;

import java.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author Oljursh
 */
public class VeryLongInteger {
   public static void main(String[] args) throws FileNotFoundException {
        
       //Scanner sc = new Scanner(System.in);
       Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\All\\Test Cases\\VeryLongInteger.txt"));
       BigInteger x,z = null;
       int y=0; 
       while(sc.hasNext()){
            //String x = sc.nextLine();
           x = new BigInteger(sc.nextLine());
           char b[] = x.toString().toCharArray();
           String p = "";
           for (int i = 0; i < b.length; i++) {
               p=String.valueOf(b[i]);
               y+=Integer.valueOf(p);
           }
           System.out.println(y);
           y=0;
        }
    }
}