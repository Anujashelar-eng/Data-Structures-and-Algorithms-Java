import java.util.*;
public class PrintReverse {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(50);
        al.add(60);

        for(int i=al.size()-1;i>=0;i--){  //O(N)
            System.out.print(al.get(i)+" ");
    }
    }
}
