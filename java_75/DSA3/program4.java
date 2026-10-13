package DSA3;
//check Strong number or not
//A Strong Number is a number in which the sum of the factorial of each digit is equal to the number itself.
class program4 {
    public static void main(String[] args){
        int num=145;

        int fact=1;
        int sum=0;
        int temp=num;
        while(temp!=0){
            int digit=temp%10;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            fact=1;
            temp=temp/10;
        }

        if(num==sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
