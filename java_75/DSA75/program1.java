package DSA75;
//find the missing number
//Expected Sum=n(n+1)/2

class program1 {

    static void findMissing(int arr[]){

        int sum=0;
        int n=arr[arr.length-1];
        int sum2=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }
        System.out.println(sum2-sum);
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,8,9};

        findMissing(arr);
    }
}
