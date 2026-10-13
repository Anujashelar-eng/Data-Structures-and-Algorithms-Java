package DSA1;
import java.util.*;
//Find the Duplicate Number
class pro12 {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,4,5};

        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
         
        //  for(int i = 0; i < arr.length; i++) {
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] == arr[j]) {
        //             System.out.println(arr[i]);
        //             return; // stop after finding duplicate
        //         }
        //     }
        // }
    }
}
//O(n log n)