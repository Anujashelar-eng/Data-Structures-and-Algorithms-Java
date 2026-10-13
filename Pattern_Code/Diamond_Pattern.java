//odd number=> Quadratic Equation 2x+1,2x-1
class Diamond_Pattern {
    public static void main(String[] args) {
        int N=4;
        //spaces
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }

        for(int i=N;i>=1;i--){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
           
        }
    }
}
