import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();

        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}