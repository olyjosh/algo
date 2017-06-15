package nl;

/**
 *
 * @author olyjosh
 */
public class LongestChain {
    
    static int memo[];
    public static void main(String[] args) {
        memo = new int[1000000];
        int num=0; int largestChain=0;
//        for (int n = 0; n < 1000000; n++) {
//            int chain = chain(n);
//            if(chain>largestChain){
//                largestChain=chain;
//                num=n;
//            }
//        }
        System.out.println("Number with the largest chain is ");
        //chain(13, 0);
        chai(13);
        for (int i = 0; i < memo.length/4; i++) {
            System.out.println(memo[i]);
            
        }
    }
    
    static void chain(int n, int chain){
        if(n==1)memo[n]=1;//return 1;
        //if(memo[n]!=0)return chain+memo[n];
        else{
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1; 
            }
            
            System.out.println(n);
            chain++;
            memo[n]=chain;
            if(n!=1)chain(n, chain);
        }
        memo[n]=chain;
        System.out.println(chain);
        //return chain;
    }
    
    static void chai(int num){
        int i=1;int n = num;
        while (n != 1) {
            if (memo[n] != 0) {
                i += memo[n];
            } else {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                i++;
            }
            
        }
        memo[num]=i;
    }
    
    
}
