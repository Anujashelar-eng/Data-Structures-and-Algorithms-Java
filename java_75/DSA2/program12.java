package DSA2;
//check a string is pallindrome
class program12 {

    static void palindrome(String str) {
    int n = str.length();
    boolean flag = true;  // assume palindrome

    for (int i = 0; i < n / 2; i++) {
        if (str.charAt(i) != str.charAt(n - 1 - i)) {
            flag = false;
            break;
        }
    }

    System.out.println(flag ? "Palindrome" : "Not Palindrome");
   }
  public static void main(String[] args){
    String str="anuja";

    palindrome(str);
  }
}
