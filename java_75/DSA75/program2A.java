package DSA75;
// sort an array of 0s, 1s and 
//Counting method
class program2A {
    public static void main(String args[]){
        int arr[] = new int[]{0,2,1,2,0};

        int count0 = 0, count1 = 0, count2 = 0;

        for(int num : arr){
            if(num == 0) count0++;
            else if(num == 1) count1++;
            else count2++;
        }

        int index = 0;

        while(count0-- > 0) arr[index++] = 0;
        while(count1-- > 0) arr[index++] = 1;
        while(count2-- > 0) arr[index++] = 2;

        for(int num : arr)
            System.out.print(num + " ");
    }
}