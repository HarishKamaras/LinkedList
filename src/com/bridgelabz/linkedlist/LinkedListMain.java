package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        System.out.println("After Adding the data : ");
        linkedList.display();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        System.out.println();
        System.out.println("After Appending the data : ");
        linkedList1.display();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(70);
        System.out.println();
        System.out.println("Before insert: ");
        linkedList2.display();
        linkedList2.insertBetween(30);
        System.out.println();
        System.out.println("After insert: ");
        linkedList2.display();
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(70);
        linkedList3.add(30);
        linkedList3.add(56);
        System.out.println();
        System.out.println("Before Pop: ");
        linkedList3.display();
        linkedList3.pop();
        System.out.println();
        System.out.println("After Pop: ");
        linkedList3.display();
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.add(70);
        linkedList4.add(30);
        linkedList4.add(56);
        System.out.println();
        System.out.println("Before PopLast: ");
        linkedList4.display();
        linkedList4.popLast();
        System.out.println();
        System.out.println("After PopLast: ");
        linkedList4.display();
        LinkedList<Integer> linkedList5 = new LinkedList<>();
        linkedList5.add(70);
        linkedList5.add(30);
        linkedList5.add(56);
        System.out.println();
        if (linkedList3.search(30) == true) {
            System.out.println("the given data is present ");
        } else System.out.println("the given data not present");

        LinkedList<Integer> linkedList6 = new LinkedList<>();
        linkedList6.add(70);
        linkedList6.add(30);
        linkedList6.add(56);
        System.out.println();
        linkedList6.insertAfter(30,40);
        System.out.println("Inserting 40 after 30: ");
        linkedList6.display();
    }
}
