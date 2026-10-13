import java.util.Scanner;

class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = 1;

        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                max = i;
            }
        }

        System.out.println(max);
    }
}
//Brute force works in O(n), but I prefer Euclidean algorithm which works in O(log n)”
//Highest Common factor 