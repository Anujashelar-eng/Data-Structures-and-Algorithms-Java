import java.util.*;

class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine().toLowerCase().trim();
        int n = str.length();

        boolean flag = true;   // assume palindrome

        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
