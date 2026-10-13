class Count_Pair_char {
    static void countPair(char arr[]){
        
        int count=0;
        int itr=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i<j && arr[i]=='a'&& arr[j]=='g'){
                    count++;
                    System.out.println(arr[i]+""+arr[j]);
                }
                itr++;
            }
        }
        System.out.println(itr);
        System.out.println(count);
    }
    public static void main(String[] args) {
        char arr[]={'a','b','e','g','a','g'};
        countPair(arr);
    }
}
