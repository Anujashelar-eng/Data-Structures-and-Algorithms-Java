class RightMax_CarryForward {
    static void rightMax(int arr[]){
        int N=arr.length;
        int rightMax[]=new int[arr.length];
        rightMax[N-1]=arr[N-1];
        for(int i=N-2;i>=0;i--){
            if(arr[i]>rightMax[i+1]){
                rightMax[i]=arr[i];
            }else{
                rightMax[i]=rightMax[i+1];
            }
        }

        for(int i=0;i<rightMax.length;i++){
            System.out.print(rightMax[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={-3,6,2,4,5,2,8,-9,3,1};
        rightMax(arr);
    }
}
