package DSA2;
//find frequency of each element in an array
import java.util.*;
class program8 {
    static void countF(int arr[]){
       Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length-1;i++){
           if(arr[i]==arr[i+1]){
              count++;
           }else{
            System.out.println(arr[i]+"->"+count);
            count=1;
           }
        }
        System.out.println(arr[arr.length-1]+"->"+count);
    }

    public static void main(String[] args){
       int arr[]={1,1,2,2,3,4,5};

       countF(arr);
    }
}
