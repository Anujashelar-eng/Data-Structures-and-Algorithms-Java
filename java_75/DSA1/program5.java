package DSA1;
//print the even digits from number
class program5 {
    public static void main(String[] args){
        int n=1234;

        while(n!=0){
            int reminder=n%10;
            if(reminder%2==0){
                System.out.println(reminder);
            }
            n=n/10;
        }
    }
}
