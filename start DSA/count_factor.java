class Count_factor{
    static void countFactor(int num){
        int count=1;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
         int num=10;
         countFactor(num);
    }
}