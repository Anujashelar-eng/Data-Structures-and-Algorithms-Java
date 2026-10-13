package DSA3;

class program8B {

    static void oddCube(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] % 2 != 0){

                    boolean alreadyPrinted = false;

                    // check previous elements
                    for(int x = 0; x <= i; x++){
                        for(int y = 0; y < arr[x].length; y++){

                            if(x == i && y == j)
                                break;

                            if(arr[x][y] == arr[i][j]){
                                alreadyPrinted = true;
                            }
                        }
                    }

                    if(!alreadyPrinted){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{3,5,6},{7,8,9}};
        oddCube(arr);
    }
}