import java.util.HashSet;
import java.util.Set;

class RemoveDuplicateEle {
    void remove(int arr[]){
     Set<Integer> obj=new HashSet<>();
     for(int nums:arr){
        obj.add(nums);
     }

     // Step 2: Convert to array
        Integer arr2[] = obj.toArray(new Integer[0]);

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
   }
   public static void main(String[] args) {
    RemoveDuplicateEle obj1=new RemoveDuplicateEle();
     int arr[]={1,6,5,3,2,2,4,5};
     obj1.remove(arr);
   }    
}
