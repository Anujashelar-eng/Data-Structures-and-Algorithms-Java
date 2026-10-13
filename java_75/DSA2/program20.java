package DSA2;
// find the sum of primary and secondary diagonal elements of a square matrix
class program20 {

    static void sum(int arr[][]){
        int sump = 0;
        int sums = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                // Primary diagonal
                if(i == j){
                    sump = sump + arr[i][j];
                }

                // Secondary diagonal
                if(i + j == n - 1){
                    sums = sums + arr[i][j];
                }
            }
        }

        System.out.println("Primary Diagonal Sum = " + sump);
        System.out.println("Secondary Diagonal Sum = " + sums);
    }

    public static void main(String[] args){
        int arr[][] = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        sum(arr);
    }
}