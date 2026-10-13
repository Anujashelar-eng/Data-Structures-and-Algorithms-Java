package DSA2;
//find the smallest element in 2D array
class program19 {
    static void smallest2D(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }

        System.out.println(min);
    }
    
    public static void main(String[] args){
        int arr[][]=new int[][]{{10,15,3,4},{5,2,1,9}};

        smallest2D(arr);
    }
}
