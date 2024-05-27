package Java.DoubleLinkedList.Code;

public class Main {
    public static void main(String[] args) {

    DoubleLinkedList myDDL = new DoubleLinkedList(7); //the same resourcers that were evaluated before

    myDDL.append((2));
    myDDL.append((3));
    myDDL.printList();
    myDDL.removeFirst();
    
    System.out.println(("----------------------"));
    myDDL.printList();
 

    }
    
}
