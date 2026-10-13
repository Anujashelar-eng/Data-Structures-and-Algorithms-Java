
//A leap year is a year that has 366 days instead of 365.
// Extra day = February 29 
//Earth takes 365.25 days to complete one orbit around the Sun.
//That extra 0.25 day each year becomes 1 full day in 4 years.
//1900 get divide by the 4 so not only four will be the right
import java.util.*;
class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if((year%400==0)||(year%4==0 && year%100!=0)){
          System.out.println("Leap year");
        }
    }
}
