//InBuilt Class
//Linear data Structure
//dynamic Size(No Need to declare Size)
//primitive data types can't be stored directly(not in store in ArrayList)
//ArrayList Store Objects(Not primitive Only)
//In Java Class Name is Start with Capital Letter 
//java Collection Framework 
//In Cpp Vector Works the Same 
//formula to double size
import java.util.ArrayList;
public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();//<Type of data we want store>
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        list1.add(10); //O(1) //Constant Time
        list1.add(20); //O(1)
        list1.add(30);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        list1.add(1,9); //O(N)


        //Get Operation ==> O(1)
        int num=list1.get(2);
        System.out.println(num);


        //Remove Element/Delete liner time O(N)
        list1.remove(3);
        System.out.println(list1);

        //Set Element at index
        list1.set(2,10);
        System.out.println(list1);
      
        //Contains
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(10));

    }
}
