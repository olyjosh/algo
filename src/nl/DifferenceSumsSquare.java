/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

/**
 *
 * @author olyjosh
 */
public class DifferenceSumsSquare {
    
    public static void main(String[] args) {
        final int n=100;
        int sqOfSum = (n*(n+1)*(2*n+1))/6;
        int sumOfsq = (n*(1+n))/2; sumOfsq*=sumOfsq;
        System.out.println("Difference is "+(sumOfsq-sqOfSum));
    }
}
