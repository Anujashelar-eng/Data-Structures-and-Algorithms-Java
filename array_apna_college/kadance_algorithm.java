//Maximum Subarray Sum
class kadance_algorithm {
 public static void main(String[] args){
    int arr[]={1,2,-4,5,-3,3};
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){

        currSum=currSum+arr[i];
        
        if (currSum<0) {
            currSum=0;
        }

        maxSum=Math.max(currSum,maxSum);
    }
    System.out.println(maxSum);
 }   
}
