package DSA1;
//Print Fibonacci Series up to N
//Fibonacci series is a sequence where each number is the sum of the previous two numbers.
//The series starts with 0 and 1.
//F(n) = F(n-1) + F(n-2)
class Program8 {
   public static void main(String[] args){
      int n = 10;
      int firstNumber = 0;
      int secondNumber = 1;

      System.out.print(firstNumber + " " + secondNumber + " ");

      for(int i = 2; i < n; i++){
         int next = firstNumber + secondNumber;
         System.out.print(next + " ");
         firstNumber = secondNumber;
         secondNumber = next;
      }
   }   
}