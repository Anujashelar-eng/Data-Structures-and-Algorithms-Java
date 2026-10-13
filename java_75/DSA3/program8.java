package DSA3;
//program to iterate over 2D integer array and print the elements 
//whose cube is an odd number

//👉 Cube of an odd number is always odd
//👉 Cube of an even number is always even

// print elements whose cube is odd
class program8 {

    static void oddCube(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] % 2 != 0){   // directly check odd
                    System.out.println(arr[i][j]);
                }

            }
        }
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{3,5,6},{7,8,9}};
        oddCube(arr);
    }
}