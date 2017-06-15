/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codility;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Olyjosh
 */
public class SolutionWord {
    public int solution(String S) {
        // write your code in Java SE 8
        int re = -1;
        String[] split = S.split(" ");
        try {
            Stack ma = new Stack();
            for (int i = 0; i < split.length; i++) {
                String a = split[i];
                if (a.equals("POP")) {
                    ma.pop();
                } else if (a.equals("DUP")) {
                    ma.push(ma.peek());
                } else if (a.equals("+")) {
                    int d = (int) ma.pop();
                    int e = (int) ma.pop();
                    int sum = d + e;
                    ma.push(sum);
                } else if (a.equals("-")) {
                    int d = (int) ma.pop();
                    int e = (int) ma.pop();
                    int sub = d-e;
                    if(sub<0)return re;
                    ma.push(sub);
                } else {
                    //push to stack
                    ma.push(Integer.parseInt(a));
                }
            }
            return (int)ma.pop();
        } catch (EmptyStackException | ArrayIndexOutOfBoundsException e) {
            return -1;
        }
        
    }
}
