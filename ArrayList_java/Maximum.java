import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        
     ArrayList<Integer> al=new ArrayList<>();

     al.add(20);
     al.add(100);
     al.add(78);
     al.add(50);
     
     int max=Integer.MIN_VALUE;
     for(int i=0;i<al.size();i++){
        // if(max<al.get(i)){
        //     max=al.get(i);
        // }

        max=Math.max(max,al.get(i));
     }
     System.out.println(max);
    }
}
