import java.util.ArrayList;
public class Size {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);
        al.add(2,100);
        System.out.println(al);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println();
    }
}
