import java.util.*;
class TreeMap1 {
    public static void main(String[] args){

        //Sorted based on the key
        TreeMap<String,Integer> tm=new TreeMap();
        tm.put("India",101);
        tm.put("China",345);
        tm.put("Bhutan",78);
        tm.put("Us",34);

        System.out.println(tm);


        //order is not maintain
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",101);
        hm.put("China",345);
        hm.put("Bhutan",78);
        hm.put("Us",34);
         System.out.println(hm);
    }
}
