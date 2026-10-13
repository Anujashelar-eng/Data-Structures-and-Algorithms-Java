package Set_Codes;
import java.util.*;
class CountUniqueEleSet {

   static void unique(int arr[]){
    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    for(int i = 0; i < arr.length; i++){
        set.add(arr[i]);
    }

    int result[] = new int[set.size()];
    int i = 0;

    for(int num : set){
        result[i++] = num;
    }

    // print array
    for(int val : result){
        System.out.print(val + " ");
    }
}
    public static void main(String[] args){
        int arr[]=new int[]{1,3,3,3,4,5,5};
        unique(arr); 
    }
}
