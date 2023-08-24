package LinkedList;
import java.util.*;

public class linkedList1 {
    public static void main(String[] args) {
        //create an empty linedlist
        LinkedList<String>list=new LinkedList<String>();

        //operations on linkedlist
        list.addFirst("is");
        list.addLast("a");
        System.out.println(list);

        System.out.println("Size is: "+list.size());

        list.addFirst("this");
        //list.addLast("list");
        list.add("list"); //NOTE: By default add method add data in last, so 'addLast' and 'add' are same
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        
            System.out.println("null");
        

         System.out.println(list.size()); //NOTE: null value can't  be calculated in size method

        list.removeFirst(); //It delete the data of first node
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println("------------------");
        list.remove(1); //It remove spcific node data
        System.out.println(list);
    
    
        }
         
}
