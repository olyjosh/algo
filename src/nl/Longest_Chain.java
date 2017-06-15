package nl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author olyjosh
 */
public class Longest_Chain {

    static int store[] = new int[1000000]; 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(operation(13));
        System.out.println("");
//        for (int i = 0; i < store.length; i++) {
//            System.out.print(store[i]+", ");
//        }
    }
    
    static Map<Integer,Integer> hm;
    static int c;
    static int operation(int n){
        int r = 0;int num =n;
        if(n==1 && store[n]==0){store[n]=1;return 1;}
        if(store[n]!=0)return store[n];
        else{
            hm=new LinkedHashMap<>();
            
            while(n!=1){
                //hm.put(n, 0);
                if (n % 2 == 0) n /= 2;
                else n = 3 * n + 1;
                c++;
                if (store[n] != 0) {
                    hm.put(n, c + store[n]);
                    //System.out.println("PUT AND BREAK"+c);
                    break;
                } else {
                    //System.out.println(n+ "PUT "+c);
                    hm.put(n, c);
                }
            }
            
            c=0;
            int sm=1;
            
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                int key =r= e.getKey();
                int value = e.getValue();
                sm+=value;
                store[key]=sm;
                System.out.println("At: "+key+" = "+sm+"   ---value "+value);
            }
            return store[r];
            
        }
        
    }
    
}
