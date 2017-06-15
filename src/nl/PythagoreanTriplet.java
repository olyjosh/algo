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
public class PythagoreanTriplet {
    
    public static void main(String[] args) {
        //Euclidean, my own implementation
//        int lim=1000/3;
//        for (int i = 2; i <=lim; i++) {
//            for (int j = i+1; j <= lim; j++) {
//                int c = j*j+i*i,
//                        b=j*j-i*i,
//                        a=2*i*j;
//                if(1000==a+b+c){
//                    System.out.println("product: "+(a*b*c));
//                    break;
//                }
//            }
//        }
        
        pythTriplet(12);
    }
   
    /** Euclidean implementation I found online. This might work for smaller value while mine may not*/
    private static void pythTriplet(int sum) {
        int a, b, c;
        int sqrt = (int) Math.sqrt(sum);
        for (int n = 1; n <= sqrt; n++) {
            for (int m = n + 1; m <= sqrt; m++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (a + b + c == 1000) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
