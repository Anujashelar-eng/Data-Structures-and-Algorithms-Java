package DSA2;
//check if two matrices are equal (By Element)
class program18 {

    static void checkEqual(int arr[][],int arr2[][]){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=arr2[i][j]){
                  flag=false;
                }
            }
        }
        System.out.println(flag);
    }
  public static void main(String args[]){

    int arr[][]=new int[][]{{1,2,3},{7,8,9},{4,5,6}};
    int arr2[][]=new int[][]{{1,2,3},{7,8,9},{4,5,6}};
     checkEqual(arr,arr2);
  }  
}
