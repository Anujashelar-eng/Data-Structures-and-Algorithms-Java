
//HashMap Operation =Constant Time O(1)
//key Not exist return null
import java.util.HashMap;
class HashMapDemo{
    public static void main(String[] args) {
        
        HashMap<String,Integer> hm=new HashMap<>();
        //insert
        
        hm.put("India",100);

        //Get
        hm.get("India");    //100

        //ContainsKey 
        hm.containsKey("India");   //true
     
        //remove
        hm.remove("India");

        //size
        hm.size();

        //Is Empty
        hm.isEmpty();

        //clear  all map
        hm.clear();
    }
}