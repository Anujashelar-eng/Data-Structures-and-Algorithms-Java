package DSA3;
class program1 {
    public static void main(String[] args){
        int n =-45;   // try with 0 or -12345
        int count = 0;

        if(n == 0){
            count = 1;
        } else {
           // n = Math.abs(n);   // handles negative numbers

            while(n != 0){
                count++;
                n = n / 10;
            }
        }

        System.out.println(count);
    }
}