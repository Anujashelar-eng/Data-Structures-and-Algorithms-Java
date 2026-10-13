package Set_Codes;
import java.util.*;
class HashSet1 {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(1);
        hs.add(3);
        hs.add(3);
        hs.add(4);

        System.out.println(hs);

        if(hs.contains(2)){
            System.out.println("Set contains 2");
        }

        if(hs.contains(3)){
            System.out.println("set contains 3");
        }

        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        hs.clear();
        System.out.println(hs.isEmpty());
    }
}
