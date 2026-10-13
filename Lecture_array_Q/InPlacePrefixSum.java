
import java.util.Scanner;
class InPlacePrefixSum {
    static int[] inPlacePrefixSum(int arr[],int Q){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<Q;i++){
          int start=sc.nextInt();
          int end=sc.nextInt();
          if(start==0){
            sum=arr[0];
          }else{
            sum=arr[end]-arr[start-1];  
          }
           System.out.println("Sum:"+sum);
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[]={-3,6,2,4,5,2,8,-9,3,1};
       
        int Q=3;
       
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        inPlacePrefixSum(arr, Q);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
        
    }
}

//use prefix sum if more than one Query 
//for simgle Query no need of prefix sum
