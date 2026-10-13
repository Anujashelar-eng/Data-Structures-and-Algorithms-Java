package DSA1;
//check perfect number
//A Perfect Number is a positive number that is equal to the sum of its proper divisors 
// (excluding the number itself).
class Program7 {
    public static void main(String[] args){
        int n = 28;
        int sum = 0;

        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }

        if(sum == n){
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
