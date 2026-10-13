import java.util.*;
class Iteration_HashMap {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        //putting the items in HashMap

        hm.put("India",102);
        hm.put("Us",123);
        hm.put("Nepal",122);
        hm.put("Bhutan",245);
        hm.put("england",356);

        //storing all keys in the Set //entrySet() explore it give both key and values
        Set<String>keys=hm.keySet();  //mentioning String is imp
        System.out.println(keys);

        for (String k:keys) {
            System.out.println("key:"+k+", Value"+hm.get(k));
        }
    }
}
