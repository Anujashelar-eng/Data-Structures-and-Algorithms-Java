public class PrintAllEleSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int start=3;
        int end=7;
        int count=0;
        for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println(count);
    }
}
