class SubArr_MinMax {
    static void length(int arr[]){
        int minLength=Integer.MAX_VALUE;
        int minValue=Integer.MAX_VALUE;
        int maxValue=Integer.MIN_VALUE;
        int len=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
            if(arr[i]<minValue){
                minValue=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==minValue){
              for(int j=i+1;j<arr.length;j++){
                if(arr[j]==maxValue){
                    len=j-i+1;
                    if(minLength>len){
                        minLength=len;
                    }
                }
              }
            }else if(arr[i]==maxValue){
                 for(int j=i+1;j<arr.length;j++){
                if(arr[j]==minValue){
                    len=j-i+1;
                    if(minLength>len){
                        minLength=len;
                    }
                }
              }
            }
        }
        System.out.println(minLength);
       
    }
    public static void main(String[] args) {
        int arr[]={2,2,6,4,5,1,5,2,6,4,1};
        length(arr);
    }
}
