
package Java.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();

        System.out.println("--------------------------------------");


        //Reverse 

        myLinkedList.reverse();
        myLinkedList.printList(); //ok


        /* 
        myLinkedList.remove(2);

        myLinkedList.printList();



        /* 
        //Insert test
        System.out.println("--------------------------------------");

        myLinkedList.insert(1,333); //ok, pointer working just right
        myLinkedList.printList();

        
        /* 

        //Set value at index

        myLinkedList.set(0, 32); //good

        myLinkedList.printList();

        //Search by index

        /* 

        System.out.println(myLinkedList.get(2).value + "\n");

        myLinkedList.printList();



        //Remove first demonstration

        /* 

        System.out.println(myLinkedList.removeFrist().value);
        System.out.println(myLinkedList.removeFrist().value);
        System.out.println(myLinkedList.removeFrist());

        /* 
        myLinkedList.append(3);
        myLinkedList.printList();

        System.out.println("Separe");
        myLinkedList.prepend(1);
        myLinkedList.printList();
      
        /* 
        //Append test

        //Prepend test

        //Generalized remove

        myLinkedList.remove(2);

        //Remove last

        System.out.println(myLinkedList.removeLast()); 
        myLinkedList.printList();
        System.out.println(myLinkedList.removeLast());

        //Remove first

     
        
        //Insert test

        //Search test

        myLinkedList.append(4);
        myLinkedList.printList();

 */
        
        
    

    }

}