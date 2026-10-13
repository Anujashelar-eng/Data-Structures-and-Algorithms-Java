package DSA1;
// Factorial of number
class program2 {
    public static void main(String[] args){
      int n=5;//1*1, 1*2 ,2*3 ,6*4 ,24*5
      int fact=1;

      for(int i=1;i<=n;i++){
         fact=fact*i;
      }
      System.out.println(fact);
    }
}
