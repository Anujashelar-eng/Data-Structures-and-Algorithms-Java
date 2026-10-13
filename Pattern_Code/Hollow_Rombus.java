class Hollow_Pattern{

    public static void main(String[] args){
        
        int N=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=N+1;j++){
                if(i==1||i==N||j==1||j==N){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}