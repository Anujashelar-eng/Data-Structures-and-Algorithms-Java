package Set_Codes;
import java.util.*;
class HashSet_Iteration{
    public static void main(String[] args){
        HashSet<String> cities=new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");

        Iterator itr=cities.iterator();
        //Iterator
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
        //Advance for loop
        for(String city:cities){
            System.out.println(city);
        }
    }
}