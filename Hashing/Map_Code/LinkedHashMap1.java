import java.util.*;
class LinkedHashMap1 {
    public static void main(String args[]){

        //Order is maintain
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",123);
        lhm.put("Us",34);
        lhm.put("china",67);

        //order is not maintain
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",234);
        hm.put("china",90);
        hm.put("Iran",78);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
