import java.util.*;
// Strings are immutable
// ✔ But rev reference is updated to new objects each time
//A new String object is created
class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine().toLowerCase().trim();
        int n = str.length();

       
        String rev="";
        for(int i = n-1; i >=0 ; i--){
           rev+=str.charAt(i);
        }

        System.out.println(rev);
    }
}

// String str = "hello";
// String rev = new StringBuilder(str).reverse().toString();
// System.out.println(rev);