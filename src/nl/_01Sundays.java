package nl;

/** @author olyjosh */
public class _01Sundays {
    
    public static int year=1901;
    
    public enum Month {
        JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);

        int days;
        private Month(int days) {
            this.days=days;
        }

    }
        
    public static void main(String []args){
        long t = System.currentTimeMillis();
        byte day =3;  //first day of jan 1901 will be deinately be tuesday
        int count=0;
        while(year<=2000){
            //iterating over month
            for(Month e :Month.values()){
                int days=e.equals(Month.FEB) && ((year%4==0 && year%100!=0) || (year%400==0)) ? 29 : e.days;
                for (int i = 1; i <= days; i++) {
                    if(day==8)day=1;
                    if(i==1 && day==1){
                        count++;
                    }
                    day++;
                }
            }
            year++;
        }
        System.out.println(System.currentTimeMillis()-t);
        System.out.println(count+" Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)");
    }
    
}