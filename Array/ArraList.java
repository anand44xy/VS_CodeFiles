package Array;

import java.util.List;
import java.util.ArrayList;

public class ArraList {
    public static void main(String[] args) {
        List<Integer> id=new ArrayList<>();

        id.add(001);
        id.add(002);
        id.add(003);
        id.add(003);

        System.out.println(id);
        // System.out.println(id.size());
        // System.out.println(id.contains(001));
        System.out.println("ID is: "+id.get(0));

        for (Integer ID : id) {
            System.out.println(ID);
        }



    }
}
