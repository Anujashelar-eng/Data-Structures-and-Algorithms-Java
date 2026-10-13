package DSA3;
import java.util.Scanner;

class program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        
        while(num != 0){
            int digit = num % 10;
            
            if(digit % 2 == 1){
                sum = sum + (digit * digit);
            }
            
            num = num / 10;
        }
        
        System.out.println("Sum of square of odd digits: " + sum);
    }
}