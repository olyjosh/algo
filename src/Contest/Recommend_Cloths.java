package Contest;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Oljursh
 */
public class Recommend_Cloths {

    /**
     * @param args the command line arguments
     */
    static final Hashtable[] conbinations;
    static{
        conbinations = new Hashtable[8];
        conbinations[0] = new Hashtable();
        conbinations[0].put("eyes", "green");
        conbinations[0].put("pants", "blue");
        conbinations[0].put("shirt", "black");
        conbinations[1] = new Hashtable();
        conbinations[1].put("eyes", "green");
        conbinations[1].put("pants", "black");
        conbinations[1].put("shirt", "white");
        conbinations[2] = new Hashtable();
        conbinations[2].put("eyes", "brown");
        conbinations[2].put("pants", "blue");
        conbinations[2].put("shirt", "pink");
        conbinations[3] = new Hashtable();
        conbinations[3].put("eyes", "brown");
        conbinations[3].put("pants", "black");
        conbinations[3].put("shirt", "green");
        conbinations[4] = new Hashtable();
        conbinations[4].put("eyes", "blue");
        conbinations[4].put("pants", "blue");
        conbinations[4].put("shirt", "blue");
        conbinations[5] = new Hashtable();
        conbinations[5].put("eyes", "blue");
        conbinations[5].put("pants", "black");
        conbinations[5].put("shirt", "gray");
        conbinations[6] = new Hashtable();
        conbinations[6].put("eyes", "gray");
        conbinations[6].put("pants", "blue");
        conbinations[6].put("shirt", "yellow");
        conbinations[7] = new Hashtable();
        conbinations[7].put("eyes", "gray");
        conbinations[7].put("pants", "black");
        conbinations[7].put("shirt", "red");
    }
    
    private static String getIt(String key1, String value1, String key2, String value2){
        for (int i = 0; i < conbinations.length; i++) {
            if(conbinations[i].get(key1).toString().equals(value1)&&conbinations[i].get(key2).toString().equals(value2)){
                if(key1.equals("eyes")&&key2.equals("pants"))return conbinations[i].get("shirt").toString()+" shirt";
                if(key1.equals("pants")&&key2.equals("eyes"))return conbinations[i].get("shirt").toString()+" shirt";
                if(key1.equals("pants")&&key2.equals("shirt"))return conbinations[i].get("eyes").toString()+" eyes";
                if(key1.equals("shirt")&&key2.equals("pants"))return conbinations[i].get("eyes").toString()+" eyes";
                if(key1.equals("eyes")&&key2.equals("shirt"))return conbinations[i].get("pants").toString()+" pants";
                if(key1.equals("shirt")&&key2.equals("eyes"))return conbinations[i].get("pants").toString()+" pants";
                
                
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String inp=sc.nextLine();
            String[] split = inp.split(" ");
            String[] split1 = split[0].split(":");
            String[] split2 = split[1].split(":");
            String it = getIt(split1[0],split1[1],split2[0],split2[1]);
            if(split[2].startsWith("what") && it!=null){
                System.out.println("if your "+split1[0]+" are "+split1[1]+" and you have "+split2[1]+" "+split2[0]+" I recommend you buy "+it);
            }if(split[2].startsWith("Do")&& it!=null){
                System.out.println(split2[1]+" "+split2[0]+" and "+split1[1]+" "+split1[0]+" goes perfect on "+it+" person");
            }if(it==null)System.out.println("sorry I don't have anything for you, sir");
        }
    }

}
