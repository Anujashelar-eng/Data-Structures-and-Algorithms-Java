import java.util.*;
class HashMapOperation {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();

        //put into HashMap
        hm.put("India",101);
        hm.put("china",200);
        hm.put("us",120);
        hm.put("australia",30);

        //get into HashMap
        System.out.println(hm.get("us"));

        //containsKey 
        System.out.println(hm.containsKey("china"));

        //Size
        System.out.println(hm.size());

        //remove
        System.out.println(hm.remove("australia"));

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
