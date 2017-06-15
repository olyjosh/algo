public class GcdLcmPrime{
    static long GCD(long a, long b){
        if(b==0)return a;
        else return GCD(b,a%b);
    }

    static long lcm(int a, int b){
        return a*b/GCD(a,b);
    }
    
    static void primeSieve (int L, int U){ //Still need modification as it can on solve L>=3 i.e 2 not included;
        int i,j,d;
        d=U-L+1;
        
        boolean[] flag = new boolean[d];
        for ( i = 0; i < d; i++) flag[i]=true;
        
        for(i=(L%2);i<d;i+=2){
            if(i!=0) flag[i]=false;
        }
        
        for(i=3;i<=Math.sqrt(U);i+=2){
            if(i>L && !flag[i-L]) continue;
            
            j=L/i*i;    if(j<L)j+=i;
            if(j==i)j+=i;
            
            j-=L;
            for(;j<d;j+=i)flag[j]=false;
        }
        
        if(L<=1)flag[1-L]=false;
        if(L<=2)flag[2-L]=false;
        
        for(i=0;i<d;i++)if(flag[i]){
            System.out.println(L+i);
        }
    }
    
    static boolean isPrime(int a){
        if(a==1)return false;
        if(a==2)return true;
        if (a%2 == 0)return  false;
        int sqrt=(int) Math.sqrt(a);
        for (int i=2; i<=sqrt; i++){
            if (a%i == 0) return false;
        }
        return true;
    }
    
    
    
    public static void main(String[] args) {
        int counter=0;
        
        for (int i = 0; i <= 20; i++) {
            if(isPrime(i))
                System.out.println(i);//counter++;
        }
        //System.out.println("there are "+counter+" prime numbers");

    }
}