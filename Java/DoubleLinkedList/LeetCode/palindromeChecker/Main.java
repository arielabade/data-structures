package Java.DoubleLinkedList.LeetCode.palindromeChecker;

public class Main {

    public static void main(String[] args) {

        
        DoublyLinkedList palindromeList1 = new DoublyLinkedList(1);
        palindromeList1.append(2);
        palindromeList1.append(3);
        palindromeList1.append(2);
        palindromeList1.append(1);

        System.out.println("List 1:");
        palindromeList1.printAll();
        System.out.println("Is palindrome" + palindromeList1.isPalindrome());

        DoublyLinkedList palindromeList2 = new DoublyLinkedList(1);
        palindromeList2.append(2);
        palindromeList2.append(3);
        palindromeList2.append(3);
        palindromeList2.append(2);
        palindromeList2.append(1);

        System.out.println("\nList 2");
        palindromeList2.printAll();
        System.out.println("Is palindrome" + palindromeList2.isPalindrome());

        DoublyLinkedList nonPalindromeList = new DoublyLinkedList(1);
        nonPalindromeList.append(2);
        nonPalindromeList.append(3);
        nonPalindromeList.append(4);
        nonPalindromeList.append(5);

        System.out.println("\nList 3");
        nonPalindromeList.printAll();
        System.out.println("Is palindrome" + nonPalindromeList.isPalindrome());
    }
}
