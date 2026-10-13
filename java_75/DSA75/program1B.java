package DSA75;
// find the missing number
class program1 {

    static void findMissing(int arr[]){

        int n = arr.length + 1;  // because one number is missing

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int i = 0; i < arr.length; i++){
            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,8,9};
        findMissing(arr);
    }
}
