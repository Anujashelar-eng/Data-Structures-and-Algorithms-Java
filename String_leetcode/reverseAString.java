class reverseAString {
    public static void main(String[] args){
        String str="Dassault";
        
        //Method 1
        // char[] arr=str.toCharArray();
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]);
        // }

        //Method 2
        StringBuffer sb=new StringBuffer(str);
        sb=sb.reverse();
        str=sb.toString();
        System.out.println(str);
    }
}
