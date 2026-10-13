package DSA75;
import java.util.Arrays;

// Count pairs with given sum (without HashMap)
//this approch count unique pairs only so count=1;
class program4 {

    static void countPair(int arr[], int k){

        Arrays.sort(arr);   // Step 1: Sort array

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == k){
                count++;
                left++;
                right--;
            }
            else if(sum < k){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        int k = 6;
        int arr[] = new int[]{1,5,7,1};

        countPair(arr,k);
    }
}