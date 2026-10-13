// Collections ==> Class in java
// Collection ==> Interface in java
//Compartor In Java ==> Functions in Java Define Logic
//.sort() ==> Optimized 
import java.util.ArrayList;
import java.util.Collections;

public class SortBYArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(50);
        al.add(60);
        al.add(2);

        
        Collections.sort(al); //ascending Order Sort
        System.out.println(al);
         
        //descending Order
        Collections.sort(al,Collections.reverseOrder());
        // Second Parametr is comparator
        System.out.println(al);
    }
}
