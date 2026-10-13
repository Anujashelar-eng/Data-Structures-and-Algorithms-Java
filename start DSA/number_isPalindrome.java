class number_isPalindrome {
    static void isPalindrome(int num){
        int rev=0;
        int temp=num;
        while(num!=0){
            int Digit=num%10;
            rev=rev*10+Digit;
            num=num/10;
        }
        System.out.println((rev==temp)?true:false);
    }
    public static void main(String[] args) {
        int num=111;
        isPalindrome(num);
    }
}
