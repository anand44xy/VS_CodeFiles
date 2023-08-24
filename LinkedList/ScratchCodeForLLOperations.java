/* #scratch_code for linkedlist operations
 *
 *  Operation on LinkedList: 1. add/insert data
 *                          2. print
 *                          3. delete
 *                          4. check size
 */
package LinkedList;


    public class ScratchCodeForLLOperations {
       private int size;

       ScratchCodeForLLOperations(){ //constructor
        this.size=0;
       }

       Node head; //Define head of thi linkedlist

    class Node {  //Define Node class for LinkedLis
        String data; 
        Node next;

        Node(String data) { //Constructor
            this.data = data;
            this.next = null;
            size++; // Incrementing size when a new node is created
        }
    }
   
    //-------------------------Add/Insertion Operation--------------------------------
    
    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) { //If list is empty
            head = newNode;
            return;
        }

        newNode.next = head; //If list is not empty
        head = newNode;
    }
    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        //Travrse
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
            currNode.next = newNode; //If last node is fount then make it newNode, and null is automatically found.
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
            System.out.println("NULL");
    }

    //------------------------Delete Operation------------------------------
     
    // Delete First
    public void deleteFirst(){
      //If head is null
      if (head==null) { //Corner Case: Special case, differ from all other cases
        System.out.println("list is empty");
        return;
      }
        size--;
        //In case if head is not null
        head=head.next; // This line delete first
    }

    //Delete Last
    public void deleteLast(){
      if (head==null) { // 1.corner case
         System.out.println("The list is empty");
         return;
      }
      //size--
      if(head.next==null){ // 2.corner case
        head=null;
        return;
      }
      
      //travrse
      Node secondLast=head;
      Node lastNode=head.next;
      while (lastNode.next!=null) {
        secondLast=secondLast.next;
        lastNode=lastNode.next;
      }
        secondLast.next=null; //as second last node is found then it make null
    }
     
     public int getSize(){
        return size;
     }

    public static void main(String[] args) {
        ScratchCodeForLLOperations list = new ScratchCodeForLLOperations();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();;

        list.addLast("list");
        list.printList();;

        list.addFirst("this");
        list.printList();;

        list.deleteFirst();
        list.printList();;

        list.deleteLast();
        list.printList();;

        System.out.println(list.getSize()); //NOTE: Here is an errer that is get.size count the Null value also
        
      
    }
}