import java.util.ArrayList;

public class Swap2Num {
    public static void main(String[] args) {
     ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(50);
        al.add(60);
        al.add(58);
        al.add(34);   

        System.out.println(al);
        int temp=al.get(2);
        al.set(2,al.get(4));
        al.set(4,temp);
        System.out.println(al);
    }
}
