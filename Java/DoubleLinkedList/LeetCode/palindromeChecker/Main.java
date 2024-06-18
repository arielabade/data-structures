package Java.DoubleLinkedList.LeetCode.palindromeChecker;

public class Main {

    public static void main(String[] args) {

        // Caso de teste para isPalindrome
        DoublyLinkedList palindromeList1 = new DoublyLinkedList(1);
        palindromeList1.append(2);
        palindromeList1.append(3);
        palindromeList1.append(2);
        palindromeList1.append(1);

        System.out.println("Lista 1:");
        palindromeList1.printAll();
        System.out.println("É um palíndromo? " + palindromeList1.isPalindrome());

        DoublyLinkedList palindromeList2 = new DoublyLinkedList(1);
        palindromeList2.append(2);
        palindromeList2.append(3);
        palindromeList2.append(3);
        palindromeList2.append(2);
        palindromeList2.append(1);

        System.out.println("\nLista 2:");
        palindromeList2.printAll();
        System.out.println("É um palíndromo? " + palindromeList2.isPalindrome());

        DoublyLinkedList nonPalindromeList = new DoublyLinkedList(1);
        nonPalindromeList.append(2);
        nonPalindromeList.append(3);
        nonPalindromeList.append(4);
        nonPalindromeList.append(5);

        System.out.println("\nLista 3:");
        nonPalindromeList.printAll();
        System.out.println("É um palíndromo? " + nonPalindromeList.isPalindrome());
    }
}
