package DSA3;
//check Armstrong Number
//number that is equal to the sum of its digits raised to the power of the number of digits.
class program5 {
    public static void main(String args[]){
        int num = 153;
        int temp = num;
        int count = 0;

        // Count digits
        while(temp != 0){
            count++;
            temp = temp / 10;
        }
        temp = num;
        int sum = 0;

        // Calculate sum of digits^count
        while(temp != 0){
            int digit = temp % 10;
            int pow=1;
            int c=count;
            while(c!=0){
                pow=pow*digit;
                c--;
            }
            System.out.println(digit);
           //sum = sum + (int)Math.pow(digit, count);
           sum=sum+pow;
            temp = temp / 10;
        }

        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}