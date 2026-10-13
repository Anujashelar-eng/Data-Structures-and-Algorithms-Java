package DSA2;
//find the sum of each column in 2D array
class program16 {

    static void colSum(int arr[][]){
        System.out.println(arr.length);
        int sum;
        for(int i=0;i<arr[0].length;i++){
            sum=0;
            for(int j=0;j<arr.length;j++){
                sum=sum+arr[j][i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        int arr[][]=new int[][]{{1,2,3},{4,5,6}};

        colSum(arr);
    }
}
