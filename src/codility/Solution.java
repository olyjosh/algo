package codility;

/**
 *
 * @author Olyjosh
 */
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int thresh = 1000000000;
        int n = A.length;
        
        int slices = 0;
        long sum =A[0];
        for (int i = 0; i < n; i++) {
            if(i>0)sum=0;
            int c=i+1;
            for (int j = c; j < n; j++) {
                sum += A[j];
                if (sum == 0) {
                    slices = slices + 1;
                    System.out.println("("+ i+","+j +")");
                }
                
                if (slices > thresh) {
                    slices = -1;
                    break;
                }
            }
            if (A[i] == 0) {
                slices = slices + 1;
                System.out.println(A[i] + "=0   (" + i + "," + i + ")");
            }
        }
        
        return slices;
    }
}