public class DateOneTest {
    public static void main(String args[]) {
        DateOne d = new DateOne();
        d.day = -8;
        d.month = 20;
        d.year = -1234;
        
        System.out.println("日期為"+d.year+"/"+d.month+"/"+d.day);
        
        d.day = 28;
        d.month = 2;
        d.year = 2018;
        
        System.out.println("日期為"+d.year+"/"+d.month+"/"+d.day);
        
        d.day = 30;
        d.month = 2;
        d.year = 2018;
        
        System.out.println("日期為"+d.year+"/"+d.month+"/"+d.day);
       
    }// end main

} // end class

