class Inverted_Pyramid {
   public static void main(String[] args) {
     int N=4;
     for(int i=0;i<N;i++){
        //for printing Space
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        // for print Star
        for(int j=0;j<=i;j++){
           System.out.print("*");
        }
        System.out.println();
     } 
    }   
}
