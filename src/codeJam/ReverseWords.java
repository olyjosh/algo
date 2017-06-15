package codeJam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class ReverseWords {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Oljursh\\Documents\\CodeJam\\reverse world\\B-large-practice.in"));
        StringBuilder sb;
        int i = 0;
        int x = Integer.valueOf(sc.nextLine());
        while(sc.hasNextLine()){
            String nextLine = sc.nextLine();
            String[] split = nextLine.split(" ");
            sb = new StringBuilder();
            String out = null;
            for (int j = split.length-1; j > -1; j--) {
                out = sb.append(split[j]).append(" ").toString().trim();
            }
            i++;
            System.out.println("Case #"+i+": "+out);
        }        
    }
}
