class Client{
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currSum=0;
                if(start==0){
                   currSum=prefix[end];
                }else{
                    currSum=prefix[end]-prefix[start-1];
                }

                if(currSum>max){
                   max=currSum;
                }
            }
        }
        System.out.println(max);
    }
}