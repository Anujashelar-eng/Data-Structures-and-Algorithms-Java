class Inverted_half_pyramid {
    public static void main(String[] args) {
        int N=5;
        for(int i=0;i<N;i++){
            int num=1;
            for(int j=0;j<N-i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
