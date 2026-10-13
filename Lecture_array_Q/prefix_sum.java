import java.util.Scanner;
class PrefixSum{
    public static void main(String[] args){
        int arr[]={-3,6,2,4,5,2,8,-9,3,1};
        int preArr[]=new int[arr.length];
        int Q=3;
        preArr[0]=arr[0];
        for(int i=1;i<preArr.length;i++){
            preArr[i]=preArr[i-1]+arr[i];
        }
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<Q;i++){
          int start=sc.nextInt();
          int end=sc.nextInt();
          if(start==0){
            sum=preArr[0];
          }else{
            sum=preArr[end]-preArr[start-1];  
          }
           System.out.println("Sum:"+sum);
        }
    }
}

//use prefix sum if more than one Query 
//for simgle Query no need of prefix sum