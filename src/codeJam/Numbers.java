/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    static BigDecimal bg;
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\C-small-practice.in"));
        String inp =sc.nextLine();
        
        int i=1;
        while(sc.hasNextLine()){
            int n = Integer.valueOf(sc.nextLine());
            String toString = calcBig(n).toString();
            
            System.out.println("Case #"+i+": "+digit3(calcBig(n)));
            i++;
        }
    }
    
    private static BigInteger calcBig(int in){
        double ans = 3+Math.sqrt(5);
        bg= new BigDecimal(ans);
        return bg.pow(in).toBigInteger();
    }
    
    static String digit3(BigInteger bi){
        String txt = bi.toString();
        if(txt.length()<3){
            int a = 3-txt.length();
            if(a==2)return "00".concat(txt);
            if(a==1)return "0".concat(txt);
        }else if(txt.length()>3){
            return txt.substring(txt.length()-3, txt.length());
        }
        return txt;
    }
}
