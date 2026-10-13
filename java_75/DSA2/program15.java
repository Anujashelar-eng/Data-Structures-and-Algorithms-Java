package DSA2;
//find the sum of each row in 2D array
class program15 {
    static void sumRow(int arr[][]){
        //System.out.println(arr[0].length);
        int sum;
        //System.out.println(arr.length);
        for(int i=0;i<arr[0].length;i++){
            sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

         sumRow(arr);


    }
}
