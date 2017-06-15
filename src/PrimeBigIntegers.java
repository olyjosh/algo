

public class PrimeBigIntegers {

    static int[] primeArr;
            
    static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2)return true;
        if(n%2==0) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0)return false;
        }
        return true;
    }
    
    static boolean isBigPrime(int n){
        if(n==2){return true;}
        //fill array with smaller prime numbers
        primeArr = new int[4792];
        int counter=0;
        for (int i = 2; i < 46340.95; i++) {//(2,147,483,647 is maximum 32-bit integer. )therefore 2^31-1=46340.95) 
            if(isPrime(i)){primeArr[counter]=i;counter++;}
        }
        
        for (int i = 0; i <(int)Math.sqrt(n); i++) {
            if(n%primeArr[i]==0)return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isBigPrime(57));
    }
}
