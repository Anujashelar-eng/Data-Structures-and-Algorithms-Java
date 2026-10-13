package DSA3;
// return first palindrome string
class program7 {

    static void checkPallindrome(String[] arr){

        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            int n = arr[i].length();

            for(int j = 0; j < n/2; j++){
                if(arr[i].charAt(j) != arr[i].charAt(n-1-j)){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("First Palindrome: " + arr[i]);
                return;   // stop after first palindrome
            }
        }

        System.out.println("No Palindrome Found");
    }

    public static void main(String[] args){
        String arr[] = {"Vaishnavi","Nandini","madam","Akanksha","Sam","Riya"};
        checkPallindrome(arr);
    }
}