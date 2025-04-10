import java.util.ArrayList;

public class map1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(90);
        list.add(100);
        for(int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
        for(Integer x: list){
            System.out.println(x);
        }
        // System.out.println("List is: "+list);
        // System.out.println("Size is "+list.size());
        // System.out.println("List is emptt:"+list.isEmpty());
    }
}
