class Count_Digit {
    static void countDigit(int num){
        int lastDigit;
        int count=0;
       while(num!=0){
        lastDigit=num%10;
        count++;
        num=num/10;
       }
       System.out.println(count);
    }
    public static void main(String[] args) {
        int num=123;
        countDigit(num);
    }
}
