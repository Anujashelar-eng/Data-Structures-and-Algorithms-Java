public class Character_Pattern {
    public static void main(String[] args) {
        char ch='A';
        int N=4;
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
//node: number of character== line number