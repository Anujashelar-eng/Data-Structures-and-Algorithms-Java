package DSA1;

class program9 {
    public static void main(String[] args){
        int n=632;
        int temp=n;
        int rem=0;

        while(temp!=0){
           int digit=temp%10;
           rem=rem*10+digit;
           temp=temp/10;
        }
        n=rem;
        System.out.println(n);
    }
}
