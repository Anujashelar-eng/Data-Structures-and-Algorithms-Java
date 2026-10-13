class Count_Pair_char_optimized {
    static void countPair(char arr[]){
        int count=0;
        int pair=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count++;
            }else if(arr[i]=='g'){
                pair=pair+count;
            }
        }

       
        //System.out.println(count);
        System.out.println(pair);
    }
    public static void main(String[] args) {
        char arr[]={'a','b','e','g','a','g'};
        countPair(arr);
    }
}

