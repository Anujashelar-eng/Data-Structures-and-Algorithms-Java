package Basic_Pattern_apna1;

class j3 {
    public static void main(String[] args) {
        int N=4;
        char ch='A';
        for(int i=0;i<N;i++){
            //ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
