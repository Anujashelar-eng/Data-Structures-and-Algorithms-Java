class Prime_number {
    static boolean isPrimeNumber(int num){
        int count=0;
        for(int i=2;i<num;i++){
           if(num%i==0){
              count++;
           }
        }
        if(count>0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        int num=4;
        System.out.println(isPrimeNumber(num));
    }
}
