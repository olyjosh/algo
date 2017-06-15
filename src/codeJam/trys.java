package codeJam;

/**
 *
 * @author Oljursh
 */
public class trys {

    /**
     * @param args the command line arguments
     */
    static{
        System.out.println("na so e be1");
    }
    
     static{
        System.out.println("na so e be");
    }
    
    static boolean isPalind(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s))return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalind("121"));
    
    }
}
 