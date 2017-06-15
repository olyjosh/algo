
package permuteStuff;

/**
 *
 * @author Olyjosh
 */
public class index {
    
    int test[] = {-1,3,-4,5,1,-6,2,1};
//    public int solution(int[] A) {
//        // write your code in Java SE 8
//        int count;
//        for (int i = 0; i < A.length; i++) {
//            sumL+=A[i];
//            sumR
//        }
//    }
    
    public int sumL(int upto, int[] A){
        int sumL=0;
        for (int i = 0; i < upto; i++) {
            sumL+=A[i];
        }
        return sumL;
    }
    
    public int sumR(int upto, int[] A){
        int sumR=0;
        //int downFrom =A.length-upto;
        //System.out.println(A.length);
        for (int i = A.length-1; A.length-1 > upto+3; i--) {
            System.out.println(i);
            sumR+=A[i];
        }
        return sumR;
    }
   
}
