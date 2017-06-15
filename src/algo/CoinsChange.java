/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.Hashtable;

/**
 *
 * @author Oljursh
 */
public class CoinsChange {

    public static Hashtable<Integer, Integer> solved = new Hashtable<Integer, Integer>();

    public static int kovanci(int[] k, int val) {

        if (val <= 0) {
            return val;
        }

        int min = -1; //default: if it's not solvable  
        for (int i = k.length - 1; i >= 0; i--) {

            int newVal = val - k[i];
            int r;

            if (solved.get(newVal) != null) {

                r = solved.get(newVal) + 1;
            } else {
                //try to solve the smaller problem  
                r = kovanci(k, newVal);
                //if the solution is valid, the new solution is smaller_solution + 1  
                if (r >= 0) {
                    r++;
                }
            }

            if ((r > 0) && (min == -1 || r < min)) {
                min = r;
            }
        }

        solved.put(val, min);
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//coin denominations, hoping that supply is unlimited
        System.out.println("minimum is: " + kovanci(arr, 29));

    }
}