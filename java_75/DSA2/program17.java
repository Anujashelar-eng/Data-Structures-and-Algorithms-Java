package DSA2;
//find the row with maximun sum
class program17 {
    static void maxRowSum(int arr[][]){
        int sum;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr[0].length;i++){
            sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println("maxsum"+maxsum);
    }
    public static void main(String[] args){
        int arr[][]=new int[][]{{1,2,3},{7,8,9},{4,5,6}};

        maxRowSum(arr);
    }
}
